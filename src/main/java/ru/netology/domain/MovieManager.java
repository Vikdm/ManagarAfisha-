package ru.netology.domain;

public class MovieManager {

    private Movies[] films = new Movies[0];


    public void add(Movies film) {
        int length = films.length + 1;
        Movies[] tmp = new Movies[length];

        System.arraycopy(films, 0, tmp, 0, films.length);
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public Movies[] findAll() {
        return films;
    }

    public Movies[] showLastFilms(int resultLenght) {
        if (resultLenght >= findAll().length) {
            resultLenght = findAll().length;
        }
        Movies[] result = new Movies[resultLenght];
        for (int i = 0; i < result.length; i++) {
            int index = films.length - i - 1;
            result[i] = films[index];
        }
        return result;
    }
}

