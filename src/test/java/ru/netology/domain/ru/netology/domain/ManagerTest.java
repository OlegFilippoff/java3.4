package ru.netology.domain.ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {

    Manager functions = new Manager();

    MovieItem first = new MovieItem(1, "Dirty skunk", "Stinky comedy");
    MovieItem second = new MovieItem(2, "Red tape", "one man history (Documentary)");
    MovieItem third = new MovieItem(3, "You touch my tra-la-la", "Musical film");
    MovieItem fourth = new MovieItem(4, "Don Patron", "NarcoThriller");
    MovieItem fifth = new MovieItem(5, "Merry me", "30 y.o. women instruction");
    MovieItem sixth = new MovieItem(6, "Eggplant", "Based on Goncharov's Oblomov(Lazy action)");
    MovieItem seventh = new MovieItem(7, "Wild-wild vest", "Fashion TV documentary");
    MovieItem eighth = new MovieItem(8, "Vinnie the pig", "Rework of Vinnie the Pooh(Cartoon)");
    MovieItem ninth = new MovieItem(9, "Nine", "'no' in German(Ordinary german movie)");
    MovieItem tenth = new MovieItem(10, "Who is who", "How to identify an alien(RenTV doc)");

    //    @BeforeAll
//    public void setUp() {
//        functions.addMovie(fifth);
//    }

    @Test
    public void addMovieTest() {

        functions.addMovie(first);
        functions.addMovie(second);
        functions.addMovie(third);
        functions.addMovie(fourth);
        functions.addMovie(fifth);
        functions.addMovie(sixth);
        functions.addMovie(seventh);
        functions.addMovie(eighth);
        functions.addMovie(ninth);
        functions.addMovie(tenth);

        MovieItem[] expected = {first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth};
        MovieItem[] actual = functions.getItems();

        assertArrayEquals(expected, actual);
    }


    @Test
    public void shouldDuplicateItemsTest() {
        functions.addMovie(fifth);
        functions.addMovie(fifth);

        MovieItem[] expected = functions.getItems();
        MovieItem[] actual = functions.showAll();
        assertArrayEquals(expected, actual);
    }

    @Test

    public void showAllTest() {

        functions.addMovie(first);
        functions.addMovie(second);
        functions.showAll();

        MovieItem[] expected = {first, second};
        MovieItem[] actual = functions.showAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void showAllTestFirstAndLast() {

        functions.addMovie(first);
        functions.addMovie(tenth);
        functions.showAll();

        MovieItem[] expected = functions.getItems();
        MovieItem[] actual = functions.showAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void showAllReverse() {
        functions.addMovie(first);
        functions.addMovie(second);
        functions.addMovie(third);

        MovieItem[] expected = {third, second, first};
        MovieItem[] actual = functions.showAllReverse();

        assertArrayEquals(expected, actual);

        /*тест выполняется, в дебаггере пошагово выполняются все операции, нужные ячейки принимают нужные значения
        (0  это фильм ID 3, 1 это фильм ID 2, 2 это фильм ID 1),
          но при выводе sout почему-то дублируется фильм ID 1 на 1-ю и вторую строку вывода, а ID 3 не выдается в выводе на терминале
           не могу понять почему так */
    }

}