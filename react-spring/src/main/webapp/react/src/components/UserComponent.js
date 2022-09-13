import React from 'react';
import UserService from '../services/UserService';

class UserComponent extends React.Component{
    constructor(props){
        super(props);
        this.state = {
            users:[]
        }
    }

    componentDidMount(){
        UserService.getUsers().then((response) => {
            this.setState({users: response.data});
        });
    }

    render(){
        return (
            <div>
                <h1><h1>Users List</h1></h1>
                <table>
                    <thead>
                        <tr>
                            <th>Id</th>
                            <th>Name</th>
                        </tr>
                    </thead>
                    <tbody>
                        {
                            this.state.users.map( user => {
                                    return (
                                        <tr key={user.id}>
                                            <td>{user.id}</td>
                                            <td>{user.name}</td>
                                        </tr>
                                    )
                                    
                            })
                        }
                    </tbody>

                </table>
                
            </div>
        )
    }
}

export default UserComponent;