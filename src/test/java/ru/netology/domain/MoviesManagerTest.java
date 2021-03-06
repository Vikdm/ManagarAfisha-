package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoviesManagerTest {
    MovieManager movieManager = new MovieManager();
    Movies first = new Movies(129292, "Bloodshot", "Action movie");
    Movies second = new Movies(484848, "Onward", "Animated");
    Movies third = new Movies(1143242, "The Gentlemen", "Action movie");
    Movies fourth = new Movies(435, "The Green Mile", "Drama");
    Movies fifth = new Movies(25456, "King Kong", "Drama");
    Movies six = new Movies(12212, "King speak", "Drama");
    Movies seven = new Movies(23322, "Troya", "Drama");
    Movies eight = new Movies(47565, "Alexander", "Drama");
    Movies nine = new Movies(5446, "Lalaland", "Music");
    Movies ten = new Movies(54364, "Alien", "Action movie");
    Movies eleven = new Movies(54645, "Dictator", "Comedy");

    @Test
    public void add() {
        movieManager.add(first);
        movieManager.add(third);
        movieManager.add(fifth);

        Movies[] actual = movieManager.findAll();
        Movies[] expected = {first, third, fifth};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void showLastFilms() {
        MovieManager movieManager = new MovieManager(5);
        movieManager.add(first);
        movieManager.add(second);
        movieManager.add(third);
        movieManager.add(fourth);
        movieManager.add(fifth);
        movieManager.add(six);
        movieManager.add(seven);
        movieManager.add(eight);
        movieManager.add(nine);
        movieManager.add(ten);
        movieManager.add(eleven);


        Movies[] actual = movieManager.showLastFilms();
        Movies[] expected = {eleven, ten, nine, eight, seven};

        assertArrayEquals(actual, expected);

    }

    @Test
    public void showLastFilms1() {
        MovieManager movieManager = new MovieManager(22);
        movieManager.add(first);
        movieManager.add(second);
        movieManager.add(third);
        movieManager.add(fourth);
        movieManager.add(fifth);
        movieManager.add(six);
        movieManager.add(seven);
        movieManager.add(eight);
        movieManager.add(nine);
        movieManager.add(ten);
        movieManager.add(eleven);

        Movies[] actual = movieManager.showLastFilms();
        Movies[] expected = {eleven, ten, nine, eight, seven, six, fifth, fourth, third, second, first};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void showLastFilms2() {
        MovieManager movieManager = new MovieManager(11);
        movieManager.add(first);
        movieManager.add(second);
        movieManager.add(third);
        movieManager.add(fourth);
        movieManager.add(fifth);
        movieManager.add(six);
        movieManager.add(seven);
        movieManager.add(eight);
        movieManager.add(nine);
        movieManager.add(ten);
        movieManager.add(eleven);



        Movies[] actual = movieManager.showLastFilms();
        Movies[] expected = {eleven, ten, nine, eight, seven, six, fifth, fourth, third, second, first};

        assertArrayEquals(actual, expected);
    }
}
