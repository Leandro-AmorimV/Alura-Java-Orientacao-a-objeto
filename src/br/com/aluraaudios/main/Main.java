package br.com.aluraaudios.main;

import br.com.aluraaudios.models.AudioBook;
import br.com.aluraaudios.models.Music;
import br.com.aluraaudios.models.Podcast;
import br.com.aluraaudios.models.RatingMessage;

public class Main {

    public static void main(String[] args) {
        Music music1 = new Music();
        music1.setTitle("Hooligang");
        music1.setAuthor("Joey Valence & Brae");
        music1.titleGenre("Indie");
        music1.setAlbum("PUNK TACTICS");
        music1.play();
        music1.play();
        music1.likeTheTitle();
        music1.likeTheTitle();

        music1.displayDataSheet();

        AudioBook book1 = new AudioBook();
        book1.setTitle("O rei do Inverno");
        book1.setAuthor("Bernard Cornwell");
        book1.titleGenre("Ficção Histórica");
        book1.setNarrators("Guilherme Briggs");
        book1.setPages(544);
        book1.play();
        book1.play();
        book1.likeTheTitle();

        book1.displayDataSheet();

        Podcast podcast1 = new Podcast();
        podcast1.setTitle("NerdCast - Sem Pauta");
        podcast1.setAuthor("Jovem Nerd");
        podcast1.setFeat("Tucano, Sr K., Didi Braguinha");
        podcast1.titleGenre("Sem pauta");
        podcast1.play();


        podcast1.displayDataSheet();

        RatingMessage rating = new RatingMessage();
        rating.rating(music1);
        rating.rating(podcast1);
        rating.rating(book1);

    }
}
