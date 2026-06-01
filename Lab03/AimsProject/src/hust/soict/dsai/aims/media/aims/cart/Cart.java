package hust.soict.dsai.aims.media.aims.cart;

import java.util.ArrayList; // Thêm thư viện ArrayList
import hust.soict.dsai.aims.media.Media; // Import lớp Media vào

public class Cart {
    // 1. Dùng ArrayList thay vì mảng cũ cồng kềnh, không cần biến qtyOrdered nữa
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();

    // 2. Hàm thêm Media (Book, CD, DVD đều thêm được hết)
    public void addMedia(Media media) {
        if (!itemsOrdered.contains(media)) {
            itemsOrdered.add(media);
            System.out.println("The media '" + media.getTitle() + "' has been added to cart.");
        } else {
            System.out.println("The media '" + media.getTitle() + "' is already in the cart.");
        }
    }

    // 3. Hàm xóa Media
    public void removeMedia(Media media) {
        if (itemsOrdered.contains(media)) {
            itemsOrdered.remove(media);
            System.out.println("The media '" + media.getTitle() + "' has been removed from cart.");
        } else {
            System.out.println("The media '" + media.getTitle() + "' is not in the cart.");
        }
    }

    // 4. Hàm tính tổng tiền nâng cấp
    public float total() {
        float total = 0;
        // Vòng lặp siêu ngắn gọn của ArrayList
        for (Media media : itemsOrdered) {
            total += media.getCost();
        }
        return total;
    }

    // 5. Nâng cấp hàm in giỏ hàng
    public void displayCart() {
        System.out.println("\n***********************CART***********************");
        System.out.println("Ordered Items:");
        for (int i = 0; i < itemsOrdered.size(); i++) {
            // Nhờ tính Đa hình, gọi toString() nó sẽ tự biết in ra Book hay DVD
            System.out.println((i + 1) + ". " + itemsOrdered.get(i).toString());
        }
        System.out.printf("Total cost: %.2f $\n", total());
        System.out.println("***************************************************\n");
    }

    // 6. Nâng cấp hàm tìm kiếm
    public void searchByTitle(String title) {
        boolean matchFound = false;
        System.out.println("Search results for keyword: '" + title + "'");
        String keyword = title.toLowerCase();
        
        for (Media media : itemsOrdered) {
            if (media.getTitle().toLowerCase().contains(keyword)) {
                System.out.println("-> FOUND: " + media.toString());
                matchFound = true;
            }
        }
        if (!matchFound) {
            System.out.println("-> No match found!");
        }
        System.out.println("---------------------------------------------------");
    }
}