package hust.soict.dsai.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable{
    private String artist;
    private ArrayList<Track> tracks = new ArrayList<Track>();

    public CompactDisc(String title, String category, String artist, String director, float cost) {
        super(title, category, director, cost);
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    public void addTrack(Track track) {
        if (!tracks.contains(track)) {
            tracks.add(track);
            System.out.println("Track '" + track.getTitle() + "' has been added.");
        } else {
            System.out.println("Track '" + track.getTitle() + "' already exists in CD.");
        }
    }

    public void removeTrack(Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
            System.out.println("Track '" + track.getTitle() + "' has been removed.");
        } else {
            System.out.println("Track '" + track.getTitle() + "' is not in the CD.");
        }
    }

    // Ghi đè hàm getLength() của lớp cha Disc để tự tính tổng thời gian các Track
    @Override
    public int getLength() {
        int totalLength = 0;
        for (Track track : tracks) {
            totalLength += track.getLength();
        }
        return totalLength;
    }
    // Ghi đè hàm play() của giao diện Playable
    @Override
    public void play() {
        System.out.println("Playing CD: " + this.getTitle());
        System.out.println("CD length: " + this.getLength() + " mins");
        
        // Vòng lặp để phát từng track trong đĩa CD
        for (Track track : tracks) {
            track.play();
        }
    }
}