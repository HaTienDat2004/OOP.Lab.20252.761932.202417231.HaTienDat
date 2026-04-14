package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;
public class Store {
    private DigitalVideoDisc[] itemsInStore = new DigitalVideoDisc[100];
    private int qtyInStore = 0;

    public void addDVD(DigitalVideoDisc disc) {
        if (qtyInStore < itemsInStore.length) {
            itemsInStore[qtyInStore] = disc;
            qtyInStore++;
            System.out.println("Added to store: " + disc.getTitle());
        } else {
            System.out.println("Store is full!");
        }
    }

    public void removeDVD(DigitalVideoDisc disc) {
        for (int i = 0; i < qtyInStore; i++) {
            if (itemsInStore[i] == disc) {
                for (int j = i; j < qtyInStore - 1; j++) {
                    itemsInStore[j] = itemsInStore[j + 1];
                }
                itemsInStore[qtyInStore - 1] = null;
                qtyInStore--;
                System.out.println("Removed from store");
                return;
            }
        }
        System.out.println("DVD not found in store");
        
    }
    public void displayStore() {
        for (int i = 0; i < qtyInStore; i++) {
            System.out.println(itemsInStore[i].getTitle());
        }
    }
}