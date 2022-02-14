package ru.netology.domain.ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class Main {
    public static void main(String[] args) {

        String[] movieList = new String[9]; // это я сначала объявил массив из 10 ячеек.


        MovieItem[] items = new MovieItem[9];  // тут я попытался вызвать элементы класса MovieItem

        //       MovieItem first = new MovieItem(1, "Dirty skunk", "Stinky comedy");
//        System.out.println(first);
//        MovieItem second = new MovieItem(2, "Red tape", "one man history (Documentary)");
//        MovieItem third = new MovieItem(3, "You touch my tra-la-la", "Musical film");
//        MovieItem fourth = new MovieItem(4, "Don Patron", "NarcoThriller");
//        MovieItem fifth = new MovieItem(5, "Merry me", "30 y.o. women instruction");
//        MovieItem sixth = new MovieItem(6, "Eggplant", "Based on Goncharov's Oblomov(Lazy action)");
//        MovieItem seventh = new MovieItem(7, "Wild-wild vest", "Fashion TV documentary");
//        MovieItem eighth = new MovieItem(8, "Vinnie the pig", "Rework of Vinnie the Pooh(Cartoon)");
//        MovieItem ninth = new MovieItem(9, "Nine", "'no' in German(Ordinary german movie)");
//        MovieItem tenth = new MovieItem(10, "Who is who", "How to identify an alien(RenTV doc)");


        private MovieItem[] addMovie (item) { // (тут я пытался создать метод, которые принимает из items)
                String[] temp = new String[movieList.length + 1];  //
        for (int i = 0; i < movieList.length; i++) {
            temp[i] = movieList[i];   // тут я перебираю ячейки из массива, и копирую их во временный массив

        }
        temp[movieList.length - 1] = item;  // затем определяю последнюю ячейку и в нее складываю Фильм (item)

        movieList = tmp; // тут переписываю массив новым
        }
    }
}











