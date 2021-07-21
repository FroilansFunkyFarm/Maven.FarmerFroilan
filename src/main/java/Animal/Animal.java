package Animal;

public class Animal {
    String name;
    Integer age;
    Integer amountOfFoodEaten;

    public Animal(String name,Integer Age,Integer amountOfFoodEaten){
        this.name=name;
        this.age=age;
        this.amountOfFoodEaten=amountOfFoodEaten;
    }
public Animal(){
        this.name="";
        this.age=0;
        this.amountOfFoodEaten=0;
}


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}