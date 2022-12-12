package Dishes;

public class Spoon extends Dish {
  // Свойства
  private String type;

  // Конструктор
  public Spoon(String name, String material, double weight, String type) {
    super(name, material, weight);
    this.type = type;
  }

  // Методы
  public String getType() {
    return this.type;
  }
  public void setType(String type) {
    this.type = type;
  }

  @Override
  public String displayInfo() {
    return "Name: " + super.getName() + ", material: " + super.getMaterial() + ", weight: " + super.getWeight() +
           ", type: " + this.type;
  }
  @Override
  public String use() {
    return "Использовать для супов, каш, йогуртов, некоторых салатов и т.д.";
  }
}
