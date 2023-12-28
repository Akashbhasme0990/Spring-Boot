package skye.sky.Rest;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import skye.sky.Entity.User;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class userRestConrtoller {
    private  List<User> theUsers;
    @PostConstruct
    public  void  loadData(){
        theUsers = new ArrayList<>();
        theUsers.add(new User(1234,"akashbhasme09@gmail.com", "akash09", "sky@2001", "imageess", "bioooooo"));
        // Add more users if needed
    }
    @GetMapping("/Users")
    public List<User> getUsers() {


        return theUsers;
    }
    @GetMapping("/Users/{userId}")
    public  User getUser(@PathVariable int userId)  {

        if((userId >= theUsers.size())|| (userId<0)){
            throw new userNotFound("User id no found- "+ userId);
        }
        return  theUsers.get(userId);
    }

    }
