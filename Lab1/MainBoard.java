package Lab1;

public abstract class MainBoard implements Workable, Nameable, Speedable, Priceable{

	public String name;
	public int price;
	public String speed;
	
	public MainBoard() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void work() {
		System.out.print("MainBoard work");
	}
	
	@Override	
	public abstract String getName();
	
	@Override	
	public abstract String getSpeed();
	
	@Override	
	public abstract int getPrice();
	
	@Override
	public abstract void setPrice(int newPrice);
}
