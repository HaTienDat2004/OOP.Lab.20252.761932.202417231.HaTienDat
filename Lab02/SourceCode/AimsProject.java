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
        anOrder.searchByTitle("The Lion King");

    }
}