
import java.net.*;
import java.io.*;

public class Calculadora {
	public static void main(String[] args) throws IOException {
		ServerSocket cc = new ServerSocket(4999);
		Socket c = cc.accept();
		
		System.out.println("Conectado!");
		
		InputStreamReader in = new InputStreamReader(c.getInputStream());
		BufferedReader bf = new BufferedReader(in);
		String str = bf.readLine();
		System.out.println("Cliente : "+ str);
		
	}
}
