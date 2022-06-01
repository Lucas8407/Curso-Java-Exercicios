package entities;

public class Student 
{

	public String name;
	public double n1;
	public double n2;
	public double n3;
	
	
	public double lastGrade () 
	{
		return n1 + n2 + n3;
		
	}
	
	
	
	public void result() 
	{
		if (lastGrade() >= 60) {
			System.out.printf("FINAL GRADE: %.2f\n", lastGrade());
			System.out.println("PASS");}
		else 
		{
			System.out.printf("FINAL GRADE: %.2f\n", lastGrade());
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", missingPoints());
		}
			
	}
	
	
	public double missingPoints() {
		
		return 60.00 - lastGrade();
	}
	
}
