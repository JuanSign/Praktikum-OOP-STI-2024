public abstract class StoreItem {
    private String brand;
    private String model;

    /**
     * StoreItem constructor
     * @param brand
     * @param model
     */
    public StoreItem(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    /**
     * Mengembalikan atribut brand
     * @return brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Mencetak detail sebuah barang dengan format seperti berikut (tanpa [])
     * Brand: [Nama brand]
     * Model: [Nama model]
     */
    public void displayDetails() {
        System.out.print("Brand: ");
        System.out.println(brand);
        System.out.print("Model: ");
        System.out.println(model);
    }

    public abstract int calculatePrice();
}
