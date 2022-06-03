import Models.Patient;

public class Main {

    public static void main(String[] args) {

        Patient p = new Patient("Fernanda", "111.222.333-44", "Feminino", 32);

        p.save();


    }
}
