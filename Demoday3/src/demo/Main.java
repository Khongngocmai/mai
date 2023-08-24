package demo;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Student[] students = new Student[1000];
		do {
			
			System.out.println("Nhap name: ");
			String name = sc.nextLine();
			System.out.println("Nhap age: ");
			int age = Integer.parseInt(sc.nextLine());
			System.out.println("Nhap diemToan: ");
			double diemToan = Integer.parseInt(sc.nextLine());
			System.out.println("Nhap diemVan: ");
			double diemVan = Integer.parseInt(sc.nextLine());
			System.out.println("Nhap diemAnh: ");
			double diemAnh = Integer.parseInt(sc.nextLine());
			
			students[Student.count++]= new Student(name, age , false, diemToan , diemVan, diemAnh );
			
			System.out.println("Continue(y/n)?");
			String check = sc.nextLine();
			
			if (check.equalsIgnoreCase("y")) {
				break;
			}
		}while(true);
		
		System.out.println(Arrays.toString(students));
		System.out.println("\nThông tin của học sinh đã nhập:");
        for (int i = 0; i < Student.count;i++) {
            System.out.println("Tên: " + students[i].name);
            System.out.println("Tuổi: " + students[i].age);
            System.out.println("Giới tính: " + students[i].sex);
            System.out.println("Điểm Toán: " + students[i].diemToan);
            System.out.println("Điểm Văn: " + students[i].diemVan);
            System.out.println("Điểm Anh: " + students[i].diemAnh);
            System.out.println("Điểm Trung bình: " + students[i].diemTrungBinh());
            System.out.println("Xếp loại học lực: " + students[i].xepLoai());
        }
        System.out.println("học sinh có học lực khá trở lên ");
        for(int i=0;i<Student.count;i++) {
        	if (students[i].xepLoai().equals("Khá")) {
                System.out.println("Tên: " + students[i].name);
                System.out.println("Điểm Trung bình: " + students[i].diemTrungBinh());
            }
        }
		sc.close();
		
	}

}
