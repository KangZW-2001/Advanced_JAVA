package lab1;

public class Factory{
	
	public static CPU makeCPU(String brand, String name, int coreNum, int price) {
		if("Intel".equals(brand)) {
			return new Intel(name,coreNum,price);
		}
		else if ("AMD".equals(brand)) {
			return new AMD(name,coreNum,price);
		}
		return null;
	}

	public static Storage makeStorage(String brand, String name, int volume, int price) {
		if("Samsung".equals(brand)) {
			return new Samsung(name,volume,price);
		}
		else if("Kingston".equals(brand)) {
			return new Kingston(name,volume,price);
		}
		return null;
	}

	public static HardDisk makeHardDisk(String brand, String name, int volume, int price) {
		if("WestDigitals".equals(brand)) {
			return new WestDigitals(name,volume,price);
		}else if("Seagate".equals(brand)) {
			return new Seagate(name,volume,price);
		}
		return null;
	}

	public static MainBoard makeMainBoard(String brand, String name, String speed, int price) {
		if("Asus".equals(brand)) {
			return new Asus(name,speed,price);
		}else if ("Gigabyte".equals(brand)) {
			return new Gigabyte(name,speed,price);
		}
		return null;
	}

	public static Computer makeComputer(String name ,CPU cpu, HardDisk harddisk,MainBoard mainboard,Storage storage) {
		return new Computer(name,cpu,harddisk,mainboard,storage);
	}

	public static ComputerStore makeComputerStore(Computer c1, Computer c2, Computer c3) {
		return new ComputerStore(c1,c2,c3);
	}
	
	

}
