package br.com.aluraaudios.models;

public class AudioBook extends Audio implements Genre {

    private String narrators;
    private int pages;
    private double timeStamps;

    public String getNarrators() {
        return narrators;
    }

    public void setNarrators(String narrators) {
        this.narrators = narrators;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public double getTimeStamps() {
        return timeStamps;
    }

    public void setTimeStamps(double timeStamps) {
        this.timeStamps = timeStamps;
    }

    @Override
    public String titleGenre(String genre) {
        return genre;
    }


}
