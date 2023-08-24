package demo;

public class Student {
	
	public String name;
	public double age;
	public boolean sex;
	public double diemToan;
	public double diemVan;
	public double diemAnh;
	
	public static int count;
	public Student() {
	}
	public Student(String name, double age, boolean sex, double diemToan, double diemVan, double diemAnh) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.diemToan = diemToan;
		this.diemVan = diemVan;
		this.diemAnh = diemAnh;
	}
	
	public double diemTrungBinh() {
		return (diemToan + diemVan + diemAnh)/3;
	}
	
	public String xepLoai() {
		double diemTB = diemTrungBinh();
		if(diemTB>8) {
			return "Giỏi";
		}else if(6.5<diemTB && diemTB<8) {
			return "Khá";
		}else {
			return "TB";
		}
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", sex=" + sex + ", diemToan=" + diemToan + ", diemVan="
				+ diemVan + ", diemAnh=" + diemAnh + "]";
	}
	
	public static int sum;
}
