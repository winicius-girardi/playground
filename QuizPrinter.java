package teste.quizz;
public  class QuizPrinter {


    public static void questionPrinter(String question,String alternatives){
        blankSpace();
        System.out.println(question+"\n\n");
        alternativesPrinter(alternatives);
        System.out.println("\n\nSUA RESPOSTA É:");
        blankSpace();

    }
    public static void alternativesPrinter(String alternatives){
        String[] temp= alternatives.split("\\|");
        System.out.printf("A)\t"+temp[0]+"\tB)\t"+temp[1]+"\tC)\t"+temp[2]+"\tD)\t"+temp[3]);}

    public static void barPrinter(){
        System.out.println("=================================================================");
    }
    public static void introQuiz(){
        barPrinter();
        blankSpace();
        System.out.println("\tBOA VINDAS AO QUIZ\n\tDIGITE O NOME DO PARTICIPANTE");
        blankSpace();

    }
    public static void quizPontuation(Player player){
        System.out.printf("\tUsuário: "+ player.getName()+"\nAcertos: "+ player.getRightAnswers()+"\nErros: "+player.getWrongAnswers());

    }
    public static void blankSpace(){
        System.out.println("\n\n\n\n");


    }
    }

