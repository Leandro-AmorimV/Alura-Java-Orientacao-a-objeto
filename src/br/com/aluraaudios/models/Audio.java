package br.com.aluraaudios.models;

public class Audio {

    private String title;
    private String author;
    private double timeDuration;
    private int releaseYear;
    private int views;
    private int likes;

    public void displayDataSheet() {
        System.out.println("Nome: " + title);
        System.out.println("Duração: " + timeDuration);
        System.out.println("Acessos: " + views);
        System.out.println("curtidas: " + likes);

    }

    public void play(){
        this.views ++;
    }

    public void likeTheTitle(){
        this.likes++;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getTimeDuration() {
        return timeDuration;
    }

    public int getViews() {
        return views;
    }

    public int getLikes() {
        return likes;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

}
