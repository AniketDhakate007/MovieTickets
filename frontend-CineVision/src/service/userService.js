import axios from "axios";
const API = import.meta.env.VITE_USER;

export class UserService {


    addCustomer(customer) {
        return axios.post(API + "add", customer);
    }

    login(loginDto) {
        return axios.post(API + "auth/login", loginDto);
    }
}