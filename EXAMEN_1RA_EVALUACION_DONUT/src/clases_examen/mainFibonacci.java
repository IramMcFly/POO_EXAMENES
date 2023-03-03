package clases_examen;

public class mainFibonacci {
	
	public static void callFibonacci() {
		
		//creacion de objetos
		
		fibonacci fib = new fibonacci(6,2,4);// objeto con parametros (n, p1, p2)
		fibonacci fibo = new fibonacci(); //objeto que usa los default
		fibonacci fibon = new fibonacci(); //objeto que usa los default
		
		//usando el objeto fib
		System.out.println("");
		fib.getSecuencia(); //secuencia con parametros 
		System.out.println(fib.getn()); //pedimos n
		System.out.println(fib.getP1()); //pedimos la posicion 0 del arreglo
		System.out.println(fib.getP2()); //pedimos la posicion 1 del arreglo
		
		System.out.println("");
		//usando el objeto fibo
		fibo.getSecuencia(); //secuencia con parametros 
		System.out.println(fibo.getn()); //pedimos n
		System.out.println(fibo.getP1()); //pedimos la posicion 0 del arreglo
		System.out.println(fibo.getP2()); //pedimos la posicion 1 del arreglo
		
		System.out.println("");
		//usando el objeto fibo
		fibon.setN(7);
		fibon.setP1(2);
		fibon.setP2(4);
		fibon.getSecuencia(); //secuencia con parametros 
		System.out.println(fibon.getn()); //pedimos n
		System.out.println(fibon.getP1()); //pedimos la posicion 0 del arreglo
		System.out.println(fibon.getP2()); //pedimos la posicion 1 del arreglo
	}
}
