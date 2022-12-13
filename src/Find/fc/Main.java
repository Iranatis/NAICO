package Find.fc;

import Find.fc.Comparateur.Comparateur;
import Find.fc.Verbose.CelluleVerbose;
import Find.fc.Verbose.Verbose;


public class Main {

    //Idem
    private void test3(){
        Masque masque = new Masque("./data/picture/A.png");
        Comparateur c = Comparateur.getInstance();
        c.fill();
        System.out.println(c.compare(masque));
    }

    //met une Map en forme de texte et compare avec sa version recréée
    private void test4(){
        Map map = new Map(new Masque("./data/picture/A.png"));
        System.out.println(map.compare(new Map(map.toLine())));
    }

    private void test5(){
        Comparateur comparateur = Comparateur.getInstance();
        comparateur.fill();
        Verbose verbose = comparateur.compare_Verbose(new Masque("./data/picture/A.png"));
        for (CelluleVerbose c : verbose.getCelluleVerboses()){
            System.out.println(c.getVerboseString());
        }
    }

    public static void main(String[] args){
        Main main = new Main();

        main.test5();
    }
}