package lab1;

public abstract class HardDisk implements Workable, Nameable, Volumeable, Priceable{

	public String name;
	public int volume;
	public int price;
	
	public HardDisk() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void work() {
		System.out.print("HardDisk work");
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
