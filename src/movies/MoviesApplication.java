package movies;

import util.Input;

import java.util.Arrays;

public class MoviesApplication {
    public static void main(String[] args) {
        Input input = new Input();

        do {
            printMenu();
            processUserChoice(input.getInt(0, 5));
        } while (true);
    }

    public static void printMenu() {
        System.out.print("What would you like to do?\n\n" +
                        "0 - exit\n" +
                        "1 - view all movies\n" +
                        "2 - view movies in the animated category\n" +
                        "3 - view movies in the drama category\n" +
                        "4 - view movies in the horror category\n" +
                        "5 - view movies in the sci-fi category\n\n" +
                        "Enter your choice: ");
    }

    public static void processUserChoice(int userChoice) {
        Movie[] moviesArray = MoviesArray.findAll();
        Movie[] filteredMovies = {};

        switch (userChoice) {
            case 0:
                System.out.println("\nGoodbye!");
                System.exit(0);
            case 1:
                filteredMovies = moviesArray;
                break;
            case 2:
                filteredMovies = filterMoviesByCategory(moviesArray, "animated");
                break;
            case 3:
                filteredMovies = filterMoviesByCategory(moviesArray, "drama");
                break;
            case 4:
                filteredMovies = filterMoviesByCategory(moviesArray, "horror");
                break;
            case 5:
                filteredMovies = filterMoviesByCategory(moviesArray, "sci-fi");
                break;
        }

        displaySelectedMovies(filteredMovies);
    }

    public static void displaySelectedMovies(Movie[] movies) {
        for(Movie movie : movies) {
            System.out.printf("%s -- %s\n", movie.getName(), movie.getCategory());
        }
    }

    public static Movie[] filterMoviesByCategory(Movie[] moviesToFilter, String category) {
        Movie[] filteredMovies = {};

        for(Movie movie : moviesToFilter) {
            if(movie.getCategory().equals(category)) {
                filteredMovies = Arrays.copyOf(filteredMovies, filteredMovies.length + 1);
                filteredMovies[filteredMovies.length - 1] = movie;
            }
        }

        return filteredMovies;
    }
}