public class AimsProject {
    public static void main(String[] args) {
        // Khởi tạo một giỏ hàng mới
        Cart anOrder = new Cart();

        // Tạo mới các đối tượng đĩa DVD
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);

        // Thêm đĩa vào giỏ hàng
        anOrder.addDigitalVideoDisc(dvd1);
        anOrder.addDigitalVideoDisc(dvd2);
        anOrder.addDigitalVideoDisc(dvd3);

        // In ra tổng chi phí của giỏ hàng
        System.out.print("Total Cost is: ");
        System.out.println(anOrder.totalCost());

        // Chạy thử tính năng xóa đĩa khỏi giỏ
        anOrder.removeDigitalVideoDisc(dvd2);
    }
}