import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

	
		public static void main(String[] args) {
			
			List<Variable> list = new ArrayList<Variable>();
			try (Scanner input = new Scanner(System.in)) {
				System.out.println("HI ! You are in App ");

				while (true) {
					System.out.println("Declare the value by using following Syntax <TYPE> then <Name> or Press { to Exit ");
					String type = input.next();
					if (type.equals("{")) {
						print_Names(list);
						System.out.println("Total bits : " + get_Total_bit(list));
						System.out.println("Thanks for Using ");
						return;
					}

					String name = input.next();
					Variable obj = new Variable(name, type);
					list.add(obj);

				}
			}

		}

		public static int get_Total_bit(List<Variable> list) {
			int result = 0;
			for (Variable e : list)
				result += e.getBits();

			return result;

		}

		public static void print_Names(List<Variable> list) {
			System.out.println("Here are the Names of Variables you declared ! ");
			for (Variable e : list)
				System.out.println(e.name);
		}

}
