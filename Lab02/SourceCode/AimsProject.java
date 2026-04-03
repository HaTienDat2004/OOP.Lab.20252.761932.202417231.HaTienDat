public class AimsProject {
    public static void main(String[] args) {
        Cart anOrder = new Cart();

        // Khởi tạo DVD phải truyền đủ 5 tham số
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 124, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", "John Musker", 90, 18.99f);

        // Gọi hàm addDVD mới
        anOrder.addDVD(dvd1);
        anOrder.addDVD(dvd2);
        anOrder.addDVD(dvd3);

        // In danh sách giỏ hàng bằng hàm displayCart mới
        anOrder.displayCart();

        // Tính tổng tiền bằng hàm total()
        System.out.print("Total Cost is: ");
        System.out.println(anOrder.total());

        // Gọi hàm xóa mới
        anOrder.removeDVD(dvd2);
    }
}