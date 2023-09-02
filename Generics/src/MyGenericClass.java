
public class MyGenericClass <Element> {
	
	Element x;
	
	MyGenericClass (Element x) {
		this.x = x;
	}

	public Element getValue() {
		return x;
	}
}
