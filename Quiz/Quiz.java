package teste.quizz;

import java.util.Scanner;

public class Quiz {

    public static void main(String []args){
        int indexQuestionArray=0;
        Scanner scan = new Scanner(System.in);
        QuizPrinter.introQuiz();
        Player player = new Player(scan.next());
        for(String i:Question.questions){
            QuizPrinter.questionPrinter(i,Question.alternatives[indexQuestionArray]);

            player.checkAnswers(scan.next(), indexQuestionArray);
            indexQuestionArray++;

        }


        QuizPrinter.quizPontuation(player);
        scan.close();
    }


}