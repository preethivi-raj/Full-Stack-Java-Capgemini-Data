package Collections;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

class Technology{
	private String name;
	private int yearOfIntro;
	public Technology(String name, int yearOfIntro) {
		super();
		this.name = name;
		this.yearOfIntro = yearOfIntro;
	}
	public String getName() {
		return name;
	}
	public int getYearOfIntro() {
		return yearOfIntro;
	}
	@Override
	public String toString() {
		return "Technology [name=" + name + ", yearOfIntro=" + yearOfIntro + "]";
	}
	
}
class TechnologyStack{
	private NavigableMap<Integer, Technology> tech;

	public TechnologyStack() {
		super();
		// TODO Auto-generated constructor stub
		tech = new TreeMap<Integer, Technology>();
	}
	public void addTech(int year , String name ) {
	    Technology technology = new Technology(name, year);
        tech.put(year, technology);
	}
	public void displayTech() { 
		for (Map.Entry<Integer, Technology> entry : tech.entrySet()) {
        System.out.println(entry.getValue());
    }}
	public void getTechBeforeYear(int year) {
		  Map.Entry<Integer, Technology> entry = tech.lowerEntry(year);
	        if (entry != null) {
	            System.out.println("Technology before " + year + ": " + entry.getValue());
	        } else {
	            System.out.println("No technology found before " + year);
	        }
	}
	public void getTechAftereYear(int year) {
		 Map.Entry<Integer, Technology> entry = tech.higherEntry(year);
	        if (entry != null) {
	            System.out.println("Technology after " + year + ": " + entry.getValue());
	        } else {
	            System.out.println("No technology found after " + year);
	        }
	}
	public void getTechCeilling(int year) {
		Map.Entry<Integer, Technology> entry = tech.ceilingEntry(year);
		if(entry != null) {
			System.out.println("technology introduced on or after "+ year+" :"+ entry.getValue());
		}else {
			System.out.println("No Technology found on or after "+ year );
		}
		
		
		
	}
	public void getTechFloor(int year) {
		Map.Entry<Integer, Technology> entry = tech.floorEntry(year);
		if(entry != null) {
			System.out.println("technolofy Intoduced on or before "+year +" :"+entry.getValue());
		}else {
			System.out.println("No Technology found on or before "+ year );
		}
	}
	
}

public class TreeMap_NavigableMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 TechnologyStack st = new TechnologyStack();
 st.addTech(1991, "Linux");
 st.addTech(1995, "Java");
 st.addTech(1998, "Servlet");
 st.addTech(2000, "SpringBoot");
 st.addTech(2002, "bluethooth");
 st.addTech(2005, "Wifi");
 st.addTech(2010, "AI");
 
 System.out.println(" All Technolgy in the stack : ");
 st.displayTech();
 
 st.getTechBeforeYear(2002);
 st.getTechAftereYear(2003);
 st.getTechCeilling(2005);
 st.getTechFloor(2005);
 
 
 
	}

}
