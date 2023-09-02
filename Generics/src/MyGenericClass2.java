
//public class MyGenericClass2 <Element1, Element2>{

// bounding TYPES
public class MyGenericClass2 <Element1 extends Number, Element2>{	

	Element1 x;
	Element2 y;
	
	MyGenericClass2 (Element1 x, Element2 y) {
		this.x = x;
		this.y = y;
	}

	public Element1 getValue1() {
		return x;
	}
	
	public Element2 getValue2() {
		return y;
	}
	
}