package lab1;

public class WestDigitals extends HardDisk{

	public WestDigitals() {
		// TODO Auto-generated constructor stub
	}
	
	public WestDigitals(String name, int volume, int price) {
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
