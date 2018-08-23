package com.edu.utng.modernlogin.Model;

public class Score {
    private String user;
    private String scoreTest;

    public Score() {

    }

    public Score(String user, String scoreTest) {
        this.user = user;
        this.scoreTest = scoreTest;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getScoreTest() {
        return scoreTest;
    }

    public void setScoreTest(String scoreTest) {
        this.scoreTest = scoreTest;
    }
}
