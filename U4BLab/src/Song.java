public class Song {
    private String name;
    private String artist;
    private String album;
    private int index;
    private int year;
    private String genre;

    public Song(String name, String artist, String album, int index, int year, String genre){
        this.album = album;
        this.artist = artist;
        this.name = name;
        this.index = index;
        this.year = year;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public int getYear() {
        return year;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getArtist() {
        return artist;
    }

    public String getGenre() {
        return genre;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString(){
        return String.format("%-50s %-40s %-30s %-20d %-10d %-5s", name, artist, album, index, year, genre);
    }
}
