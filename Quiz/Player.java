package Entrega.Compass.Quiz;

public class Player {
    private String name;
    private int rightAnswers;
    private int wrongAnswers;

    public Player(String name){
        this.name=name;
        this.rightAnswers=0;
        this.wrongAnswers=0;
    }
    public void checkAnswers(char answer,int index){
        if (Question.correctAnswers[index]==answer)
            this.addRightAnswers();
        else
            this.addWrongAnswers();

    }
    public String toString(){
        return "\n\nUsuário: "+ this.getName()+"\nAcertos: "+ this.getRightAnswers()+"\nErros: "+this.getWrongAnswers();
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
    public int getRightAnswers(){
        return this.rightAnswers;
    }
    public int getWrongAnswers(){
        return this.wrongAnswers;
    }

}
