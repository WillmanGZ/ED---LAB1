package Main;

import Interfaz.Login;

public class Main extends Login {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() { //Runnable de diseño
            public void run() {

                try{
                    Thread.sleep(3000);
                }
                catch(Exception e){
                }
                new Login().setVisible(true);
            }
        });
    }
}
