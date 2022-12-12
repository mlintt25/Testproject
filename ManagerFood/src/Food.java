public class Food {
    private String nameOfFood;
    private double time;
    private String type;

    public Food() {
    }

    public Food(String nameOfFood, double time, String type) {
        this.nameOfFood = nameOfFood;
        this.time = time;
        this.type = type;
    }

    public String getNameOfFood() {
        return nameOfFood;
    }

    public void setNameOfFood(String nameOfFood) {
        this.nameOfFood = nameOfFood;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


}
