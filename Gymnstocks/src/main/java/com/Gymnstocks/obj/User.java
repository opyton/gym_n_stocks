package com.Gymnstocks.obj;

public class User {
    private int userId;
    private String apiKey;

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", apiKey='" + apiKey + '\'' +
                '}';
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }
}
