package fa.training.abstraction;

public abstract class HinhTuGiac {

	public double canh1, canh2, canh3, canh4;
	
	private double tinhDienTich() {
		// một method ko có implement 
		return 0;
	}

	public abstract void test();
	
	public HinhTuGiac(double canh1, double canh2, double canh3, double canh4) {
		super();
		this.canh1 = canh1;
		this.canh2 = canh2;
		this.canh3 = canh3;
		this.canh4 = canh4;
	}
	
}

