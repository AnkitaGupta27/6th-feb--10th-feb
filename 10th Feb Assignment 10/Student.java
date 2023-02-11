package org.antwalk;

public class Student {

	String name;
	int engMarks;
	int hindiMarks;
	int MathsMarks;

	public void avgMark() {
		int total=engMarks+hindiMarks+MathsMarks;
		int avg= total/3;
		System.out.println("Average Marks are: "+avg);
	}

	public void showResult() {
		System.out.println("Marks of English is: "+engMarks);
		System.out.println("Marks of Maths is: "+hindiMarks);
		System.out.println("Marks of Hindi is: "+MathsMarks);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEngMarks() {
		return engMarks;
	}

	public void setEngMarks(int engMarks) {
		this.engMarks = engMarks;
	}

	public int getHindiMarks() {
		return hindiMarks;
	}

	public void setHindiMarks(int hindiMarks) {
		this.hindiMarks = hindiMarks;
	}

	public int getMathsMarks() {
		return MathsMarks;
	}

	public void setMathsMarks(int MathsMarks) {
		this.MathsMarks = MathsMarks;
	}

}
