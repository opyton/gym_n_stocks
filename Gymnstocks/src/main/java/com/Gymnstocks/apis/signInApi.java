package com.Gymnstocks.apis;

import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class signInApi {
    @PostMapping("/signin")
    public ResponseEntity<String> signin(String str){
        System.out.println("STR: " + str);
        JSONObject obj = new JSONObject();
        obj.put("Message","Hello World!");
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(obj.toString());
    }
}
