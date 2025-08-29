package com.web_api.repository;

import com.web_api.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    public void save(User user){
        if (user.getId() == null){
            System.out.println("SAVE - Recebendo o usuário na camada de repositório");
        } else {
            System.out.println("UPDATE - Recebendo o usuário na camada de repositório");
        }
        System.out.println(user);
    }

    public void deleteById(Integer id){
        System.out.printf("DELETE/id - Recebendo o id: %d para excluir%n", id);
        System.out.println(id);
    }

    public List<User> findAll(){
        System.out.println("LIST - Listando os usuários do sistema");
        List<User> users = new ArrayList<>();
        users.add(new User("Ricardo", "senha"));
        users.add(new User("Julia", "supersenha"));
        return users;
    }

    public User findById(Integer id){
        System.out.printf("FIND/id - Recebendo o id: %d para procurar", id);
        return new User("rick", "senha");
    }

    public User findByName(String username){
        System.out.printf("FIND/username - Recebendo o username: %s para procurar", username);
        return new User("rick", "senha");
    }

}
