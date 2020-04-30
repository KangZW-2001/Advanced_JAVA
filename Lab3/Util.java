package Lab3;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import Lab3.Column;
import Lab3.Table;
import Lab3.User;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Util implements SqlUtil{
	//获得表的名字
	String getTableName(User user) {
		//1.获得类对象
		Class<?> c = user.getClass();
		//2.判断是否含有Table注解
		boolean flag1 = c.isAnnotationPresent(Table.class);
		if(flag1) {
			//3.如果有的话，取出Table注解的值
			Table table = (Table)c.getAnnotation(Table.class);
			return table.value();
		}
		return null;
	}
	
	//获得每一个属性在表中的字段名字
	HashMap<String, String> getNameInTable(User user){
		HashMap<String, String> map = new HashMap<>();
		//1.取得类对象
		Class<?> c = user.getClass();
		//2.取得类对象中的所有属性
		Field[] fields = c.getDeclaredFields();
		for(Field field : fields) {
			//3.判断该属性是否含有Column注解
			if(field.isAnnotationPresent(Column.class)) {
				Column column = field.getAnnotation(Column.class);
				//4.如果该属性含有Column注解，则将属性值和Column值放入map中
				map.put(field.getName(), column.value());
			}
		}
		return map;
	}

	//将传入字符串第一个字母变成大写
	String getFirstUpper(String str) {
		return str.substring(0,1).toUpperCase()+str.substring(1);
	}
	
	//获得数据库中每一个字段对应的值
	//NULL 表示该属性没有值
	Map<String,String> getValues(User user){
		Map<String, String> map = new HashMap<>();
		Map<String,String> fieldToSql = getNameInTable(user);
		//1.获得类对象
		Class<?> c = user.getClass();
		//2.取得所有的属性
		Field[] fields = c.getDeclaredFields();
		for(Field field : fields) {
			Method getValue = null;
			try {
				//3.获取每一个属性的get函数
				getValue = c.getMethod("get"+getFirstUpper(field.getName()));
				if(getValue.invoke(user) == null) {
					map.put(fieldToSql.get(field.getName()),"NULL");
				}
				else {
					map.put(fieldToSql.get(field.getName()), getValue.invoke(user).toString());
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
		return map;
	}

	@Override
	public String query(User user) throws Exception{
		String tableName = getTableName(user);
		Map<String,String> fieldToSql = getNameInTable(user);
		Map<String,String> sqlValue = getValues(user);
		Class<?> c = user.getClass();
		Field[] fields = c.getDeclaredFields();
		String result1,result2;
		result1 = result2 = "";
		for(Field field: fields) {
			String values = sqlValue.get(fieldToSql.get(field.getName()));
			if(!values.equals("NULL")&&!values.equals("0")) {
				if(field.getName().equals("id"))
					result2+=field.getName()+" = "+values;
				else if(field.getName().equals("age")) 
					result2+=field.getName()+" = "+values;
				else 
					result2+= field.getName()+" LIKE "+values;
				result2 += " AND ";
			}
		}
		result1 += "SELECT * FROM "+tableName +" WHERE ";
		return result1 +result2.substring(0,result2.length()-5);
	}

	@Override
	public String insert(User user) throws Exception {
		// TODO Auto-generated method stub
		Map<String,String> fieldToSql = getNameInTable(user);
		Map<String,String> sqlValue = getValues(user);
		Class<?> c = user.getClass();
		Field[] fields = c.getDeclaredFields();
		String result1,result2,result3;
		result1 = result2 = result3 = "";
		for(Field field: fields) {
			String name = field.getName();
			if(!name.equals("id")) {
				result2 += ", " + fieldToSql.get(field.getName());
				result3 += ", " + sqlValue.get(fieldToSql.get(field.getName()));
			}
		}
		result1 += "INSERT INTO "+getTableName(user)+" ("+result2.substring(2)+
				") VALUES ("+result3.substring(2)+")";
		return result1;
	}

	@Override
	public String insert(List<User> users) {
		// TODO Auto-generated method stub
		if(!users.isEmpty()) {
			String tableName = "";
			int number = users.size();
			String res1 = "";
			String result[] = new String[number];
			for(int i =0; i < number; i++)
				result[i] = "";
			for(int i = 0; i < number; i++) {
				User user = users.get(i);
				Map<String,String> fieldToSql = getNameInTable(user);
				Map<String,String> sqlValue = getValues(user);
				Field[] fields = user.getClass().getDeclaredFields();
				for(Field field:fields) {
					String name = field.getName();
					if(!name.equals("id")) {
						if(i == 0) {
							res1 += ", " + fieldToSql.get(field.getName());
							tableName = getTableName(user);
						}
						result[i] += ", " + sqlValue.get(fieldToSql.get(field.getName()));
					}
				}
			}
			String res2 = "INSERT INTO "+tableName+" ("+res1.substring(2)+") VALUES ";
			for(int i =0; i< number;i++) {
				res2+="("+ result[i].substring(2)+"), ";
			}
			int length = res2.length();
			return res2.substring(0, length-2);
		}
		return null;
	}

	@Override
	public String update(User user) throws Exception{
		// TODO Auto-generated method stub
		String tableName = getTableName(user);
		String res1,res2,res3;
		res1 = res2 = res3 = "";
		Map<String,String> fieldToSql = getNameInTable(user);
		Map<String,String> sqlValue = getValues(user);
		Class<?> c = user.getClass();
		Field[] fields = c.getDeclaredFields();
		for(Field field:fields) {
			String value = sqlValue.get(fieldToSql.get(field.getName()));
			if(!value.equals("NULL") && !value.equals("0")) {
				String name = field.getName();
				if(name.equals("id"))res3 += name+" = "+value;
				else res2+=name+" = "+value + ","; 
			}
		}
		res1 += "UPDATE "+tableName+" SET "+res2.substring(0,res2.length()-1)+" WHERE "+
				res3;
		return res1;
	}
	
	@Override
	public String delete(User user) {
		// TODO Auto-generated method stub
		String tableName = getTableName(user);
		Map<String,String> fieldToSql = getNameInTable(user);
		Map<String,String> sqlValue = getValues(user);
		Class<?> c = user.getClass();
		Field[] fields = c.getDeclaredFields();
		String result2 = "";
		for(Field field:fields) {
			String value = sqlValue.get(fieldToSql.get(field.getName()));
			if(!value.equals("NULL") && !value.equals("0")) {
				if(field.getName().equals("id"))
					result2+=field.getName()+" = "+value;
				else if(field.getName().equals("age")) 
					result2+=field.getName()+" = "+value;
				else 
					result2+= field.getName()+" LIKE "+value;
				result2 += " AND ";
			}
		}
		return "DELETE FROM "+tableName+" WHERE "+result2.substring(0,result2.length()-5);
	}
}
