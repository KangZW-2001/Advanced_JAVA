package lab1;

public class Intel extends CPU{
	
	public Intel() {
		// TODO Auto-generated constructor stub
		super.name = "None";
		super.coreNum = 0;
		super.price = 0;
	}
	
	public Intel(String name, int coreNum, int price) {
		super.name = name;
		super.coreNum = coreNum;
		super.price = price;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public int getCoreNum() {
		// TODO Auto-generated method stub
		return coreNum;
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
