package hust.soict.dsai.aims.media;

// Thêm implements Playable
public class Track implements Playable {
    private String title;
    private int length;

    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    public String getTitle() { return title; }
    public int getLength() { return length; }

    // Thêm hàm play()
    @Override
    public void play() {
        System.out.println("Playing track: " + this.getTitle());
        System.out.println("Track length: " + this.getLength());
    }
    // Ghi đè hàm equals để so sánh 2 Track theo Title và Length
    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Track)) {
            return false;
        }
        Track track = (Track) obj;
        return track.getTitle() != null && 
               track.getTitle().equals(this.getTitle()) && 
               track.getLength() == this.getLength();
    }
}