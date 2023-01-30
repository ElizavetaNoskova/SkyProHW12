public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int productionYear;
    String productionCountry;

    public Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry) {
        if (brand == "" || brand == null) {
            brand = "default";
        }
        this.brand = brand;
        if (model == "" || model == null) {
            model = "default";
        }
        this.model = model;
        if (engineVolume <= 0.0) {
            engineVolume = 1.5;
        }
        this.engineVolume = engineVolume;
        if (color == "") {
            color = "белый";
        }
        this.color = color;
        if (productionYear <= 0) {
            productionYear = 2000;
        }
        this.productionYear = productionYear;
        if (productionCountry == "" || productionCountry == null) {
            productionCountry = "default";}
            this.productionCountry = productionCountry;



    }

    @Override
    public String toString() {
        return brand + " " + model + ", " + productionYear + " года выпуска, " + engineVolume + "л объем двигателя, сборка - " + productionCountry + ", " + color + " цвет.";
    }
}

