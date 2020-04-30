package Lab1;

public class ComputerStore {
	private Computer computer1;
	private Computer computer2;
	private Computer computer3;
	
	public ComputerStore() {
		// TODO Auto-generated constructor stub
	}
	
	public ComputerStore(Computer com1,Computer com2,Computer com3) {
		computer1 = com1;
		computer2 = com2;
		computer3 = com3;
	}
	
	public void print(Computer computer) {
		System.out.println(computer.getName());
		System.out.println("  CPU: " + " name:" + computer.getCPU().getName() + " coreNum:" + computer.getCPU().getCoreNum());
		System.out.println("  Storage: " + " name:"  + computer.getStorage().getName() + " volume:" + computer.getStorage().getVolume()+"G");
		System.out.println("  HardDisk: " + " name:"  + computer.getHardDisk().getName() + " volume:" + computer.getHardDisk().getVolume()+"T");
		System.out.println("  MainBoard: " + " name:"  + computer.getMainBoard().getName() + " speed:" + computer.getMainBoard().getSpeed());
		System.out.println("  Price: " + computer.getPrice());
		
	}
	
	public void getOverTable() {
		print(computer1);
		System.out.println("------------------------------------------------------");
		print(computer2);
		System.out.println("------------------------------------------------------");
		print(computer3);
	}

}
