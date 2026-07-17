import java.util.HashSet;

public abstract class Location<T, P extends Physical>{
	
	HashSet<T> inventory;
	
	public void add(T item) {
		inventory.add(item);
	}
	
	public void removeItem(T item) {
		inventory.remove(item);
	}
	
	public boolean itemExists(T item) {
		return inventory.contains(item);
	}
	
	void deliver(T item, Customer customer) {
        if (!(item instanceof Physical)) {
            System.out.println("Can't deliver non-physical items.\n");
            return;
        }

        Physical physical = (Physical) item;
		if(itemExists(item)){
			System.out.println("Delivering " + physical);
			System.out.println("Delivery service: " + item.getClass().toString() + " Express");
			System.out.println("Box size: " + physical.determineBoxSize());
			System.out.println("Address: " + customer.getPostalCode());
			removeItem(item);
		}
	}

}
