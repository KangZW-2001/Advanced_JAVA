package Lab1;

public class Computer implements Priceable, Nameable{
	private CPU cpu;
	private HardDisk harddisk;
	private MainBoard mainboard;
	private Storage storage;
	private int price;
	private String name;
	

	public Computer() {
		// TODO Auto-generated constructor stub
	}
	
	public Computer(String n,CPU c, HardDisk hd, MainBoard m, Storage s) {
		this.name = n;
		this.cpu = c;
		this.harddisk = hd;
		this.mainboard = m;
		this.storage = s;
		this.price = cpu.getPrice()+harddisk.getPrice()+mainboard.getPrice()+storage.getPrice();
	}
	
	public CPU getCPU() {
		return cpu;
	}
	
	public HardDisk getHardDisk() {
		return harddisk;
	}
	
	public MainBoard getMainBoard() {
		return mainboard;
	}
	
	public Storage getStorage() {
		return storage; 
	}
	
	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return price;
	}

	@Override
	public void setPrice(int newPrice) {
		// TODO Auto-generated method stub
		this.price = newPrice;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	
	

}
