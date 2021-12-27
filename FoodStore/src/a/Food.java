package a;

public abstract class Food {
	public Food() {
		super();
	}

	int weigth;
	String taste;

	public Food(int weigth, String taste) {
		super();
		this.weigth = weigth;
		this.taste = taste;
		
		
	}

	public int getWeigth() {
		return weigth;
	}

	public void setWeigth(int weigth) {
		this.weigth = weigth;
	}

	public String getTaste() {
		return taste;
	}

	public void setTaste(String taste) {
		this.taste = taste;
	}

}
