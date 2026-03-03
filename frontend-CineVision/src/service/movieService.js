import axios from "axios";
const API = import.meta.env.VITE_MOVIE;

export class MovieService {

    getAllDisplayingMovies() {
        return axios.get(API + "movies/displayingMovies");
    }

    getAllComingSoonMovies() {
        return axios.get(API + "movies/comingSoonMovies");
    }

    getMovieById(movieId) {
        return axios.get(API + "movies/"+ movieId);
    }

    addMovie(movieDto) {
        return axios.post(API + "movies/add", movieDto);
    }
}