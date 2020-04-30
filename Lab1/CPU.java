package Lab1;

public abstract class CPU implements Workable, Nameable, CoreNumable, Priceable{

	public int coreNum;
	public int price;
	protected String name;
	
	
	public CPU() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void work() {
		System.out.print("CPU work");
	}
	
	@Override	
	public abstract String getName();
	
	@Override
	public abstract int getCoreNum();
	
	@Override
	public abstract int getPrice();
	
	@Override
	public abstract void setPrice(int newPrice);

}
