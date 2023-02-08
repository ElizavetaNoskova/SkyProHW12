package transport;

public class Car {
    private final String brand;
    final private String model;
    private final double engineVolume;
    private final String color;
    private final int productionYear;
    private final String productionCountry;
    private String transmission;
    private final String body;
    private int registrationNumber;
    private final int numberOfSeats;
    private boolean rubber;
    private Key key;

    public Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry, String transmission, String body, int registrationNumber, int numberOfSeats, boolean rubber, Key key) {
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
            productionCountry = "default";
        }
        this.productionCountry = productionCountry;
        if (transmission == "" || transmission == null) {
            transmission = "default";
        }
        this.setTransmission(transmission);
        if (body == "" || body == null) {
            body = "default";
        }
        this.body = body;
        if (registrationNumber <= 0) {
            registrationNumber = 777;
        }
        this.setRegistrationNumber(registrationNumber);
        if (numberOfSeats <= 0) {
            numberOfSeats = 4;
        }
        this.numberOfSeats = numberOfSeats;
        this.setRubber(rubber);
        setKey(key);

    }


    @Override
    public String toString() {
        return "Car{" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", engineVolume=" + getEngineVolume() +
                ", color='" + getColor() + '\'' +
                ", productionYear=" + getProductionYear() +
                ", productionCountry='" + getProductionCountry() + '\'' +
                ", transmission='" + getTransmission() + '\'' +
                ", body='" + getBody() + '\'' +
                ", registrationNumber=" + getRegistrationNumber() +
                ", numberOfSeats=" + getNumberOfSeats() +
                ", rubber=" + isRubber() +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getColor() {
        return color;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getBody() {
        return body;
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public boolean isRubber() {
        return rubber;
    }

    public void setRubber(boolean rubber) {
        this.rubber = rubber;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        if (key == null ){
            key = new Key(false, false);
        }
        this.key = key;
    }

    public void changeRubberForSeason(int month) {
        if ((month >= 11 && month <= 12) || (month >= 1 && month <= 4)) {
            if (rubber == true) { //если резина летняя то выходит true
                this.rubber = false;
            }
        }
        if (month >= 5 && month <= 10) {
            if (rubber == false) { //если резина летняя то выходит true
                this.rubber = true;
            }
        }
    }

    public static class Key {
        private final boolean remodeEngineStart;
        private final boolean keylessAccess;

        public Key(boolean remodeEngineStart, boolean keylessAccess) {
            this.remodeEngineStart = remodeEngineStart;
            this.keylessAccess = keylessAccess;
        }

        public boolean isKeylessAccess() {
            return keylessAccess;
        }

        public boolean isRemodeEngineStart() {
            return remodeEngineStart;
        }
    }
}

