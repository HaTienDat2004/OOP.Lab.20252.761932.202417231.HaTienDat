public class TestPassingParameter {

    public static void main(String[] args) {
        // Tạo ra 2 đĩa DVD
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");

        // Thử hoán đổi (swap) 2 đĩa cho nhau
        swap(jungleDVD, cinderellaDVD);
        
        // In ra màn hình để xem tên đĩa có thực sự bị hoán đổi không
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
        System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());
    }

    // Hàm hoán đổi 2 đối tượng
    public static void swap(Object o1, Object o2) {
        Object tmp = o1;
        o1 = o2;
        o2 = tmp;
    }
}