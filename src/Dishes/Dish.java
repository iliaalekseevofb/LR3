package Dishes;

public abstract class Dish {
  // Свойства
  private String name;
  private String material;
  private double weight;

  // Конструктор
  public Dish(String name, String material, double weight) {
    this.name = name;
    this.material = material;
    this.weight = weight;
  }

  // Методы
  public String getName() {
    return this.name;
  }
  public void setName(String name) {
    this.name = name;
  }

  public String getMaterial() {
    return this.material;
  }
  public void setMaterial(String material) {
    this.material = material;
  }

  public double getWeight() {
    return this.weight;
  }
  public void setWeight(double weight) {
    this.weight = weight;
  }

  // Абстрактные методы
  public abstract String displayInfo();
  public abstract String use();
}
