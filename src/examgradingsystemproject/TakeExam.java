package examgradingsystemproject;

import java.util.Scanner;

public class TakeExam extends MakeExam {
	Sleep sleep = new Sleep();
	Scanner input = new Scanner(System.in);
	Grade grade = new Grade();

	public void studtakeexam() {// directs the student to whatever subject he desires based on his choice in the
								// choosecourse method;
		int n = choosecourse();
		if (n == 1)
			takeoopexam();
		else if (n == 2)
			takedatastrucexam();
		else if (n == 3)
			takedatabaseexam();
		else if (n == 4)
			takemathexam();
		else {
			System.out.println("Wrong Input");
			studtakeexam(); // if the user enters an invalid id for a subject he is asked to enter again
		}
	}

	public void takeoopexam() {
		int j = 0;
		System.out.println("\nTrying to retrieve exam...\n");
		sleep.sleepfor2sec();
		try {
			if (Questionsforoop.questions[0].charAt(0) == '\u0000') // if Question number 1 is null throws an exception
																	// saying that no exam havenot been added yet
			{
			}
		} catch (Exception e) {
			System.out.println(
					"Error!!!! There are no available exams for this subject. Please proceed to other subjects");
			studtakeexam();
		} // prompts the student to choose another subject

		for (int i = 0; i < 10; i++) {
			if (Questionsforoop.questions[i] != null && Questionsforoop.choicea[i] != null
					&& Questionsforoop.choiceb[i] != null && Questionsforoop.choicec[i] != null
					&& Questionsforoop.choiced[i] != null) // stops displaying whenever a null value is encountered
															// which otherwise may result in empty space on the console
			{
				System.out.println((i + 1) + "." + Questionsforoop.questions[i]);
				System.out.println(" A." + Questionsforoop.choicea[i]);
				System.out.println(" B." + Questionsforoop.choiceb[i]);
				System.out.println(" C." + Questionsforoop.choicec[i]);
				System.out.println(" D." + Questionsforoop.choiced[i]);
				System.out.println("Enter your Answer");
				for (int z = 0; z < 100; z++) {
					Questionsforoop.studchoice[i] = input.next().charAt(0);
					if (Questionsforoop.studchoice[i] == 'a' || Questionsforoop.studchoice[i] == 'A'
							|| Questionsforoop.studchoice[i] == 'b' || Questionsforoop.studchoice[i] == 'B'
							|| Questionsforoop.studchoice[i] == 'c' || Questionsforoop.studchoice[i] == 'C'
							|| Questionsforoop.studchoice[i] == 'd' || Questionsforoop.studchoice[i] == 'D')
						break;
					else
						System.out.println("Invalid Input! Please try again");
				}
				j++;
			} // accepts the students answer for that specific Question
		}
		System.out.println("You have completed your exam!");
		sleep.sleepfor2sec();

		System.out.println("Press the Enter Key to grade your exam"); // the student has to press the enter key to
																		// proceed to his grade report
		try {
			System.in.read();
		} catch (Exception e) {
			e.printStackTrace();
		}
		grade.gradeoopexam(j); // calls the grading function for desired subject and passes j which counts how
								// many times the for loop was executed (how many Questions there are)

	}

	public void takedatastrucexam() {
		int j = 0;
		System.out.println("\nTrying to retrieve the exam...\n");
		sleep.sleepfor2sec();
		try {
			if (Questionsfordatastruc.questions[0].charAt(0) == '\u0000') {
			}
		} catch (Exception e) {
			System.out.println(
					"Error!!!! There are no available exams for this subject. Please proceed to other subjects");
			studtakeexam();
		}
		for (int i = 0; i < 10; i++) {
			if (Questionsfordatastruc.questions[i] != null && Questionsfordatastruc.choicea[i] != null
					&& Questionsfordatastruc.choiceb[i] != null && Questionsfordatastruc.choicec[i] != null
					&& Questionsfordatastruc.choiced[i] != null) {
				System.out.println((i + 1) + "." + Questionsfordatastruc.questions[i]);
				System.out.println(" A." + Questionsfordatastruc.choicea[i]);
				System.out.println(" B." + Questionsfordatastruc.choiceb[i]);
				System.out.println(" C." + Questionsfordatastruc.choicec[i]);
				System.out.println(" D." + Questionsfordatastruc.choiced[i]);
				System.out.println("Enter your Answer");
				for (int z = 0; z < 100; z++) {
					Questionsfordatastruc.studchoice[i] = input.next().charAt(0);
					if (Questionsfordatastruc.studchoice[i] == 'a' || Questionsfordatastruc.studchoice[i] == 'A'
							|| Questionsfordatastruc.studchoice[i] == 'b' || Questionsfordatastruc.studchoice[i] == 'B'
							|| Questionsfordatastruc.studchoice[i] == 'c' || Questionsfordatastruc.studchoice[i] == 'C'
							|| Questionsfordatastruc.studchoice[i] == 'd' || Questionsfordatastruc.studchoice[i] == 'D')
						break;
					else
						System.out.println("Invalid Input! Please try again");
				}
				j++;
			}
		}
		System.out.println("Press the Enter Key to grade your exam");
		try {
			System.in.read();
		} catch (Exception e) {
			e.printStackTrace();
		}
		grade.gradedatastrucexam(j);
	}

