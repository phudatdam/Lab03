import java.util.concurrent.ThreadPoolExecutor.DiscardOldestPolicy;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] =
			new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered;
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered < MAX_NUMBERS_ORDERED) {
			itemsOrdered[qtyOrdered] = disc;
			qtyOrdered++;
			System.out.println("The disc has been added");
		}
		if (qtyOrdered == MAX_NUMBERS_ORDERED) {
			System.out.println("The cart is almost full");
		}
	}
	
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		boolean found = false;
		for (int i = 0; i < qtyOrdered; i++) {
			if (found) {
				itemsOrdered[i - 1] = itemsOrdered[i];
			} else if (itemsOrdered[i] == disc) {
				itemsOrdered[i] = null;
				found = true;
			}
		}
		if (found) {
			qtyOrdered--;
			System.out.println("The disc has been removed");
		} else {
			System.out.println("The disc cannot be found");
		}
	}
	
	public float totalCost() {
		float total = 0;
		for (DigitalVideoDisc disc : itemsOrdered) {
			if (disc != null) {
				total += disc.getCost();
			}
		}
		return total;
	}
}
