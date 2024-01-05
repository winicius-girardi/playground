package Entrega.Compass.Quiz;

import java.util.Scanner;

public class Quiz {

    public static void main(String []args){
        int indexQuestionArray=0;
        Scanner scan = new Scanner(System.in);
        QuizPrinter.introQuiz();
        Player player = new Player(scan.nextLine());
        char aux = '0';
        for(String i: Question.questions){
            QuizPrinter.questionPrinter(i, Question.alternatives[indexQuestionArray]);
            try {
                aux = scan.nextLine().toUpperCase().charAt(0);
                if(!(aux>='A' && aux<='D'))
                    throw new NullPointerException();
            }catch (NullPointerException e){
                System.out.println("Resposta inválida, tente novamente com uma das letras A,B,C ou D");
                aux = scan.nextLine().toUpperCase().charAt(0);
            }
            finally {
                player.checkAnswers(aux, indexQuestionArray);
                indexQuestionArray++;
            }

        }


        QuizPrinter.quizPontuation(player);
        scan.close();
    }


}