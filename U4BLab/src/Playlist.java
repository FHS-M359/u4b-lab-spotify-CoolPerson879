import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Playlist {
    Scanner in = new Scanner(System.in);
    Scanner file = new Scanner(new File("spotify_unique_years_artists.txt"));
    ArrayList<Song> songs = new ArrayList<>();
    public Playlist() throws FileNotFoundException {
        readFile();
    }

    public void readFile(){
        while(file.hasNextLine()){
            String line = file.nextLine();
            String[] lineArr = line.split(",");
            Song song = new Song(lineArr[0], lineArr[1], lineArr[2], Integer.parseInt(lineArr[3]), Integer.parseInt(lineArr[4]), lineArr[5]);
            songs.add(song);
        }
        for(Song s : songs)
            System.out.println(s.toString());
    }

}
