import java.util.Scanner;

public class UnitTestHexConversion
{
    public static void main(String args[])
    {
		Dec2Hex d = new Dec2Hex();
		String hex = d.convertToHex(100);
		if (hex.equals("64")) {
			System.out.println("SUCESS: " + hex + " = 64.");
		} else {
			throw new IllegalArgumentException("FAILURE: " + hex + " <> 64.");
		}
	}
}