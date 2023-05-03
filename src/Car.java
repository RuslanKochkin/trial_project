public class Car {
    String brand;
    int horsePowers;
    boolean electric;
    Car (String brand, int horsePowers, boolean electric){
        this.brand = brand;
        this.horsePowers = horsePowers;
        this.electric = electric;

    }
    public String toString(){
        return brand + " " + horsePowers + " " + electric;
    }
    public void drive(){
        System.out.println(brand + " " + (electric?"eco_car":"это плохо"));
    }

}
