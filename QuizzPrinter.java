package teste.quizz;
public class QuizzPrinter {

    public void inicQuizz(){
        barPrinter();
        introQuiz();
        blankSpace();
        barPrinter();

    }
    public  void questionPrinter(String question){
        blankSpace();
        barPrinter();
        System.out.println(question+"\n\n");
        blankSpace();
        barPrinter();

    }
    public void alternativesPrinter(String alternatives){
        String[] temp= alternatives.split("|");
        System.out.printf("A)\t"+temp[0]+"B)\t"+temp[1]+"C)\t"+temp[2]+"D)"+temp[3]);}

    public void barPrinter(){
        System.out.println("=================================================================");
    }
    public void introQuiz(){
        System.out.println("BOA VINDAS AO QUIZ COMPASS");

    }
    public void blankSpace(){
        System.out.println("\n\n\n\n\n\n\n\n\n");


    }
    }

