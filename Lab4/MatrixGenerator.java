package Lab4;

public class MatrixGenerator {
	private int rowNumber;
	private int colNumber;
	private double [][] data;
	
	//随机生成一个2000*2000以内的矩阵，并且其中的数字也是2000以内
	public MatrixGenerator() {
		// TODO Auto-generated constructor stub
		rowNumber = (int)(Math.random()*2000);
		colNumber = (int)(Math.random()*2000);
		data = new double[rowNumber][colNumber];
		
		System.out.println("随机生成了 "+rowNumber+" 行 "+colNumber+" 列的martix1");
		for(int i = 0;i < rowNumber;i++) {
			for(int j = 0; j < colNumber; j++) {
				data[i][j] = Math.random()*100;
			}
			
		}
	}
	
	public MatrixGenerator(int rowNumber) {
		// TODO Auto-generated constructor stub
		this.rowNumber = rowNumber;
		colNumber = (int)(Math.random()*2000);
		data = new double[rowNumber][colNumber];
		System.out.println("随机生成了 "+rowNumber+" 行 "+colNumber+" 列的martix2");
		for(int i = 0;i < rowNumber;i++) {
			for(int j = 0; j < colNumber; j++) {
				data[i][j] = Math.random()*100;
			}
		}
	}

	public int getRowNumber() {
		return rowNumber;
	}

	public int getColNumber() {
		return colNumber;
	}

	public double[][] getData() {
		return data;
	}
	
}
