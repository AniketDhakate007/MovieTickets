import axios from "axios";
const API = import.meta.env.VITE_MOVIE;

export class CommentService {

    getCommentsByMovieId(movieId, pageNo, pageSize=5) {
        return axios.get(API + "comments/getCommentsByMovieId/" + movieId + "/" + pageNo + "/" + pageSize);
    }

    getCountOfComments(movieId) {
        return axios.get(API + "comments/getCountOfComments/" + movieId);
    }

    addComment(commentDto) {
        return axios.post(API + "comments/add" , commentDto);
    }

    deleteComment(deleteCommentDto) {
        return axios.post(API + "comments/delete" , deleteCommentDto);
    }
}