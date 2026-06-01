package hust.soict.dsai.aims.media.aims.store;

import java.util.ArrayList;

import hust.soict.dsai.aims.media.aims.media.Media;

public class Store {
    // Dùng ArrayList để chứa mặt hàng trong kho
    private ArrayList<Media> itemsInStore = new ArrayList<Media>();

    // Thêm mặt hàng lên kệ
    public void addMedia(Media media) {
        if (!itemsInStore.contains(media)) {
            itemsInStore.add(media);
            System.out.println("Media '" + media.getTitle() + "' has been added to the store.");
        } else {
            System.out.println("Media '" + media.getTitle() + "' is already in the store.");
        }
    }

    // Rút mặt hàng khỏi kệ
    public void removeMedia(Media media) {
        if (itemsInStore.contains(media)) {
            itemsInStore.remove(media);
            System.out.println("Media '" + media.getTitle() + "' has been removed from the store.");
        } else {
            System.out.println("Media '" + media.getTitle() + "' is not found in the store.");
        }
    }
    
    // In danh sách các mặt hàng đang có bán
    public void displayStore() {
        System.out.println("\n--- STORE INVENTORY ---");
        for (Media media : itemsInStore) {
            System.out.println(media.toString());
        }
        System.out.println("-----------------------\n");
    }
}