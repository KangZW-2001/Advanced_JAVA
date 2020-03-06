package lab1;

public class Kingston extends Storage{

	public Kingston() {
		// TODO Auto-generated constructor stub
		name = "None";
		volume = 0;
		price = 0;
	}
	
	public Kingston(String name, int volume, int price) {
		super.name = name;
		super.price = price;
		super.volume = volume;
	}
	
	

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public int getVolume() {
		// TODO Auto-generated method stub
		return volume;
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
