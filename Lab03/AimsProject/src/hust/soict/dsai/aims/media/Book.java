package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
    // Thuộc tính riêng của Book
    private List<String> authors = new ArrayList<String>();

    public Book() {
        // Gọi constructor của lớp cha Media
        super(); 
    }

    // Hàm thêm tác giả (Kiểm tra nếu đã tồn tại thì không thêm nữa)
    public void addAuthor(String authorName) {
        if (!authors.contains(authorName)) {
            authors.add(authorName);
            System.out.println("Author '" + authorName + "' has been added.");
        } else {
            System.out.println("Author '" + authorName + "' already exists!");
        }
    }

    // Hàm xóa tác giả (Kiểm tra xem tác giả có tồn tại trong danh sách không)
    public void removeAuthor(String authorName) {
        if (authors.contains(authorName)) {
            authors.remove(authorName);
            System.out.println("Author '" + authorName + "' has been removed.");
        } else {
            System.out.println("Author '" + authorName + "' is not in the list!");
        }
    }

    // Getter và Setter cho authors
    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }
}