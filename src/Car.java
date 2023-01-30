public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int productionYear;
    String productionCountry;

    public Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry){
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
        if (this.brand == "" || this.brand == null ){
            this.brand = "default";
        }
        if (this.model == "" || this.model == null ) {
            this.model = "default";
        }
        if(this.productionCountry == "" || this.productionCountry == null){
           this.productionCountry = "default";
        }
        if (this.engineVolume <= 0.0){
            this.engineVolume = 1.5;
        }
        if (this.color ==""){
            this.color = "белый";
        }
        if (this.productionYear <= 0){
            this.productionYear = 2000;
        }
    }

    @Override
    public String toString() {
        return brand + " " + model + ", " + productionYear +" года выпуска, " + engineVolume + "л объем двигателя, сборка - "+ productionCountry + ", "+ color + " цвет.";
    }
}

