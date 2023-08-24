package problem1.management;

import problem1.entities.SkillList;

public class SkillManagment {

	public static void main(String[] args) {
		
		SkillList skillList = new SkillList();
		skillList.display();
		
	
		System.out.println(skillList.getHead(2));
		System.out.println(skillList.getHead(7));
		
		System.out.println(" Xóa phần tử : ");
		System.out.println(skillList.remove("AI"));
		System.out.println(skillList.remove("Java"));
		
		System.out.println(" Update phần tử ");
		skillList.update(4, "React");
		
		
		System.out.println(" Sau khi update ");
		skillList.display();
		
		
	}

}
