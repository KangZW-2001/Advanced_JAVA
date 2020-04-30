package Lab4;


public class Concurrency implements Runnable{
	private Serial m;
	private int startRow;
	private double[][] data1;
	private double[][] data2;
	private double[][] dataRes;

	public Concurrency(Serial m,int startRow) {
		this.m = m;
		data1 = m.getData1();
		data2 = m.getData2();	
		this.startRow = startRow;
		dataRes = new double[getRowNumber()][m.getColRes()];
		System.out.println("并行结果矩阵：将要生成"+getRowNumber()+"行"+m.getColRes()+"列的矩阵");
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
			int temp = startRow;
			for(int i = 0;i < getRowNumber();i++) {
				for(int j = 0;j < m.getColRes();j++) {
					dataRes[i][j] = 0;
					for(int k = 0;k < m.getMiddle();k++) {
						dataRes[i][j] += data1[temp][k]*data2[k][j]; 
					}
				}
			temp+=3;
		}					
	}
	
	
	private int getRowNumber() {
		if(m.getRowRes() % 2 ==0) {
			return m.getRowRes() / 2;
		}else { 
			if(startRow == 0) 
				return (m.getRowRes()/2) + 1;
			else 
				return m.getRowRes()/2;
		}
	}

	public double[][] getResult(){
		return dataRes;
	}
	public int getConNum() {
		return this.getConNum();
	}
}
