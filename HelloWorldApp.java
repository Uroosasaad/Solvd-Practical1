import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
class HelloWorldApp {

	public static void main(String[] args) {
		/*BufferedReader reader = new BufferedReader(
			new InputStreamReader(System.in));
		String name;
		try{
			System.out.println("Enter your name");
			name = reader.readLine();
			System.out.println("My Name is = " + name);
		}
		catch (Exception e) {

		}*/
		showMessage("Uroosa");
	}
	public static void showMessage(String name) {
		System.out.println(name);
	}
}