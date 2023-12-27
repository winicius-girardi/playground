package teste.quizz;

public class Player {
    private String name;
    private int rightAnswers;
    private int wrongAnswers;

    public Player(String name){
        this.name=name;
        this.rightAnswers=0;
        this.wrongAnswers=0;
    }
    public void addRightAnswers(){
        this.rightAnswers++;
    }
    public void addWrongAnswers(){
        this.wrongAnswers++;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }



}
