package Lab4;

public class Serial {
	private MatrixGenerator matrix1;
	private MatrixGenerator matrix2;;
	private double[][] data1;
	private double[][] data2;
	private int resRow;
	private int resCol;
	private double[][] dataSerialRes;
	private int middleNum;
	
	public Serial() {
		matrix1 = new MatrixGenerator();
		matrix2 = new MatrixGenerator(matrix1.getColNumber());
		resRow = matrix1.getRowNumber();
		resCol = matrix2.getColNumber();
		dataSerialRes = new double[resRow][resCol];
		middleNum = matrix1.getColNumber();
		data1 = matrix1.getData();	
		data2 = matrix2.getData();
	}
	
	public void f() {
		long timeBegin = System.currentTimeMillis();
		for(int i = 0;i < resRow;i++) {
			for(int j = 0;j < resCol;j++) {
				dataSerialRes[i][j] = 0;
				for(int k = 0;k < middleNum;k++) {
					dataSerialRes[i][j] += data1[i][k]*data2[k][j];					
				}
			}
		}		
		long timeEnd = System.currentTimeMillis();
		System.out.println("串行 计算的时间为: "+(timeEnd-timeBegin));
	}
	
	public double[][] getData1(){
		return data1;
	}
	
	public double[][] getData2(){
		return data2;
	}
	public int getRowRes() {
		return resRow;
	}
	public int getColRes() {
		return resCol;
	}
	public int getMiddle() {
		return middleNum;
	}
	public double[][] getSerialRes(){
		return dataSerialRes;
	}
	
}
