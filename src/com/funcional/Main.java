package com.funcional;

import com.funcional.lista.Lista;

public class Main {

	public static void main(String[] args) {

		var miLista = Lista.of(4, 66, 2, 3, 7);
		System.out.println(miLista);
		
		var v1 = miLista.max();
		System.out.println(v1);
		
		var v2 = miLista.min();
		System.out.println(v2);
		

	}

}
