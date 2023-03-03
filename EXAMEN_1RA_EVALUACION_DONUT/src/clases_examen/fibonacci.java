package clases_examen;

public class fibonacci {
	   
	private int[] arr = new int[200];
	private int pos1;
	private int pos2;
	private int n;
	
	//constructor default
	public fibonacci() {
		pos1 = 1;
		pos2 = 1;
		n = 6;
	}
	//costructor con argumentos
	public fibonacci(int N,int p1, int p2) {
	    n = N;
		pos1 = p1;
	    pos2 = p2;
	}

	//metodos set
	public void setP1(int ps) {
		pos1 = ps;
	}
	public void setP2(int ps) {
		pos2 = ps;
	}
	public void setN(int N) {
		n = N;
	}
	
	//metodos get
	public int getn() {
		return n;
	}
	public int getP1() {
		return pos1;
	}
	public int getP2() {
		return pos2;
	}
	public void getSecuencia() {
		arr[0] = pos1;
		arr[1] = pos2;
		
		for (int i = 2; i < n; i++) {
	    	arr[i] = arr[i-1] + arr[i-2];
	    }
		for(int i = 0; i<n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
	}

}