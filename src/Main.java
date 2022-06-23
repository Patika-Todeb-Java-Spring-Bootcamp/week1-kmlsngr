
import java.awt.Color;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Cars renault = new Cars(2021, 5, LocalDate.of(2020, 6, 12), 12000, Color.red, Cars.model.clio);
        System.out.println(renault.getProdDate());
    }
    }

