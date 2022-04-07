package ru.netology.domain;


import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class MovieItem {

    private int id;
    private String movieTitle;
    private String genreOrSummary;
    private int count;

    public MovieItem(int id, String movieTitle, String genreOrSummary, int count) {
        this.id = id;
        this.movieTitle = movieTitle;
        this.genreOrSummary = genreOrSummary;
        this.count = count;
    }

}