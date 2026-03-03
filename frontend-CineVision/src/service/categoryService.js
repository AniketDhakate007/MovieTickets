import axios from "axios";
const API = import.meta.env.VITE_MOVIE;

export class CategoryService{

    getall() {
        return axios.get(API + "categories/getall")
    }
}