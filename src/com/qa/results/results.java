package com.qa.results;

public class results {
	public static int total;
	public static double percentage;
	public static double percentagephys;
	public static double percentagechem;
	public static double percentagebio;
	public static int passes;
	
	public static void main(String[] args) {

		System.out.println(revisitedResults(90, 90, 90));
	}


	public static String revisitedResults(int Phys, int Chem, int Bio) {
		
		total = Phys + Chem + Bio;
		percentage = total * 100 / 450;
		percentagephys = Phys * 100 / 150;
		percentagechem = Chem * 100 / 150;
		percentagebio = Bio * 100 / 150;
		String result;
		if (percentagephys < 60 || percentagechem < 60|| percentagebio < 60 ) {
			result = "You failed";
			return result;
		}
		
		else {
			result = "Physics: " + Phys + " Chemistry: " + Chem + " Biology: " + Bio + " Total: " + total;
			return result;
		}
		


	}

	
}
































//		resultsExam();
//		displayPercentage();

//	public static void resultsExam() {
	//	int Physics = 40;
		//int Chemistry = 40;
		//int Biology = 45;
		//total = Physics + Chemistry + Biology;
		//System.out.println("Physics: " + Physics);
		//System.out.println("Chemistry: " + Chemistry);
		//System.out.println("Biology: " + Biology);
		//System.out.println("total marks: " + total);
	//}
	
	
	
	//System.out.println("I\nam\na\nboy");