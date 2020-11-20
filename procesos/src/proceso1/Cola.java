package proceso1;

import java.util.ArrayList;
import java.util.Collections;

public class Cola {

	public void ordenar(ArrayList<Integer> quantumProceso, ArrayList<Integer> colaMenor5,
			ArrayList<Integer> colaMenor10, ArrayList<Integer> colaMayor10) {

		for (int i = 0; i < quantumProceso.size(); i++) {
			Integer valorQuantumProceso = quantumProceso.get(i);

			if (valorQuantumProceso <= 5) {// contains: comprueba que contenga el objeto dentro del arrayLis,
				if (!colaMenor5.contains(valorQuantumProceso)) {
					colaMenor5.set(i, valorQuantumProceso);

				}

			} else if (valorQuantumProceso > 5 && valorQuantumProceso < 11) {
				if (!colaMenor10.contains(valorQuantumProceso)) {
					colaMenor10.set(i, valorQuantumProceso);

				}

			} else {
				if (!colaMayor10.contains(valorQuantumProceso)) {
					colaMayor10.set(i, valorQuantumProceso);
				}

			}

		}

		// Collections.sort(colaMenor5);
		// Collections.sort(colaMenor10);
		// Collections.sort(colaMayor10);

	}// FIN DEL METODO oRDENAR

	private void mostrar(ArrayList<Integer> numeros, String nombreCola) {

		for (Integer nu : numeros) {
			nombreCola = nombreCola + " " + nu;

		}
		System.out.println(nombreCola);
	}

	public void imprimirColas(ArrayList<Integer> quantumProceso, ArrayList<Integer> colaMenor5,
			ArrayList<Integer> colaMenor10, ArrayList<Integer> colaMayor10) {

		mostrar(quantumProceso, "quantumProceso :");
		mostrar(colaMenor5, "colaMenor5 :");
		mostrar(colaMenor10, "colaMenor10 :");
		mostrar(colaMayor10, "colaMayor10 :");

	}

	public ArrayList<Integer> restarUnoArrayList(ArrayList<Integer> numeros) {
		for (int i = 0; i < numeros.size(); i++) {
			int numero = numeros.get(i);
			if (numero != 0) {
				numero = numero - 1;
				// numero-- tambien podria ser asi o
				// --numero

				numeros.set(i, numero);

			}

		}
		return numeros;

	}

	public boolean esCeroElArray(ArrayList<Integer> numeros) {
		for (Integer numero : numeros) {
			if (numero != 0) {// si es 0 sigo recorriendo, pero si es distinto de 0 retorna false
				return false;// retornamos false, si encontramos dentro del array un numero q sea distinto de
								// cero, porque ya no recorremos mas el array

			}

		}
		return true;// si todos los elementos del array son 0, retornamos siempre true
	}

	public boolean tieneArraysVacios(ArrayList<Integer> colaMenor5, ArrayList<Integer> colaMenor10,
			ArrayList<Integer> colaMayor10) {

		boolean tieneArraysVacios = false;
		tieneArraysVacios = esCeroElArray(colaMenor5) && esCeroElArray(colaMenor10) && esCeroElArray(colaMayor10);
		// si cualquiera de los 3 arrays es 0, sigue avanzando
		return tieneArraysVacios;
	}

	public ArrayList<Integer> ordenarArrayMenor5(ArrayList<Integer> colaDesordenada, ArrayList<Integer> colaMenor5) {

		for (int i = 0; i < colaDesordenada.size(); i++) {
			Integer numero = colaDesordenada.get(i);
			if (numero <= 5) {// contains: comprueba que contenga el objeto dentro del arrayLis,
				//if (!colaMenor5.contains(numero)) {
					colaMenor5.set(i, numero);
				//}
			} else {
				colaMenor5.set(i, 0);
			}
		}
		Collections.sort(colaMenor5);
		return colaMenor5;
	}

	public ArrayList<Integer> ordenarArrayMenor10(ArrayList<Integer> colaDesordenada, ArrayList<Integer> colaMenor10) {

		for (int i = 0; i < colaDesordenada.size(); i++) {
			Integer numero = colaDesordenada.get(i);
			if (numero >= 6 && numero < 11) {// contains: comprueba que contenga el objeto dentro del arrayLis,
				//if (!colaMenor10.contains(numero)) {
					colaMenor10.set(i, numero);
				//}
			} else {
				colaMenor10.set(i, 0);
			}
		}
		Collections.sort(colaMenor10);
		return colaMenor10;

	}

	public ArrayList<Integer> ordenarArrayMayor10(ArrayList<Integer> colaDesordenada, ArrayList<Integer> colaMayor10) {

		for (int i = 0; i < colaDesordenada.size(); i++) {
			Integer numero = colaDesordenada.get(i);
			if (numero > 10) {// contains: comprueba que contenga el objeto dentro del arrayLis,
				//if (!colaMayor10.contains(numero)) {
					colaMayor10.set(i, numero);
				//}
			} else {
				colaMayor10.set(i, 0);
			}

		}
		Collections.sort(colaMayor10);
		return colaMayor10;
	}

	public void ordenarQuantum(ArrayList<Integer> quantumProceso, ArrayList<Integer> colaMenor5,
			ArrayList<Integer> colaMenor10, ArrayList<Integer> colaMayor10) {

		colaMenor5 = ordenarArrayMenor5(quantumProceso, colaMenor5);
		colaMenor10 = ordenarArrayMenor10(quantumProceso, colaMenor10);
		colaMayor10 = ordenarArrayMayor10(quantumProceso, colaMayor10);

	}

}