package com.Gymnstocks.apis;

import com.Gymnstocks.obj.Gym.GymUser;
import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;

@RestController
public class test {

    @GetMapping("/test")
    public ResponseEntity<String> test(){
        HashMap<String,Object> dict = new HashMap<>();
        dict.put("userName","test");
        dict.put("dateSignedUp",new Date());
        dict.put("firstName","first");
        dict.put("lastName","last");
        GymUser user = new GymUser(dict);
        JSONObject obj = new JSONObject();
        obj.put("Message","Hello World!");
        obj.put("other",user.toString());
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(obj.toString());
    }
}
