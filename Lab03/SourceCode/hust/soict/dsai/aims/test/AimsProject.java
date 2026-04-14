package hust.soict.dsai.aims.test;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store;

public class AimsProject {
    public static void main(String[] args) {
        // Khởi tạo một giỏ hàng mới
        Cart anOrder = new Cart();

        // Tạo mới các đối tượng đĩa DVD
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", "", 0, 18.99f);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Dumamay", "Japanese Adult Video", "Ha Tien Dat", 60, 15.11f);

        // Thêm đĩa vào giỏ hàng
        anOrder.addDigitalVideoDisc(dvd1);
        anOrder.addDigitalVideoDisc(dvd2);
        anOrder.addDigitalVideoDisc(dvd3);
        anOrder.addDigitalVideoDisc(dvd4);

        // Chạy thử tính năng in ra giỏ hàng
        anOrder.displayAllCart();


        // In ra tổng chi phí của giỏ hàng
        System.out.print("Total Cost is: ");
        System.out.println(anOrder.totalCost());

        // Chạy thử tính năng xóa đĩa khỏi giỏ
        anOrder.removeDigitalVideoDisc(dvd2);
        
        // Chạy thử tính năng seartDVD by title
        anOrder.searchAndPrintByTitle("The Lion King");

        // Chạy thử tính năng thanh toán tiền
        anOrder.placeOrder();


        Cart cart = new Cart();

        DigitalVideoDisc dvd5 = new DigitalVideoDisc("Jungle");
        dvd1.setCost(10);

        DigitalVideoDisc dvd6 = new DigitalVideoDisc("Cinderella");
        dvd2.setCost(20);

        cart.addDigitalVideoDisc(dvd5);
        cart.addDigitalVideoDisc(dvd6);

        cart.print();
        DigitalVideoDisc result = cart.searchByTitle("Jungle");

        if (result != null) {
            System.out.println("Found: " + result.getTitle());
        } else {
            System.out.println("Not found");
        }
        Store store = new Store();
        store.addDVD(dvd1);
        store.addDVD(dvd2);
        store.displayStore();
    }
}