package Dishes;

public class Pan extends Dish {
  // Свойства
  private String type;
  private String purpose;
  private double radius;
  private double depth;

  // Конструктор
  public Pan(String name, String material, double weight, String type, String purpose, double radius, double depth) {
    super(name, material, weight);
    this.type = type;
    this.purpose = purpose;
    this.radius = radius;
    this.depth = depth;
  }

  // Методы
  public String getType() {
    return this.type;
  }
  public void setType(String type) {
    this.type = type;
  }

  public String getPurpose() {
    return this.purpose;
  }
  public void setPurpose(String purpose) {
    this.purpose = purpose;
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
            ", type: " + this.type + ", purpose: " + this.purpose + ", radius: " + this.radius + ", depth: " + this.depth;
  }
  @Override
  public String use() {
    return "Использовать для того, чтобы приготовить " + this.purpose;
  }
}
