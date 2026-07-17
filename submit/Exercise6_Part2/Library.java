import java.util.HashSet;

public class Library extends Location<Book, Paperback>{
	public Library() {
		inventory = new HashSet<Book>();
	}
}
