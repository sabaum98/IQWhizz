package com.example.iqwhizz;

public class Question {
    private int Qnum;
    private String Statement;
    private int Difficulty;
    private String Subject;

    public int getQnum(){
        return Qnum ;
    }
    public String getStatement(){
        return Statement;
    }
    public int getDifficulty(){
        return Difficulty;
    }
    public String getSubject(){
        return Subject;
    }
    public void setQnum(int Qnum){
        this.Qnum =  Qnum ;
    }
    public void setStatement(String Statement){
        this.Statement =  Statement ;
    }
    public void setDifficulty(int Difficulty){
        this.Difficulty =  Difficulty ;
    }
    public void setSubject(String Subject){
        this.Subject =  Subject ;
    }

}
