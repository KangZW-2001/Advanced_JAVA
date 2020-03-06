package lab1;

public abstract class Storage implements Workable, Nameable, Volumeable, Priceable{

	public String name;
	public int volume;
	public int price;
	
	public Storage() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void work() {
		System.out.print("Storage work");
	}
	
	@Override
	public abstract String getName();
	
	@Override
	public abstract int getVolume();
	
	@Override
	public abstract int getPrice();
	
	@Override
	public abstract void setPrice(int newPrice);
	
}
