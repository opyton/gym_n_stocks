package com.Gymnstocks.obj.Gym;

import com.Gymnstocks.obj.User;

import java.util.Date;
import java.util.HashMap;

public class GymUser extends User {
    private Date dateSignedUp;
    private String userName, firstName, lastName;

    public GymUser(Date dateSignedUp, String userName, String firstName, String lastName) {
        setDateSignedUp(dateSignedUp);
        setUserName(userName);
        setFirstName(firstName);
        setLastName(lastName);
    }

    public GymUser(HashMap<String,Object> values){
        try{
            values.forEach((k,v)->{
                switch(k){
                    case("userName"):
                        setUserName((String) v);
                        break;
                    case("dateSignedUp"):
                        setDateSignedUp((Date) v);
                        break;
                    case("firstName"):
                        setFirstName((String) v);
                        break;
                    case("lastName"):
                        setLastName((String) v);
                        break;
                    default:
                        break;
                }
            });
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "GymUser{" +
                "dateSignedUp=" + dateSignedUp +
                ", userName='" + userName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public Date getDateSignedUp() {
        return dateSignedUp;
    }

    public void setDateSignedUp(Date dateSignedUp) {
        this.dateSignedUp = dateSignedUp;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
