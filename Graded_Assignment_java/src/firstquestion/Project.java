package firstquestion;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Project implements Serializable{
	
	String projectCode;
	String projectName;
	int projectStrength;
	Employee e;
	
	
	public Project(String projectCode, String projectName, int projectStrength) {
		super();
		this.projectCode = projectCode;
		this.projectName = projectName;
		this.projectStrength = projectStrength;
	}
	
	
	public Project(Employee e) {
		this.e=e;
	}


	public String getProjectCode() {
		return projectCode;
	}
	public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public int getProjectStrength() {
		return projectStrength;
	}
	public void setProjectStrength(int projectStrength) {
		this.projectStrength = projectStrength;
	}
	


	


	@Override
	public String toString() {
			
			return
					
					"Project [projectCode=" + projectCode + ", projectName=" + projectName + ", projectStrength="
					+ projectStrength + ", e=" + e + ", elist1=" + elist1 + ", elist2=" + elist2 + ", elist3=" + elist3
					+ ", map1=" + map1 + ", map2=" + map2 + ", map3=" + map3 + "]";
				
	}






	ArrayList<Employee> elist1 = new ArrayList<Employee>();
	ArrayList<Employee> elist2 = new ArrayList<Employee>();
	ArrayList<Employee> elist3 = new ArrayList<Employee>();
	
	Map <Project,ArrayList<Employee>> map1 = new HashMap<>();
	Map <Project,ArrayList<Employee>> map2 = new HashMap<>();
	Map <Project,ArrayList<Employee>> map3 = new HashMap<>();

	public void serializeProjectDetails(Map<Project, ArrayList<Employee>> map1) {
		
		System.out.println("Serialized Map of Project Successfully...");
		
	}
	
	public void printData() {
		//Project obj = new Project(e);
		System.out.println("Project "+ toString());
		//System.out.println(e.toString());
	}
}
