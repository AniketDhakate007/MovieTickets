import axios from "axios";
const API = import.meta.env.VITE_MOVIE;

export class ActorService {

    getActorsByMovieId(movieId) {
        return axios.get(API + "actors/getActorsByMovieId/" + movieId);
    }

    getall() {
        return axios.get(API + "actors/getall");
    }

    addActor(actorDto) {
        return axios.post(API + "actors/add", actorDto);
    }
}