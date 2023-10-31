public class Main {
    public static void main(String[] args) {
        Product product = new Product("Молоко", "432167814320");

        product.setPrice(1450);
        System.out.println("Имя: " + product.getName());
        System.out.println("БарКод: " + product.getBarCode());
        System.out.println("Цена: " + product.getPrice() + "р.");
    }
}