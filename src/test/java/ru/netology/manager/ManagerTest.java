package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.MovieItem;

import static org.junit.jupiter.api.Assertions.*;

public class ManagerTest {

    Manager functions = new Manager();

    MovieItem first = new MovieItem(1, "Dirty skunk", "Stinky comedy", 1);
    MovieItem second = new MovieItem(2, "Red tape", "one man history (Documentary)", 2);
    MovieItem third = new MovieItem(3, "You touch my tra-la-la", "Musical film",3);
    MovieItem fourth = new MovieItem(4, "Don Patron", "NarcoThriller", 4);
    MovieItem fifth = new MovieItem(5, "Merry me", "30 y.o. women instruction", 5);
    MovieItem sixth = new MovieItem(6, "Eggplant", "Based on Goncharov's Oblomov(Lazy action)", 6);
    MovieItem seventh = new MovieItem(7, "Wild-wild vest", "Fashion TV documentary", 7);
    MovieItem eighth = new MovieItem(8, "Vinnie the pig", "Rework of Vinnie the Pooh(Cartoon)", 8);
    MovieItem ninth = new MovieItem(9, "Nine", "'no' in German(Ordinary german movie)", 9);
    MovieItem tenth = new MovieItem(10, "Who is who", "How to identify an alien(RenTV doc)", 10);
    MovieItem eleventh = new MovieItem(11, "Batman", "Fantasy", 11);


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

    }

    @Test
    void fiveElementsLimitTest() {
        Manager functions = new Manager(5);
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
        functions.addMovie(eleventh);

        MovieItem[] expected = {eleventh, tenth, ninth, eighth, seventh};
        MovieItem[] actual = functions.showAllReverse();

        assertArrayEquals(expected, actual);

    }

    @Test
    void oneItemLimitTest() {

        Manager functions = new Manager(1);

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
        functions.addMovie(eleventh);

        MovieItem[] expected = {eleventh};
        MovieItem[] actual = functions.showAllReverse();

        assertArrayEquals(expected, actual);

    }

    @Test
    void zeroElementTest() {
        Manager functions = new Manager(0);

        functions.addMovie(eighth);
        functions.addMovie(first);
        functions.addMovie(first);

        MovieItem[] expected = {};
        MovieItem[] actual = functions.showAllReverse();

        assertArrayEquals(expected, actual);

    }

}