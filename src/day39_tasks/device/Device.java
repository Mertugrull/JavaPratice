package day39_tasks.device;

public class Device {

    private String brand,model,color,size;
    private double price;
    private static boolean hasBattery=true;
    private static boolean hasPowerButton=true;

    public Device(String brand, String model, String color, String size, double price) {
        setBrand(brand);
        this.model = model;
        this.color = color;
        this.size = size;
        setPrice(price);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if(brand==null){
            System.err.println("invalid brand");
            System.exit(1);
        }
        if(brand.isEmpty()){
            System.err.println("invalid brand");
            System.exit(1);
        }
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        if(price<0){
            System.err.println("invalid price");
            System.exit(1);
        }
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static boolean isHasBattery() {
        return hasBattery;
    }

    public static void setHasBattery(boolean hasBattery) {
        Device.hasBattery = hasBattery;
    }

    public static boolean isHasPowerButton() {
        return hasPowerButton;
    }

    public static void setHasPowerButton(boolean hasPowerButton) {
        Device.hasPowerButton = hasPowerButton;
    }

    public void turnOn(){
        System.out.println(brand+" "+model+" has turn on");
    }
    public void turnOff(){
        System.out.println(brand+" "+model+" has turn off");
    }


    public String toString() {
        return "Device{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                '}';
    }
}
/*
Create a class named Device:
			Variables:
					brand, model, color, size, price, hasBattery, hasPowerButton
			Encapsulate all the fields
			Add a constructor to set all the fields
						Condition:
							1. brand, model can not be null (if obj == null means it's error)
							2. brand, model can not be empty or can not be blank
							3. price can not be set to negative or zero
			Methods:
				turnOn(), turnOff(), toString()
 */