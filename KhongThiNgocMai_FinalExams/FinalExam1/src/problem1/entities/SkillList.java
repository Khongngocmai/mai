package problem1.entities;

import java.util.ArrayList;

public class SkillList {

	ArrayList<String> skills = new ArrayList<>(); 

	public SkillList() {
	
		skills.add("Java");
		skills.add(".Net");
		skills.add("Androi");
		skills.add("NodeJS");
		skills.add(".Net");
		skills.add("Angular");
		skills.add("AI");
		
		
	}
	
	public void display() {
		System.out.println(skills);
	}
		
	public String getHead(int position) {
		if(position <0 || position >= skills.size() || skills.isEmpty()) {
			 return "Null";
		}
		return skills.get(position);
		
	}
	public boolean remove(String skill) {
		
		return skills.remove(skill);
		
	}
	public void update(int index, String skillNew) {
		if(index >=0 && index <skills.size()) {
			skills.set(index, skillNew);
		}
	}
}
