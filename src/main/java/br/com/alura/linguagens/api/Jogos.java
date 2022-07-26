package br.com.alura.linguagens.api;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "jogosKIDS")
public class Jogos {

    @Id
    private String id;
    private String title;
   // private String link;
    private String image;
    private int ranking;
    

    public Jogos() {

    }

    //public Jogos(String title, String link, int ranking, String image) {
    public Jogos(String title, String image, int ranking) {
        this.title = title;
        //this.link = link;
        this.image = image;
        this.ranking = ranking;
        
    }

    public void setTitle(String title) {
        this.title = title;
    }

//    public void setLink(String link) {
//        this.link = link;
//    }

    public void setImage(String image) {
        this.image = image;
    }   

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }



    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
    public String getImage() {
        return image;
    }
//    public String getLink() {
 //       return link;
//    }
    public int getRanking() {
        return ranking;
    }



}
