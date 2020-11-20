package proceso1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		Cola cola = new Cola();

		ArrayList<Cola> colas = new ArrayList<Cola>();

		ArrayList<Integer> quantumProceso = new ArrayList<Integer>();
		ArrayList<Integer> colaMenor5 = new ArrayList<Integer>();// <que5
		ArrayList<Integer> colaMenor10 = new ArrayList<Integer>();// >que 5
		ArrayList<Integer> colaMayor10 = new ArrayList<Integer>();// >que 10

		quantumProceso.add(18);
		quantumProceso.add(7);
		quantumProceso.add(8);
		quantumProceso.add(12);
		quantumProceso.add(4);

		colaMenor5.add(0);
		colaMenor5.add(0);
		colaMenor5.add(0);
		colaMenor5.add(0);
		colaMenor5.add(0);

		colaMenor10.add(0);
		colaMenor10.add(0);
		colaMenor10.add(0);
		colaMenor10.add(0);
		colaMenor10.add(0);

		colaMayor10.add(0);
		colaMayor10.add(0);
		colaMayor10.add(0);
		colaMayor10.add(0);
		colaMayor10.add(0);

		

		System.out.println("Imprime colas");

		do {

			System.out.println("-----Sin Ordenar-----");
			cola.imprimirColas(quantumProceso, colaMenor5, colaMenor10, colaMayor10);

			cola.ordenarQuantum(quantumProceso, colaMenor5, colaMenor10, colaMayor10);
			cola.imprimirColas(quantumProceso, colaMenor5, colaMenor10, colaMayor10);
			System.out.println("---");
			quantumProceso = cola.restarUnoArrayList(quantumProceso);
			System.out.println("-----------");
			System.out.println("Ordenada");
			cola.imprimirColas(quantumProceso, colaMenor5, colaMenor10, colaMayor10);// ordenado

			

		} while (!cola.esCeroElArray(quantumProceso));
		//
		quantumProceso=cola.ordenarArrayMenor5(quantumProceso, colaMenor5);
		System.out.println("--FINAL--");
		cola.imprimirColas(colaMayor10, colaMenor5, colaMenor10, colaMayor10);
		
	}
	
}