import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
		q7();
		q8();
		q9();
		q10();
		q11();
		q12();
	}

	public static void q1() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input a number: ");
		double input = scanner.nextDouble();
		scanner.nextLine();
		System.out.println(Math.abs(input));
		scanner.close();
	}

	public static void q2() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input a number: ");
		double input1 = scanner.nextDouble();
		scanner.nextLine();
		System.out.print("Input another number: ");
		double input2 = scanner.nextDouble();
		System.out.println(Math.floor(input1 / input2));
		System.out.println(Math.ceil(input1 / input2));
		scanner.close();
	}

	public static void q3() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input a number: ");
		double input = scanner.nextDouble();
		scanner.nextLine();
		System.out.println(Math.round(Math.sqrt(input)));
		scanner.close();
	}

	public static void q4() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input a number: ");
		double input1 = scanner.nextDouble();
		scanner.nextLine();
		System.out.print("Input another number: ");
		double input2 = scanner.nextDouble();
		scanner.nextLine();
		System.out.println(Math.pow(input1, input2));
		scanner.close();
	}

	public static void q5() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input a number: ");
		double input1 = scanner.nextDouble();
		scanner.nextLine();
		System.out.print("Input another number: ");
		double input2 = scanner.nextDouble();
		scanner.nextLine();
		System.out.print("Input one more number: ");
		double input3 = scanner.nextDouble();
		scanner.nextLine();
		double max = Math.max(input1, input2);
		max = Math.max(max, input3);
		double min = Math.min(input1, input2);
		min = Math.min(min, input3);
		System.out.println(max);
		System.out.println(min);
		scanner.close();
	}
	public static void q6() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input a sentence: ");
		String line = scanner.nextLine();
		System.out.println(line.contains("on"));
		scanner.close();
	}
	public static void q7() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input the word mango: ");
		String line = scanner.nextLine();
		System.out.println(line.equalsIgnoreCase("mango"));
		scanner.close();
	}
	public static void q8() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input a word: ");
		String line = scanner.nextLine();
		System.out.print("Input a letter: ");
		String search = scanner.nextLine();
		System.out.println(line.indexOf(search));
		System.out.println(line.lastIndexOf(search));
		scanner.close();
	}

	public static void q9() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input a sentence: ");
		String line = scanner.nextLine();
		System.out.println("Your sentence is " + line.length() + " characters long");
		scanner.close();
	}
	public static void q10() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input a sentence: ");
		String line = scanner.nextLine();
		System.out.print("Input a word to replace: ");
		String toBeReplaced = scanner.nextLine();
		System.out.print("What word would you like to replace it with: ");
		String replacement = scanner.nextLine();
		System.out.println(line.replaceAll(toBeReplaced, replacement));
		scanner.close();
	}

	public static void q11() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input a sentence: ");
		String line = scanner.nextLine().strip();
		System.out.println(line.toUpperCase());
		System.out.println(line.toLowerCase());
		scanner.close();
	}

	public static void q12() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input a word: ");
		String line = scanner.nextLine();
		System.out.println(line.substring(0, 4));
		System.out.println(line.substring(line.length() - 4, line.length()));
		scanner.close();
	}
	

}
