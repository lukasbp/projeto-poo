package projeto.poo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Leitura {

	public static String lerString() {
		String s = null;
		try {
			s = new BufferedReader(new InputStreamReader(System.in)).readLine();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return s;
	}

	public static int lerInt() {
		return Integer.parseInt(lerString());
	}

	public static double lerDouble() {
		return Double.parseDouble(lerString());
	}
}
