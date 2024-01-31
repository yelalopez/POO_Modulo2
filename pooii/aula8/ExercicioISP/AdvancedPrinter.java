package br.com.ada.pooii.aula8.ExercicioISP;

public class AdvancedPrinter implements MultifunctionPrinter{

    @Override
    public void copy(String msg) {
        System.out.println("Copying " + msg);
    }

    @Override
    public void fax(String msg) {
        System.out.println("Faxing " + msg);
    }

    @Override
    public void print(String msg) {
        System.out.println("Printing " + msg);
    }

    @Override
    public void scan(String msg) {
        System.out.println("Scanning " + msg);
    }
}
