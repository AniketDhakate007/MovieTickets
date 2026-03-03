import axios from "axios";
const API = import.meta.env.VITE_MOVIE;

export class DirectorService{

    getall() {
        return axios.get(API + "directors/getall")
    }

    add(director) {
        return axios.post(API + "directors/add", director);
    }
}