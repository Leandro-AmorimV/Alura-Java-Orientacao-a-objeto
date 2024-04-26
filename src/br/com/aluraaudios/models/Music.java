package br.com.aluraaudios.models;

public class Music extends Audio implements Genre {

    private String album;

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getAlbum() {
        return album;
    }

    @Override
    public String titleGenre(String genre) {
        return genre;
    }
}
