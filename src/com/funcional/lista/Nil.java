package com.funcional.lista;

public final class Nil<T> implements Lista {
	
	protected Nil() {}

	@Override
	public Object head() {
		return null;
	}

	@Override
	public Lista tail() {
		return null;
	}

	@Override
	public boolean isEmpty() {
		return true;
	}
	
	@Override
	public String toString() {
		return "NIL";
	}

}
