import axios from 'axios'
const USERS_REST_API_URL='http://localhost:1707/users';

 export default new class UserService{
getUsers()
{

    return axios.get(USERS_REST_API_URL);
}

}
