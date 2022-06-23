package ru.netology.domain;

public class MovieManager {

    private Movies[] films = new Movies[0];
    private int resultLenght;


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

    public void movieLimit(int resultLenght) {
        this.resultLenght = resultLenght;
    }

    public Movies[] showLastFilms() {
        Movies[] result;
        if (resultLenght < films.length) {
            result = new Movies[resultLenght];
        } else {
            result = new Movies[films.length];
        }
        for (int i = 0; i < result.length; i++) {
            int index = films.length - i - 1;
            result[i] = films[index];
        }
        return result;
    }
}

