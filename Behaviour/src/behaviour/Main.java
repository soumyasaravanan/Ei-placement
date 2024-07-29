/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package behaviour;

/**
 *
 * @author soumya
 */import java.util.ArrayList;
import java.util.Iterator;

class Song {
    private String title;
    private String artist;

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }
}

class Playlist implements Iterable<Song> {
    private ArrayList<Song> songs;

    public Playlist() {
        songs = new ArrayList<>();
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    @Override
    public Iterator<Song> iterator() {
        return new PlaylistIterator(songs);
    }
}

class PlaylistIterator implements Iterator<Song> {
    private ArrayList<Song> songs;
    private int index;

    public PlaylistIterator(ArrayList<Song> songs) {
        this.songs = songs;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < songs.size();
    }

    @Override
    public Song next() {
        if (!hasNext()) {
            throw new IndexOutOfBoundsException();
        }
        return songs.get(index++);
    }
}

public class Main {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        playlist.addSong(new Song("Song 1", "Artist 1"));
        playlist.addSong(new Song("Song 2", "Artist 2"));
        playlist.addSong(new Song("Song 3", "Artist 3"));

        for (Song song : playlist) {
            System.out.println(song.getTitle() + " by " + song.getArtist());
        }
    }
}