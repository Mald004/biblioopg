import Entitet.User;
import Language.Dansk;
import Language.Dialog;
import Language.English;
import Util.Input;
import dataLister.Facade;

public class Main {
    public static void main(String[] args) {
        Dialog dialog;

        dialog = new Dansk();
        System.out.println(dialog.hello());

        dialog = new English();

        System.out.println(dialog.hello());

        System.out.println(Input.getInt(dialog.askAge()));

        dialog = new Dansk();


        while(true){

            System.out.println(Input.getInt(dialog.askAge()));
            if(Input.getString(dialog.changeLanguage()).equalsIgnoreCase("y")){
                if(dialog instanceof Dansk){
                    dialog = new English();
                }else
                if(dialog instanceof English){
                    dialog = new Dansk();
                }
            }
        }
    }

}