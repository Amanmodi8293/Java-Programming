import Folder.Folderl1.Folderl2.Problem2;

class c1 extends Problem2{
    void problem2(){
        System.out.println("Protected Variable : " + Proint);
        // System.out.println("Default Variable : " + Defint);
    }
}

public class Problem4 {
    public static void main(String[] args){
        System.out.println("I am main Method !");
        c1 c = new c1();
        c.problem2();

    }

}