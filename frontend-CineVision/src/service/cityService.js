import axios from "axios";
const API = import.meta.env.VITE_MOVIE;


export class CityService {

    getCitiesByMovieId(movieId) {
        return axios.get(API + "cities/getCitiesByMovieId/" + movieId);
    }

    getall() {
        return axios.get(API + "cities/getall");
    }

    addCity(cityDto) {
        return axios.post(API + "cities/addCity", cityDto);
    }
}