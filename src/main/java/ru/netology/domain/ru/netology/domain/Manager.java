package ru.netology.domain.ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Manager {
    MovieItem[] items = new MovieItem[0];


    void addMovie(MovieItem item) {

        int length = items.length + 1;
        MovieItem[] tmp = new MovieItem[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }


    MovieItem[] showAll() {
        return items;
    }

    MovieItem[] showAllReverse() {

        MovieItem[] result = new MovieItem[items.length];

        for (int i = 0, j = result.length - 1; i < items.length; i++, j--) {

            result[j] = items[i];
        }
        items = result;
        return items;
    }
}






