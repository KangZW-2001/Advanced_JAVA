package Lab4;

public class MainClass {
	public static void main(String args[]) throws InterruptedException {
			
		for(int i = 0;i < 4;i++) {
			System.out.println("第"+(i+1)+"次实验");
			Serial serial = new Serial();
			serial.f();
			
			double [][] serialRes = serial.getSerialRes();
			
			
			Concurrency c1 = new Concurrency(serial, 0);
			Concurrency c2 = new Concurrency(serial, 1);
			
			
			
			Thread t1 = new Thread(c1);
			Thread t2 = new Thread(c2);
			
			long begin = System.currentTimeMillis();
			t1.start();
			t2.start();
			
			//防止main线程抢先输出结果，如果线程1、2还存活main就睡眠
			while(t1.isAlive() || t2.isAlive()) {
				Thread.sleep(1);
			}
			System.out.println("并行计算的时间"+(System.currentTimeMillis()-begin));			
			
		}
		
		
	}
	
	
}
