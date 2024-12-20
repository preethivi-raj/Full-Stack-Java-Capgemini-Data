package Collections;

class Person implements Comparable<Person>{
	private int Age;
	private String name;
	public Person(int age, String name) {
		super();
		Age = age;
		this.name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Person [Age=" + Age + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Person o) {
		if(this.Age==o.Age)
			return 0;
		else
			return this.Age>o.Age?1:-1;
	}
	
	
}
public class ComparatorExample  {
public static void main(String[] args) {
	Person p1=new Person(21,"abc");
	Person p2=new Person(22,"xyz");
	int agediff=p1.compareTo(p2);
	switch(agediff) {
	case -1:
	{
		System.out.println(p2.getName()+" is older than "+p1.getName());
		break;
	}
	case 1:
	{
		System.out.println(p1.getName()+" is older than "+p2.getName());
		break;
	}
	default:
		System.out.println(p1.getName()+ "is same as"+p2.getName());
		
	}
	
}
 
 
}
