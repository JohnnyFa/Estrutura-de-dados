
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class Calculador {

	public static void main(String[] args) throws IOException {
		Socket c = new Socket("localhost", 4999);
		
		PrintWriter pr = new PrintWriter(c.getOutputStream());
		pr.println("hello");
		pr.flush();
		
	}

}
