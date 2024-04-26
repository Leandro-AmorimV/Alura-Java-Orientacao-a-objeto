package br.com.aluraaudios.models;

public class Podcast extends Audio implements Genre {

    private int epsiode;
    private String feat;

    public int getEpsiode() {
        return epsiode;
    }

    public void setEpsiode(int epsiode) {
        this.epsiode = epsiode;
    }

    public String getFeat() {
        return feat;
    }

    public void setFeat(String feat) {
        this.feat = feat;
    }

    @Override
    public String titleGenre(String genre) {
        return genre;
    }
}
