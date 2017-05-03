package Main;

import java.util.*;

import Models.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		ArrayList<Integer> lista = new ListaOrdenada<Integer>();
		ListaOrdenada<String> lista2 = new ListaOrdenada<String>();
		
		/**
		 * Creamos varias listas para probar los diferentes métodos
		 */
		lista.add(1);
		lista.add(10);
		lista.add(23);
		lista.add(3);
		//lista.remove(4);
		Collections.sort(lista, Collections.reverseOrder());
		
		System.out.print("Orden Descendiente: ");
		for (int i : lista){
			System.out.print(i+" ");
		}
		System.out.println(" ");
		/**
		 * Añadimos números a la lista de Integer
		 */
		lista2.add("prueba");
		//lista2.remove("hola");
		/**
		 *Añadimos un string a lista2 y comprobamos si funciona la excepción implementada en el método remove
		 *intentando eliminar un elemento que no existe
		 */
		System.out.println("Tamaño de la lista 2: "+lista2.size());
		
		
		
	}
}
