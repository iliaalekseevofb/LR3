package Dishes;

public class Plate extends Dish {
  // Свойства
  private String color;
  private double radius;
  private double depth;

  // Конструктор
  public Plate(String name, String material, double weight, String color, double radius, double depth) {
    super(name, material, weight);
    this.color = color;
    this.radius = radius;
    this.depth = depth;
  }

  // Методы
  public String getColor() {
    return this.color;
  }
  public void setColor(String color) {
    this.color = color;
  }

  public double getRadius() {
    return this.radius;
  }
  public void setRadius(double radius) {
    this.radius = radius;
  }

  public double getDepth() {
    return this.depth;
  }
  public void setDepth(double depth) {
    this.depth = depth;
  }

  @Override
  public String displayInfo() {
    return "Name: " + super.getName() + ", material: " + super.getMaterial() + ", weight: " + super.getWeight() +
            ", color: " + this.color + ", radius: " + this.radius + ", depth: " + this.depth;
  }
  @Override
  public String use() {
    return "Использовать для буквально чего угодно, вы можете положить в тареоку все, что только захотите";
  }
}
