package Singleton;
 
public class Singleton {
     
    private static Singleton myObj;
    /**
     * Creer un constructor privee.
     */
    private Singleton(){
         
    }
    /**
     * Creer une methode statique pour prendre l'instance
     */
    public static Singleton getInstance(){
        if(myObj == null){
            myObj = new Singleton();
        }
        return myObj;
    }
     
    public void getSomeThing(){
        //Fait quel que chose ici
        System.out.println("Je suis ici....");
    }
     
    public static void main(String a[]){
        Singleton st = Singleton.getInstance();
        st.getSomeThing();
    }
}






