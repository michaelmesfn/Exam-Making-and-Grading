package examgradingsystemproject;

public class Grade {
	Sleep sleep = new Sleep();
	String[] string1 = new String[1];
	MakeExam makeexamobj = new MakeExam();

	public void gradeoopexam(int j) // function that accepts the number of total question
	{
		int count = 0;
		for (int i = 0; i < 10; i++) {// the choice the student has entered is compared to the teachers answer and 1
										// is incremented to the arbitrary value of count every time the student gets a
										// question right
			if ((Questionsforoop.studchoice[i] == Questionsforoop.correctchoice[i]
					|| Questionsforoop.studchoice[i] == Character.toUpperCase(Questionsforoop.correctchoice[i])
					|| Questionsforoop.studchoice[i] == Character.toLowerCase(Questionsforoop.correctchoice[i]))
					&& Questionsforoop.studchoice[i] != '\u0000')
				count++; // the correct choice is converted to uppercase and lower case letters so that
							// the if statement can return true if one of the characters is uppercase and
							// the other is lowercase while both are necessariy the same letter
		}
		System.out.println("You have scored " + count + " out of " + j); // displays how much the student has scored
		makeexamobj.exittomain(); // exits to main
	}

	public void gradedatastrucexam(int j) {
		int count = 0;
		for (int i = 0; i < 10; i++) {
			if ((Questionsfordatastruc.studchoice[i] == Questionsfordatastruc.correctchoice[i]
					|| Questionsfordatastruc.studchoice[i] == Character
							.toUpperCase(Questionsfordatastruc.correctchoice[i])
					|| Questionsfordatastruc.studchoice[i] == Character
							.toLowerCase(Questionsfordatastruc.correctchoice[i]))
					&& Questionsfordatastruc.studchoice[i] != '\u0000')
				count++;
		}
		System.out.println("You have scored " + count + " out of " + j);
		makeexamobj.exittomain();
	}

	public void gradedatabaseexam(int j) {
		int count = 0;
		for (int i = 0; i < 10; i++) {
			if ((Questionsfordatabase.studchoice[i] == Questionsfordatabase.correctchoice[i]
					|| Questionsfordatabase.studchoice[i] == Character
							.toUpperCase(Questionsfordatabase.correctchoice[i])
					|| Questionsfordatabase.studchoice[i] == Character
							.toLowerCase(Questionsfordatabase.correctchoice[i]))
					&& Questionsfordatabase.studchoice[i] != '\u0000')
				count++;
		}
		System.out.println("You have scored " + count + " out of " + j);
		makeexamobj.exittomain();
	}

	public void grademathexam(int j) {
		int count = 0;
		for (int i = 0; i < 10; i++) {
			if ((Questionsformath.studchoice[i] == Questionsformath.correctchoice[i]
					|| Questionsformath.studchoice[i] == Character.toUpperCase(Questionsformath.correctchoice[i])
					|| Questionsformath.studchoice[i] == Character.toLowerCase(Questionsformath.correctchoice[i]))
					&& Questionsformath.studchoice[i] != '\u0000')
				count++;
		}

		System.out.println("You have scored " + count + " out of " + j);
		makeexamobj.exittomain();
	}
}
