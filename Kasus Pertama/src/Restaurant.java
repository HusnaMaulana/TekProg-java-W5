/**
 * @author Husna Maulana
 * @since 12-02-2022
 * @version 1.0
 */




public class Restaurant {			/* enkapsulasi */
	private Makanan menuMakanan[];
	private static byte id=0;
	
	public Restaurant() {			/* inisialisasi data */
		menuMakanan = new Makanan[10];
	}
	
	public void tambahMenuMakanan(String nama, double harga, int stok) {
		menuMakanan[id] = new Makanan();
		menuMakanan[id].setNama_Makanan(nama);
		menuMakanan[id].setHarga_Makanan(harga);
		menuMakanan[id].setStok(stok);
	}
	
	public void tampilMenuMakanan() {
		for(int i=0; i<=id; i++) {
			if(!isOutOfStock(i)) {
				System.out.println(menuMakanan[i].getNama_Makanan() + "[" + menuMakanan[i].getStok() + "]" + "\tRp. " + menuMakanan[i].getHarga_Makanan());
			}
		}
	}
	
	public boolean isOutOfStock(int id) {
		if(menuMakanan[id].getStok() == 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void nextId() {
		id++;
	}
}
