package testproject;

import java.util.Scanner;

public class ResumeFatin {

	public static void main(String[] args) {
	Scanner in =new Scanner(System.in);
	
    printName();
    printGender();
	printAge();
	printGrade();
	printgpa();
	printmarital();
	printcitizen();
	printaddress();
	printnumphone();
	printwork();
	printlanguage();
	printskills();
	printaward();
	
	}
	public static void printName() {
		Scanner in =new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		String name = in.nextLine();
		System.out.println("Your Name is " + name);
		System.out.println();
		
	}
	public static void printGender() {
	     Scanner in =new Scanner(System.in);
	     
	     System.out.print("Enter your gender: ");
	     char gender = in.next().charAt(0);
	     System.out.println("Your gender is " +gender);
	     System.out.println();
}
	public static void printAge() {
		Scanner in =new Scanner(System.in);
		
		System.out.print("Enter your age: ");
		int age = in.nextInt();
		System.out.println("age " + age);
		System.out.println();
		
	}
	public static void printGrade() {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter grade STIA113: " );
		String str = in.next();
		char grade = str.charAt(1);
		System.out.println("Your grade STIA113 is " + grade);
		System.out.println();
	}
	public static void printgpa() {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter GPA semester 1: ");
		float sem1 = in.nextFloat();
		System.out.print("Enter GPA semester 2: ");
		float sem2 = in.nextFloat();
		
		float sum = sem1 + sem2;
		float totalgpa = sum/2;
		
		System.out.println("CGPA for current semester is " + totalgpa);
		System.out.println();
	}
	public static void printmarital() {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter your marital status: ");
		String marital = in.nextLine();
		System.out.println("Your marital status is " + marital);
		System.out.println();
	}
	public static void printcitizen() {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter your citizen: ");
		String citizen = in.next();
		System.out.println("Your citizen is " + citizen);
		System.out.println();
		
	}
	public static void printaddress() {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter Address: " );
		String address = in.nextLine();
		System.out.println("Your address is " + address);
		System.out.println();
	}
	
	public static void printnumphone() {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter number phone: " );
		String phone = in.nextLine();
		System.out.println("Your number phone is " + phone);
		System.out.println();
		
	}
	public static void printwork() {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter your work experience: " );
		String work1 = in.nextLine();
		System.out.print("Enter your work experience: " );
		String work2 = in.nextLine();
		System.out.println("You had been work as " + work1 + " and " + work2);
		System.out.println();
	}
	public static void printlanguage() {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter your expert language: " );
		String lang1 = in.nextLine();
		System.out.print("Enter your expert language: " );
		String lang2 = in.nextLine();
		System.out.println("You expert in " + lang1 + " and " + lang2 );
		System.out.println();
	}
	public static void printskills() {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter your professional skills: " );
		String skill1 = in.nextLine();
		System.out.print("Enter your professional skills: " );
		String skill2 = in.nextLine();
		System.out.print("Enter your professional skills: " );
		String skill3 = in.nextLine();
		System.out.println("You have skills in " + skill1 + " , " + skill2 + " and " + skill3 );
		System.out.println();
	}
	public static void printaward() {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter your Award & Certificate: ");
		String award1 = in.nextLine();
		System.out.print("Enter your Award & Certificate: ");
		String award2 = in.nextLine();
		System.out.print("Enter your Award & Certificate: ");
		String award3 = in.nextLine();
		System.out.println("Your Awards & Certificate are " + award1 + " , " + award2 + " and " +award3);
		System.out.println();
		
		in.close();
	}
	

		
}

