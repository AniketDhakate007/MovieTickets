import axios from "axios";
const API = import.meta.env.VITE_MOVIE;

export class SaloonTimeService {

    getMovieSaloonTimeSaloonAndMovieId(saloonId, movieId) {
        return axios.get(API + "movieSaloonTimes/getMovieSaloonTimeSaloonAndMovieId/" + saloonId + "/" + movieId);
    }

}