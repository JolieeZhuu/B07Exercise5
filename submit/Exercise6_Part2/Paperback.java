public class Paperback extends Book implements Physical {
	double length;
	double width;
	double height;

	public Paperback(String isbn, String title, double length, double width, double height) {
		this.isbn = isbn;
		this.title = title;
		this.length = length;
		this.width = width;
		this.height = height;
	}

    public double getLength() {
		return length;
	}

	public double getHeight() {
		return height;
	}

	public double getWidth() {
		return width;
	}

	public String determineBoxSize() {
		double max = length;
		if(max < width)
			max = width;
		if(max < height)
			max = height;
		if(max < 5)
			return "small";
		else if(max < 15)
			return "medium";
		else
			return "large";
	}
}
