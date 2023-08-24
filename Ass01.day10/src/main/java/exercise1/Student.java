package exercise1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;

@XmlRootElement(name="student")
@XmlAccessorType(XmlAccessType.FIELD)
public class Student {
	
	@XmlTransient
	private String nodeName;
	@XmlElement
	private String name;
	@XmlElement
	private int age;
	@XmlElement
	private String subject;
	@XmlElement
	private boolean gender;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String nodeName, String name, int age, String subject, boolean gender) {
		super();
		this.nodeName = nodeName;
		this.name = name;
		this.age = age;
		this.subject = subject;
		this.gender = gender;
	}
	public String getNodeName() {
		return nodeName;
	}
	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	
	
}
