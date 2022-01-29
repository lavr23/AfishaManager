package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Movie;

import static org.junit.jupiter.api.Assertions.*;

class MovieManagerTest {
    @Test
    public void shouldAdd() {
        MovieManager manager = new MovieManager(10);
        Movie first = new Movie(1, "Bladshot", "http1", "triller");
        Movie second = new Movie(2, "Vpered", "http2", "cartoon");
        Movie third = new Movie(3, "Dzhentelmeny", "http3", "comedy");

        manager.add(first);
        manager.add(second);
        manager.add(third);

        Movie[] actual = manager.getAll();
        Movie[] expected = new Movie[]{third, second, first};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetEmpty() {
        MovieManager manager = new MovieManager(10);
        Movie[] actual = manager.getAll();
        Movie[] expected = new Movie[]{};

        assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldGetMovieQty() {

        MovieManager manager = new MovieManager(7);
        Movie first = new Movie(1, "Bladshot", "http1", "triller");
        Movie second = new Movie(2, "Vpered", "http2", "cartoon");
        Movie third = new Movie(3, "Dzhentelmeny", "http3", "comedy");
        Movie fourth = new Movie(4, "Gipnoz", "http4", "drama");
        Movie fifth = new Movie(5, "Siyanie", "http5", "triller");
        Movie sixth = new Movie(6, "Ogon'", "http6", "drama");
        Movie seventh = new Movie(7, "Donkihot", "http7", "cartoon");
        Movie eighth = new Movie(8, "Otec", "http8", "drama");
        Movie ninth = new Movie(9, "Mejnstrim", "http9", "comedy");
        Movie tenth = new Movie(10, "Pugalo", "http10", "drama");

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);

        Movie[] actual = manager.getLastMovie();
        Movie[] expected = new Movie[]{tenth, ninth, eighth, seventh, sixth, fifth, fourth};

        assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldNoMovie() {
        MovieManager manager = new MovieManager(10);
        Movie[] actual = manager.getLastMovie();
        Movie[] expected = new Movie[]{};
    }
}