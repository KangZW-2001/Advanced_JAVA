package Lab1;

public class Seagate extends HardDisk{

	public Seagate() {
		// TODO Auto-generated constructor stub
		super.name = "None";
		super.volume = 0;
		super.price = 0; 
	}
	
	
	public Seagate(String name, int volume, int price) {
		super.name = name;
		super.volume = volume;
		super.price = price;
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
