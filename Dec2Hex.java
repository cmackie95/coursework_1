import java.util.Scanner;

public class Dec2Hex
{
    public static int Arg1;

    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        String input = "";
		do {
			if (args.length > 0) {
				try {
					Arg1 = Integer.parseInt(args[0]);
				} 
				catch (NumberFormatException e) {
					System.err.println("Argument '" + args[0] + "' must be an integer.");
				}
			} else {
				System.out.print("\nEnter value or enter 'q' to quit the program: ");
				input = scanner.nextLine();
				if ("Q".equals(input) || "q".equals(input)) {
					scanner.close();
					System.out.println("\nGoodbye.");
					System.exit(1);
				}
				try {
					Arg1 = Integer.parseInt(input);
				} 
				catch (NumberFormatException e) {
                    System.err.println("Argument '" + input + "' must be an integer.");
				}
			}

			System.out.println("\nConverting the Decimal Value " + Arg1 + " to Hex...");
			String hexadecimal = convertToHex(Arg1); 
	
			if (hexadecimal.equals("")) {
				hexadecimal = "0";
			}
			
			System.out.println("Hexadecimal representation is : " + hexadecimal);
		} while (args.length <= 0);
    }
	
	public static String convertToHex(int num) {
		char ch[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		int rem;
		String result="";
		
		while(num != 0) {
				rem=num%16;
				result= ch[rem] + result;
				num= num/16;
			}
		
		return result;
	}
}