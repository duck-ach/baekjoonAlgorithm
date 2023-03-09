package iterator_string_2675;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main2 {
	
	public void result() throws Exception {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int cnt = N/4;
		System.out.print("long ".repeat(cnt) + "int");
		
	}
	
	public static void main(String[] args) throws Exception{
		new Main2().result();
	}
	
}
