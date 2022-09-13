import axios from 'axios';

const REST_URL = "http://localhost:8080/api/users"

class UserService {
    getUsers(){
        return axios.get(REST_URL);
    }
}

export default new UserService();