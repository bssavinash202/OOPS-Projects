package Task1;

public class Person {
	private String name;
	private int age;
	private String email;
	
	public Person(String name, int age, String email) {
		setName(name);
		setAge(age);
		setEmail(email);
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getEmail() {
		return email;
	}
	public void setName(String name) {
		if(name=="") {
			this.name="name cannot be empty";
		}else {
			this.name=name;
		}
	}
	public void setAge(int age) {
		if(age>0&&age<=120) {
			this.age=age;
		}else {
			this.age=0;
		}
	}
	public void setEmail(String email) {
		if(email.indexOf('@')==-1) {
			this.email="Email is invalid";
		}else {
			this.email=email;
		}
	}
	public String toString() {
		return "{ Name: "+name+", Age: "+((age==0)?"Invalid age":age)+", email: "+email+" }";
	}
	
}
