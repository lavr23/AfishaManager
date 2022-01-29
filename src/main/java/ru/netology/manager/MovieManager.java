package ru.netology.manager;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.netology.domain.Movie;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class MovieManager {
    private Movie[] items = new Movie[0];
    private int MovieQty;

    public MovieManager(int MovieQty) {
        this.MovieQty = MovieQty;
    }

    public void add(Movie item) {
        int length = items.length + 1;
        Movie[] tmp = new Movie[length];

        System.arraycopy(items, 0, tmp, 0, items.length);

        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public Movie[] getAll() {

        Movie[] result = new Movie[items.length];
        for (int i = 0; i < items.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }

    public Movie[] getLastMovie() {
        int length = MovieQty;
        if (length > items.length) {
            length = items.length;
        }

        Movie[] result = new Movie[length];

        for (int i = 0; i < length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }
}
