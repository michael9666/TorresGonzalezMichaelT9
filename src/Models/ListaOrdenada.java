package Models;

import java.util.*;


import Exceptions.ElementNotAllowedException;
import Exceptions.ListIndexOutException;
import Exceptions.ListSizeOverflownException;
import Exceptions.NoContainsElementException;

@SuppressWarnings({ "serial" })
public class ListaOrdenada<E> extends ArrayList<E> {

	private final byte MAX_SIZE = 100;

	/**
	 * Declaración de constantes
	 */
	public ListaOrdenada() { //Collection<? extends E> comp
		super();
		
	}

	/**
	 * Creación del constructor
	 */

	@Override
	public boolean add(E element) {
		if (element != null) {
			if (this.size() < MAX_SIZE) {
			} else {
				throw new ListSizeOverflownException("[Límite máximo de la lista alcanzado]");
			}
		} else {
			throw new ElementNotAllowedException("[No se aceptan valores null]");
		}
		return super.add(element);
	}
	/**
	 * Método add(E) controlado con excepciones
	 * @return
	 */
	@Override
	public void add(int index, E element) {
		if (element != null) {
			if (this.size() < MAX_SIZE) {
			} else {
				throw new ListSizeOverflownException("[Límite máximo de la lista alcanzado]");
			}
		} else {
			throw new ElementNotAllowedException("[No se aceptan valores null]");
		}
		super.add(index, element);
	}
	/**
	 * Método add(int, E) controlado con excepciones
	 * @return
	 */
	@Override
	public E remove(int index) {
		if (this.size() > index) {
		} else {
			throw new ListIndexOutException("[El índice está fuera de la lista]");
		}
		return super.remove(index);
	}
	/**
	 * Método remove(index) controlado con excepciones
	 * @return
	 */
	@Override
	public boolean remove(Object obj) {
		if (obj != null) {
			if (this.contains(obj)) {
			} else {
				throw new NoContainsElementException("[El elemento no está dentro de la lista]");
			}
		} else {
			throw new ElementNotAllowedException("[No se aceptan valores null]");
		}
		return super.remove(obj);
	}
/**
 * Método remove(object) controlado con excepciones
 * @return
 */
	

}
