package Day10Task;

class Car {

    private String brand;
    private int speed;
    private double price;
    private String color;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand != null && !brand.isEmpty()) {
            this.brand = brand;
        } else {
            System.out.println("Invalid brand");
        }
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed >= 0 && speed <= 200) {
            this.speed = speed;
        } else {
            System.out.println("Speed must be between 0 and 200");
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Invalid price");
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color != null && !color.isEmpty()) {
            this.color = color;
        } else {
            System.out.println("Invalid color");
        }
    }

}

public class GetterSetterCar {
    public static void main(String[] args) {

        Car car = new Car();

        car.setBrand("BMW");
        car.setColor("Black");
        car.setSpeed(100);
        car.setPrice(5000000);

        System.out.println("Brand: " + car.getBrand());
        System.out.println("Color: " + car.getColor());
        System.out.println("Speed: " + car.getSpeed());
        System.out.println("Price: " + car.getPrice());
    }
}