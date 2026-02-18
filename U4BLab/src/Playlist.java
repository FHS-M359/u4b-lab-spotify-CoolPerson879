import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Playlist {
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
    }


    public void SortYear(){
        ArrayList<Song> temp = new ArrayList<>();
        temp = songs;
        int min = Integer.MAX_VALUE;
        int index = -1;
        ArrayList<Song> out = new ArrayList<>();
        while(temp.size() > 1){
        for (int i = 0; i < temp.size(); i++) {
            if(temp.get(i).getYear() < min){
                index = i;
                min = temp.get(i).getYear();
            }
        }
        out.add(temp.get(index));
        temp.remove(index);
        }
        out = songs;

    }

    public String toString(){
        String out = "";
        for (Song s : songs)
            //noinspection StringConcatenationInLoop annoying yellow line
            out += songs + "\n";
        return out;
    }

    public void searchGenre(String s){
        ArrayList<Song> out = new ArrayList<>();
        for (Song c : songs){
            if(c.getGenre().equalsIgnoreCase(s)){
                out.add(c);
            }
        }
        if(out.isEmpty())
            System.out.println("no songs found with given query");
        songs = out;
        System.out.println(this);
    }

    public static ArrayList<String> SelectionSortAZArtist(ArrayList<String> list){
        for (int i = 0; i < list.size() - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j).compareToIgnoreCase(list.get(minIndex)) < 0)
                    minIndex = j;

                //swap values
                String temp = list.get(i);
                list.set(i, list.get(minIndex));
                list.set(minIndex, temp);

            }
        }
        return list;
    }


}
