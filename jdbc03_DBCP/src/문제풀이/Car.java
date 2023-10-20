package 문제풀이;

public class Car {
	// + : public
	// - : private
	// # : protected
	public String color;
	int price;
	private String developer;
	protected int count;
	@Override
	public String toString() {
		return "Car [color=" + color + ", price=" + price + ", developer=" + developer + ", count=" + count + "]";
	}
}
