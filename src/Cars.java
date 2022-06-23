//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.awt.Color;
import java.time.LocalDate;

public final class Cars {
    enum model {
        a6,a7,a8,kadjar,mustang,clio,leon
    }
    private final Cars.model carModel;
    private final int year;
    private final int capacity;
    private final LocalDate prodDate;
    private final int km;
    private final Color color;

    public Cars(int year, int capacity, LocalDate prodDate, int km, Color color, Cars.model carModel) {
        this.year = year;
        this.capacity = capacity;
        this.prodDate = prodDate;
        this.km = km;
        this.color = color;
        this.carModel = carModel;
    }

    @Override
    public  String toString() {
        return
                "Car Model=" + carModel +
                ", year=" + year +
                ", capacity=" + capacity +
                ", production Date=" + prodDate +
                ", km=" + km +
                ", color=" + color +
                '}';
    }

    public Cars.model getCarModel() {
        return this.carModel;
    }

    public int getYear() {
        return this.year;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public LocalDate getProdDate() {
        return this.prodDate;
    }

    public int getKm() {
        return this.km;
    }

    public Color getColor() {
        return this.color;
    }
}
