package lab1;

public class Asus extends MainBoard{

	public Asus() {
		// TODO Auto-generated constructor stub
	}
	
	public Asus(String name, String speed, int price) {
		this.name = name;
		this.speed = speed;
		this.price = price;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Asus";
	}

	@Override
	public String getSpeed() {
		// TODO Auto-generated method stub
		return speed;
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return price;
	}

	@Override
	public void setPrice(int newPrice) {
		this.price = newPrice;
	}
}
