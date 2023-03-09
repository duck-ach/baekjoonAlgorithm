package coding_is_sport_25314;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<N/4; i++) {
			sb.append("long ");
		}
		sb.append("int");
		
		System.out.println(sb);
	}
	
	public static void main(String[] args) throws Exception {
		
		Main main = new Main();
		main.solution();
		
	}
	
}
