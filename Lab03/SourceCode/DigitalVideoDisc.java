public class DigitalVideoDisc {
    // Khai báo các thuộc tính private (Đóng gói)
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;

    private static int nbDigitalVideoDiscs = 0;

    // ----------------- CONSTRUCTORS ----------------- //

    // 1. Tạo DVD chỉ bằng title
    public DigitalVideoDisc(String title) {
        super();
        this.title = title;
        nbDigitalVideoDiscs++;
    }

    // 2. Tạo DVD bằng category, title và cost
    public DigitalVideoDisc(String category, String title, float cost) {
        super();
        this.category = category;
        this.title = title;
        this.cost = cost;
    }

    // 3. Tạo DVD bằng director, category, title và cost
    public DigitalVideoDisc(String director, String category, String title, float cost) {
        super();
        this.director = director;
        this.category = category;
        this.title = title;
        this.cost = cost;
    }

    // 4. Tạo DVD bằng đầy đủ tất cả các thuộc tính
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super();
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }

    // ------------------- GETTERS ------------------- //
    
    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    public float getCost() {
        return cost;
    }
    
    public static int getNbDigitalVideoDiscs(){
       return nbDigitalVideoDiscs;
    }

    // --------------------SETTERS----------------------//
    public void setTitle(String title) {
    this.title = title;
    }
    public void setCost(float cost) {
        this.cost = cost;
    }


}