	public void takedatabaseexam() {
		int j = 0;
		System.out.println("\nTrying to retrieve the exam...\n");
		sleep.sleepfor2sec();
		try {
			if (Questionsfordatabase.questions[0].charAt(0) == '\u0000') {
			}
		} catch (Exception e) {
			System.out.println(
					"Error!!!! There are no available exams for this subject. Please proceed to other subjects");
			studtakeexam();
		}

		for (int i = 0; i < 10; i++) {
			if (Questionsfordatabase.questions[i] != null && Questionsfordatabase.choicea[i] != null
					&& Questionsfordatabase.choiceb[i] != null && Questionsfordatabase.choicec[i] != null
					&& Questionsfordatabase.choiced[i] != null) {
				System.out.println((i + 1) + "." + Questionsfordatabase.questions[i]);
				System.out.println(" A." + Questionsfordatabase.choicea[i]);
				System.out.println(" B." + Questionsfordatabase.choiceb[i]);
				System.out.println(" C." + Questionsfordatabase.choicec[i]);
				System.out.println(" D." + Questionsfordatabase.choiced[i]);
				System.out.println("Enter your Answer");
				for (int z = 0; z < 100; z++) {
					Questionsfordatabase.studchoice[i] = input.next().charAt(0);
					if (Questionsfordatabase.studchoice[i] == 'a' || Questionsfordatabase.studchoice[i] == 'A'
							|| Questionsfordatabase.studchoice[i] == 'b' || Questionsfordatabase.studchoice[i] == 'B'
							|| Questionsfordatabase.studchoice[i] == 'c' || Questionsfordatabase.studchoice[i] == 'C'
							|| Questionsfordatabase.studchoice[i] == 'd' || Questionsfordatabase.studchoice[i] == 'D')
						break;
					else
						System.out.println("Invalid Input! Please try again");
				}
				j++;
			}
		}
		System.out.println("Press the Enter Key to grade your exam");
		try {
			System.in.read();
		} catch (Exception e) {
			e.printStackTrace();
		}
		grade.gradedatabaseexam(j);
	}

	public void takemathexam() {
		int j = 0;
		System.out.println("\nTrying to retrieve the exam...\n");
		sleep.sleepfor2sec();
		try {
			if (Questionsformath.questions[0].charAt(0) == '\u0000') {
			}
		} catch (Exception e) {
			System.out.println(
					"Error!!!! There are no available exams for this subject. Please proceed to other subjects");
			studtakeexam();
		}
		for (int i = 0; i < 10; i++) {
			if (Questionsformath.questions[i] != null && Questionsformath.choicea[i] != null
					&& Questionsformath.choiceb[i] != null && Questionsformath.choicec[i] != null
					&& Questionsformath.choiced[i] != null) {
				System.out.println((i + 1) + "." + Questionsformath.questions[i]);
				System.out.println(" A." + Questionsformath.choicea[i]);
				System.out.println(" B." + Questionsformath.choiceb[i]);
				System.out.println(" C." + Questionsformath.choicec[i]);
				System.out.println(" D." + Questionsformath.choiced[i]);
				System.out.println("Enter your Answer");
				for (int z = 0; z < 100; z++) {
					Questionsformath.studchoice[i] = input.next().charAt(0);
					if (Questionsformath.studchoice[i] == 'a' || Questionsformath.studchoice[i] == 'A'
							|| Questionsformath.studchoice[i] == 'b' || Questionsformath.studchoice[i] == 'B'
							|| Questionsformath.studchoice[i] == 'c' || Questionsformath.studchoice[i] == 'C'
							|| Questionsformath.studchoice[i] == 'd' || Questionsformath.studchoice[i] == 'D')
						break;
					else
						System.out.println("Invalid Input! Please try again");
				}
				j++;
			}
		}
		System.out.println("Press the Enter Key to grade your exam");
		try {
			System.in.read();
		} catch (Exception e) {
			e.printStackTrace();
		}
		grade.grademathexam(j);
	}

}