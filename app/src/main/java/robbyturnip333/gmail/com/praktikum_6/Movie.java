package robbyturnip333.gmail.com.praktikum_6;

/**
 * Created by robby on t11/04/18.
 */

public class Movie {
    private String title, genre, year,bintang;
    int cover;
    public Movie(String title, String genre, String year, String bintang, int cover) {
        this.title = title;
        this.genre = genre;
        this.year = year;
        this.bintang=bintang;
        this.cover=cover;
    }
    public Movie(){

    }
    public String getTitle() {
        return title;
    }public void setTitle(String name) {
        this.title = name;
    }
    public String getYear() {
        return year;
    }
    public void setYear(String year) {
        this.year = year;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public void setBintang(String bintang){
        this.bintang=bintang;
    }
    public String getBintang(){
        return bintang;
    }
    public void setCover(int cover){
        this.cover=cover;
    }
    public int getCover(){
        return cover;
    }
}