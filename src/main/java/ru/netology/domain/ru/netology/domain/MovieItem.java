package ru.netology.domain.ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@Data
@NoArgsConstructor
public class MovieItem {
    private int id;
    private String movieTitle;
    private String genreOrSummary;

}