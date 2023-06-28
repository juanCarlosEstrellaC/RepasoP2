package com.funcional.lista;

public sealed interface Lista<T> permits Nil, Cons {
	
	Lista NIL = new Nil<>();
	
	T head();
	Lista<T> tail();
	boolean isEmpty();
	
	static <T> Lista<T> of(T h, Lista<T> t){
		return new Cons<T>(h, t);
	}
	
	static <T> Lista<T> of(T... elementos){
		Lista<T> t = NIL;
		for (int i = elementos.length -1 ; i >= 0; i--) {
			T h = elementos[i];
			var tmp = Lista.of(h,t);
			t = tmp;
		}
		return t;
	}
	
	default Integer max() {
		if (this.tail().tail() == null) {
			return (Integer) this.head();
		} else {
			Integer max = (Integer) this.head();
			Integer n2 = (Integer) this.tail().head();
			
			if (n2 >= max) {
				max = n2;
			}
			
			var res = this.tail().max();
			
			if (res >= max) {
				max = res;
			}
			
			return max;
		}
	}
	
	default Integer min() {
		if (this.tail().tail() == null) {
			return (Integer) this.head();
		} else {
			Integer min = (Integer) this.head();
			Integer n2 = (Integer) this.tail().head();
			
			if (n2 <= min) {
				min = n2;
			}
			
			var res = this.tail().min();
			
			if (res <= min) {
				min = res;
			}
			
			return min;
		}
	}
	
}
