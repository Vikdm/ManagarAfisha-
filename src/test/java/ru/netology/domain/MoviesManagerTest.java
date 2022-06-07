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

    @Test
    public void add() {
        movieManager.add(first);
        movieManager.add(third);

        Movies[] actual = movieManager.findAll();
        Movies[] expected = {first, third};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void showLastFilms() {
        movieManager.add(first);
        movieManager.add(second);
        movieManager.add(third);
        movieManager.add(fourth);
        movieManager.showLastFilms();

        Movies[] actual = movieManager.showLastFilms();
        Movies[] expexted = {fourth,third};

        assertArrayEquals(actual,expexted);

    }
}
