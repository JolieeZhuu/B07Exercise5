import java.util.HashSet;

public class GroceryStore extends Location<GroceryItem, GroceryItem> {
	public GroceryStore() {
		inventory = new HashSet<GroceryItem>();
	}
}
