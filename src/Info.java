public class Info {
    private String model;
    private int year;
    private String price;
    private String color;

    public Info(String model, int year, String price, String color) {
        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Info{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", price='" + price + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
