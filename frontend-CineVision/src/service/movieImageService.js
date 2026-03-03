import axios from "axios";
const API = import.meta.env.VITE_MOVIE;

export class MovieImageService {

    addMovieImage(imageDto) {
        return axios.post(API + "images/add", imageDto);
    }
}