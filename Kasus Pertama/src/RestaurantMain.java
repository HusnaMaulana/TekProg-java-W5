/**
 * @author Husna Maulana
 * @since 12-02-2022
 * @version 1.0
 */
public class RestaurantMain {
	public static void main(String[] args) {
		Restaurant menu = new Restaurant();
		menu.tambahMenuMakanan("Bala-Bala", 1_000, 20);
		Restaurant.nextId();
		menu.tambahMenuMakanan("Gehu", 1_000, 20);
		Restaurant.nextId();
		menu.tambahMenuMakanan("Tahu", 1_000, 20);
		Restaurant.nextId();
		menu.tambahMenuMakanan("Molen", 1_000, 20);
		
		menu.tampilMenuMakanan();
	}
}
