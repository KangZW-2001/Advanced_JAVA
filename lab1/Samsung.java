package lab1;

public class Samsung extends Storage{

	public Samsung() {
		// TODO Auto-generated constructor stub
		this.name = "None";
		this.volume = 0;
		this.price = 0;
	}
	
	public Samsung(String name, int volume, int price) {
		this.name = name;
		this.volume = volume;
		this.price = price;
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
