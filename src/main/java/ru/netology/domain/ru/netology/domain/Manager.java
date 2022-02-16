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

        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i]);
            tmp[i] = items[i];

        }
        //    System.arraycopy(items, 0, tmp, 0, items.length);

        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;

    }

    MovieItem[] showAll() {

        MovieItem[] list = new MovieItem[items.length];

        for (int i = 0; i < list.length; i++) {

            int index = items.length - i - 1;
            list[i] = items[i];

        }
        items = list;
        return items;
    }

    MovieItem[] showAllReverse() {

        int length = items.length;
        MovieItem[] tmp2 = new MovieItem[length];
        int copyToIndex = length;
        for (int i = 0; i < items.length; i++) {
//            System.out.println(items[i]);
            copyToIndex--;
            tmp2[copyToIndex] = items[i];
//            System.out.println(copyToIndex);


//            System.out.println(tmp2);


        }
        items = tmp2;
        System.out.println(items);

        return this.items;
    }
}






