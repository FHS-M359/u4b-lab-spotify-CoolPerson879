import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.out;

public class Playlist {

    ArrayList<Song> songs = new ArrayList<>();

    public Playlist(Scanner file) throws FileNotFoundException {
        readFile(file);
    }

    public void readFile(Scanner file) {
        while (file.hasNextLine()) {
            String line = file.nextLine();
            String[] lineArr = line.split(",");
            Song song = new Song(lineArr[0], lineArr[1], lineArr[2], Integer.parseInt(lineArr[3]), Integer.parseInt(lineArr[4]), lineArr[5]);
            songs.add(song);
        }
    }


    public void SortYear() {
        ArrayList<Song> temp = new ArrayList<>();
        temp = songs;
        int min = Integer.MAX_VALUE;
        int index = -1;
        ArrayList<Song> out = new ArrayList<>();
        while (temp.size() > 1) {
            for (int i = 0; i < temp.size(); i++) {
                if (temp.get(i).getYear() < min) {
                    index = i;
                    min = temp.get(i).getYear();
                }
            }
            out.add(temp.get(index));
            temp.remove(index);
        }
        out = songs;

    }

    public String toString() {
        String out = "";
        for (Song s : songs)
            //noinspection StringConcatenationInLoop annoying yellow line
            out += songs + "\n";
        return out;
    }

    public void searchGenre(String s) {
        ArrayList<Song> out = new ArrayList<>();
        for (Song c : songs) {
            if (c.getGenre().equalsIgnoreCase(s)) {
                out.add(c);
            }
        }
        if (out.isEmpty())
            System.out.println("no songs found with given query");
        for (Song f : out)
            System.out.println(f);
    }

    public String SelectionSortAZArtist() {
        ArrayList<Song> list = new ArrayList<>();
        for (Song s : songs)
            list.add(s);


        for (int i = 0; i < list.size() - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j).getArtist().compareToIgnoreCase(list.get(minIndex).getArtist()) < 0)
                    minIndex = j;

                //swap values
                Song temp = list.get(i);
                list.set(i, list.get(minIndex));
                list.set(minIndex, temp);

            }

        }
        for (Song s : list)
            System.out.println(s);

        return "";

    }

    public String SelectionSortZAArtist() {
        ArrayList<Song> list = new ArrayList<>();
        for (Song s : songs)
            list.add(s);


        for (int i = 0; i < list.size() - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j).getArtist().compareToIgnoreCase(list.get(minIndex).getArtist()) > 0)
                    minIndex = j;

                //swap values
                Song temp = list.get(i);
                list.set(i, list.get(minIndex));
                list.set(minIndex, temp);

            }

        }
        for (Song s : list)
            System.out.println(s);

        return "";

    }

    public void InsertionSortYearNewToOld(){
        ArrayList<Song> list = new ArrayList<>();
        list = songs;
        for (int i = 0; i < list.size(); i++) {
            Song tempValue = list.get(i);
            // saves element value
            int position = i;
            // shift elements if necessary
            while(position > 0 && list.get(position-1).getYear() > tempValue.getYear()){
                list.set(position, list.get(position-1));
                position--;
            }
            // insert value in shifted position
            list.set(position, tempValue);

        }
        for (Song s : list)
            System.out.println(s);


    }

    public void InsertionSortYearOldToNew(){
        ArrayList<Song> list = new ArrayList<>();
        list = songs;
        for (int i = 0; i < list.size(); i++) {
            Song tempValue = list.get(i);
            // saves element value
            int position = i;
            // shift elements if necessary
            while(position > 0 && list.get(position-1).getYear() < tempValue.getYear()){
                list.set(position, list.get(position-1));
                position--;
            }
            // insert value in shifted position
            list.set(position, tempValue);

        }
        for (Song s : list)
            System.out.println(s);


    }
    }


