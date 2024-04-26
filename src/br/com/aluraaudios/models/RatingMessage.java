package br.com.aluraaudios.models;

public class RatingMessage {

    public void rating(Audio audio){
        if(audio.getLikes() == audio.getViews()){
            System.out.println("Todos que ouviram " + audio.getTitle() + " curtiram!");
        } else if (audio.getLikes() < audio.getViews()){
            System.out.println("Veja se " + audio.getTitle()+ " cai no seu gosto!");
        }
    }
}
