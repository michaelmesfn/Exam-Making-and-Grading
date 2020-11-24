package examgradingsystemproject;

import java.util.Scanner;

public class MakeExam {
	int n1, ques;
	String pass;
	String[] string1 = new String[1];
	Sleep sleep = new Sleep();
	int choiceofcourse;
	Scanner input = new Scanner(System.in);

	public void auth() {
		System.out.println("You need administrative access!\n Enter Password to continue");
		pass = input.next();// accepts a string from the user
		if (pass.equals("java"))// compares the string to the default password "java"
		{
			System.out.println("\nLogin Successful! Please choose the course you would like to make an exam for");
			addexam();// directs to the addexam method
		} else {
			System.out.println("Wrong Password! Press 0 to exit or any other key to try again");
			char n2 = input.next().charAt(0);
			if (n2 == '0')
				ExamGradingSystemProject.main(string1);// directs to the main method
			else
				auth();// directs the user to the authentication menu to re-enter a password
		}
	}

	public void addexam() {
		int choosecourse = choosecourse();// calls the choosecourse which lists all the courses and returns an integer
		if (choosecourse == 1)
			addexamoop();
		else if (choosecourse == 2)
			addexamdatastruc();
		else if (choosecourse == 3)
			addexamdatabase();
		else if (choosecourse == 4)
			addexammath();
		else {
			System.out.println("Please enter a valid input!");
			addexam();// redirects the user to choose a subject again
		}
	}

	public void addexamoop() {
		int n = quescount(); // calls ques count which returns an integer for number of questions the user
								// wants to add
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the question for No " + (i + 1));
			Questionsforoop.random[i] = input.nextLine();
			Questionsforoop.questions[i] = input.nextLine();// accepts questions
			System.out.println("Enter Choice A for question No " + (i + 1));
			Questionsforoop.choicea[i] = input.nextLine();// accepts choice options for A
			System.out.println("Enter Choice B for question No " + (i + 1));
			Questionsforoop.choiceb[i] = input.nextLine();// accepts choice options for B
			System.out.println("Enter Choice C for question No " + (i + 1));
			Questionsforoop.choicec[i] = input.nextLine();// accepts choice options for C
			System.out.println("Enter Choice D for question No " + (i + 1));
			Questionsforoop.choiced[i] = input.nextLine();// accepts choice options for D
			System.out.println("Enter the correct letter of the Answer");
			Questionsforoop.correctchoice[i] = input.next().charAt(0);// accepts the correct choice and stores it ona
																		// character variable
		}
		System.out.println("You have successfully added an exam!");// displayed after the user has completed inserting
																	// all questions and choices
		sleep.sleepfor1sec();
		exittomain(); // returns to main method
	}

	public void addexamdatastruc() {
		int n = quescount();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the question for No " + (i + 1));
			Questionsfordatastruc.random[i] = input.nextLine();
			Questionsfordatastruc.questions[i] = input.nextLine();
			System.out.println("Enter Choice A for question No " + (i + 1));
			Questionsfordatastruc.choicea[i] = input.nextLine();
			System.out.println("Enter Choice B for question No " + (i + 1));
			Questionsfordatastruc.choiceb[i] = input.nextLine();
			System.out.println("Enter Choice C for question No " + (i + 1));
			Questionsfordatastruc.choicec[i] = input.nextLine();
			System.out.println("Enter Choice D for question No " + (i + 1));
			Questionsfordatastruc.choiced[i] = input.nextLine();
			System.out.println("Enter the correct letter of the Answer");
			Questionsfordatastruc.correctchoice[i] = input.next().charAt(0);
		}
		System.out.println("You have successfully added an exam!");
		sleep.sleepfor1sec();
		exittomain();
	}

	public void addexamdatabase() {
		int n = quescount();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the question for No " + (i + 1));
			Questionsfordatabase.random[i] = input.nextLine();
			Questionsfordatabase.questions[i] = input.nextLine();
			System.out.println("Enter Choice A for question No " + (i + 1));
			Questionsfordatabase.choicea[i] = input.nextLine();
			System.out.println("Enter Choice B for question No " + (i + 1));
			Questionsfordatabase.choiceb[i] = input.nextLine();
			System.out.println("Enter Choice C for question No " + (i + 1));
			Questionsfordatabase.choicec[i] = input.nextLine();
			System.out.println("Enter Choice D for question No " + (i + 1));
			Questionsfordatabase.choiced[i] = input.nextLine();
			System.out.println("Enter the correct letter of the Answer");
			Questionsfordatabase.correctchoice[i] = input.next().charAt(0);
		}
		System.out.println("You have successfully added an exam!");
		sleep.sleepfor1sec();
		exittomain();
	}

	public void addexammath() {
		int n = quescount();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the question for No " + (i + 1));
			Questionsformath.random[i] = input.nextLine();
			Questionsformath.questions[i] = input.nextLine();
			System.out.println("Enter Choice A for question No " + (i + 1));
			Questionsformath.choicea[i] = input.nextLine();
			System.out.println("Enter Choice B for question No " + (i + 1));
			Questionsformath.choiceb[i] = input.nextLine();
			System.out.println("Enter Choice C for question No " + (i + 1));
			Questionsformath.choicec[i] = input.nextLine();
			System.out.println("Enter Choice D for question No " + (i + 1));
			Questionsformath.choiced[i] = input.nextLine();
			System.out.println("Enter the correct letter of the Answer");
			Questionsformath.correctchoice[i] = input.next().charAt(0);
		}
		System.out.println("You have successfully added an exam!");
		sleep.sleepfor1sec();
		exittomain();
	}

	public void exittomain() {
		System.out.println("Press 0 to exit");
		int ui = input.nextInt();
		if (ui == 0) {
			ExamGradingSystemProject.main(string1);
			sleep.sleepfor2sec();
		} // directs to main method
		else {
			ExamGradingSystemProject.main(string1);
			sleep.sleepfor2sec();
		}
	}

	public int choosecourse() {
		System.out.println("\n1.Object Oriented Programming\n2.Data Structure\n3.Database\n4.Mathematics\n0.Main Menu");
		int choose = input.nextInt();
		if (choose == 0)
			ExamGradingSystemProject.main(string1); // if 0 is entered it directs to the main method
		return choose; // then it returns the chosen subject id
	}

	public int quescount() {
		int n;

		System.out.println("How many questions do you want to enter?");
		n = input.nextInt();
		return n; // returns how many questions the user wants to input
	}

}
