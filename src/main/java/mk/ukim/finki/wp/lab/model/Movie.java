package mk.ukim.finki.wp.lab.model;

import lombok.Data;

@Data
public class Movie {
    private Production production;
    String title;
    String summary;
    double rating;

    private Long id;
    public Movie(String title, String summary, double rating) {
        this.title = title;
        this.summary = summary;
        this.rating = rating;
    }

    public Movie() {

    }

    public String getTitle() {
        return title;
    }

    public String getSummary() {
        return summary;
    }

    public double getRating() {
        return rating;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getMovieTitle() {
        return title;
    }
}
