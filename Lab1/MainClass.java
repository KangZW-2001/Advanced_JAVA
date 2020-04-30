package Lab1;

public class MainClass {

	public static void main(String args[]) {
		
		CPU cpu1 = Factory.makeCPU("Intel","IntelCorei5-9400F",6,1179);		
		CPU cpu2 = Factory.makeCPU("AMD" ,"AMD-R53600X",6,1499);
		
		Storage storage1 = Factory.makeStorage("Samsung","Samsung-DDR4", 8, 309);
		Storage storage2 = Factory.makeStorage("Kingston","Kingston-DDR4", 8, 289);
		
		HardDisk harddisk1 = Factory.makeHardDisk("WestDigitals","WD10SPZX", 1, 299);
		HardDisk harddisk2 = Factory.makeHardDisk("Seagate","ST1000LM048", 1, 306);
		
		MainBoard mainboard1 = Factory.makeMainBoard("Asus","Asus-B365M-K", "Intel-B360", 549);
		MainBoard mainboard2 = Factory.makeMainBoard("Gigabyte","Gigabyte-Z270P-D3","IntelZ270" ,649);
		
		Computer computer1 = Factory.makeComputer("Computer1", cpu1,harddisk1,mainboard1, storage1);
		Computer computer2 = Factory.makeComputer("Computer2", cpu2,harddisk2,mainboard2, storage2);
		Computer computer3 = Factory.makeComputer("Computer3", cpu1,harddisk1,mainboard2, storage2);
		
		ComputerStore store1 = Factory.makeComputerStore(computer1, computer2, computer3);
		store1.getOverTable();
	}
	

}
