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
        int a;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i] == disc) {
                found = true;
                a = i + 1;
                // Dồn các phần tử phía sau lên để lấp vào khoảng trống
                for (int j = i; j < qtyOrdered - 1; j++) {
                    itemsOrdered[j] = itemsOrdered[j + 1];
                }
                // Xóa phần tử bị thừa ở cuối cùng
                itemsOrdered[qtyOrdered - 1] = null; 
                qtyOrdered--;
                System.out.println("The disc "+ a +" has been removed");
                break; 
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
    
    // Hàm in ra cả giỏ hàng
    public void displayAllCart(){
        System.out.println("************CART**********");
        System.out.println("Ordered Items:");
        for (int i = 0; i < qtyOrdered; i++) {
            System.out.printf("%-5d | %-20s | %-20s | %-20s | %-10d | %-10.2f $%n", 
                              (i + 1), 
                              itemsOrdered[i].getTitle(), 
                              itemsOrdered[i].getCategory(), 
                              itemsOrdered[i].getDirector(), 
                              itemsOrdered[i].getLength(), 
                              itemsOrdered[i].getCost());
        }
    }
    // Tìm kiếm DVD theo title
    public void searchByTitle(String title) {
        boolean matchFound = false;
                System.out.println("***************************************************");
        System.out.println("Search results for: '" + title + "'");
        
    // Duyệt qua từng đĩa trong giỏ hàng
    for (int i = 0; i < qtyOrdered; i++) {
        // Sử dụng equalsIgnoreCase để so sánh chuỗi (không phân biệt hoa/thường)
            if (itemsOrdered[i].getTitle().equalsIgnoreCase(title)) {
                System.out.println("-> FOUND: DVD - " + itemsOrdered[i].getTitle() + 
                                   " - " + itemsOrdered[i].getCategory() + 
                                   " - " + itemsOrdered[i].getDirector() + 
                                   " - " + itemsOrdered[i].getLength() + " mins : " + 
                                   itemsOrdered[i].getCost() + " $");
                matchFound = true;
            }
        }
        
        // Nếu duyệt hết giỏ mà không thấy
        if (!matchFound) {
            System.out.println("-> No match found!");
        }
        System.out.println("***************************************************");
    }
    // 1. Hàm Sắp xếp đĩa trong giỏ theo Tên (Sort by title)
    // Sử dụng thuật toán Bubble Sort cơ bản để đổi chỗ các đĩa
    public void sortByTitle() {
        for (int i = 0; i < qtyOrdered - 1; i++) {
            for (int j = 0; j < qtyOrdered - i - 1; j++) {
                // Dùng compareToIgnoreCase để so sánh thứ tự bảng chữ cái (A-Z)
                if (itemsOrdered[j].getTitle().compareToIgnoreCase(itemsOrdered[j + 1].getTitle()) > 0) {
                    // Tráo đổi vị trí 2 đĩa cho nhau
                    DigitalVideoDisc temp = itemsOrdered[j];
                    itemsOrdered[j] = itemsOrdered[j + 1];
                    itemsOrdered[j + 1] = temp;
                }
            }
        }
        System.out.println("-> The cart has been sorted by title (A-Z).");
    }

    // 2. Hàm Chốt đơn đặt hàng (Place an order)
    public void placeOrder() {
        if (qtyOrdered == 0) {
            System.out.println("Your cart is empty. Cannot place an order!");
        } else {
            System.out.println("\n***************************************************");
            System.out.printf("Order placed successfully! Please pay: %.2f $\n", totalCost());
            System.out.println("***************************************************");
            
            // Đặt hàng xong thì phải làm trống giỏ hàng để đón khách mới
            qtyOrdered = 0; 
            for (int i = 0; i < MAX_NUMBERS_ORDERED; i++) {
                itemsOrdered[i] = null; // Xóa sạch bộ nhớ
            }
        }
    }
}