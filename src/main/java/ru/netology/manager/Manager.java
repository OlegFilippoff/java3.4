package ru.netology.manager;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.netology.domain.MovieItem;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Manager {
    MovieItem[] items = new MovieItem[0];


    public void addMovie(MovieItem item) {

        int length = items.length + 1;
        MovieItem[] tmp = new MovieItem[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }


    public MovieItem[] showAll() {
        return items;
    }

    public MovieItem[] showAllReverse() {

        int resultLength = 0;

        if (resultLength >= 10) {
            resultLength = 10;
        } else {
            resultLength = items.length;
        }

        MovieItem[] result = new MovieItem[resultLength];

        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            if (items[index] != null) {
                result[i] = items[index];
            }

        }

        return result;
    }

}







