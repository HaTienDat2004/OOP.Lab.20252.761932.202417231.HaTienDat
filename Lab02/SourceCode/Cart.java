public class Cart {
    // Số lượng tối đa DVD có thể chứa trong giỏ
    public static final int MAX_NUMBERS_ORDERED = 20;
    
    // Mảng lưu trữ các đối tượng DigitalVideoDisc
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    
    // Biến theo dõi số lượng đĩa hiện tại trong giỏ
    private int qtyOrdered = 0;

    // Hàm thêm một đĩa vào giỏ hàng
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc has been added");
        } else {
            System.out.println("The cart is almost full");
        }
    }

    // Hàm xóa một đĩa khỏi giỏ hàng
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        boolean found = false;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i] == disc) {
                found = true;
                // Dồn các phần tử phía sau lên để lấp vào khoảng trống
                for (int j = i; j < qtyOrdered - 1; j++) {
                    itemsOrdered[j] = itemsOrdered[j + 1];
                }
                // Xóa phần tử bị thừa ở cuối cùng
                itemsOrdered[qtyOrdered - 1] = null; 
                qtyOrdered--;
                System.out.println("The disc has been removed");
                break; // Xóa xong thì thoát vòng lặp
            }
        }
        if (!found) {
            System.out.println("The disc is not in the cart.");
        }
    }

    // Hàm tính tổng tiền của toàn bộ giỏ hàng
    public float totalCost() {
        float total = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            total += itemsOrdered[i].getCost();
        }
        return total;
    }
}