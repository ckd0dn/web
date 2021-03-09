package ex3_generic;

public class Ex1_Generic<T> {
	//제네릭 클래스란 일반적인 코드를 작성하고 이에 대해 다양한 타입의 객체를 
	//재사용(재활용) 할 수 있도록 해 주는 기법
	T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	
}
