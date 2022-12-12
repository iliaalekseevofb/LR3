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
  public final String getName() {
    return this.name;
  }
  public final void setName(String name) {
    this.name = name;
  }

  public final String getMaterial() {
    return this.material;
  }
  public final void setMaterial(String material) {
    this.material = material;
  }

  public final double getWeight() {
    return this.weight;
  }
  public final void setWeight(double weight) {
    this.weight = weight;
  }

  // Абстрактные методы
  public abstract String displayInfo();
  public abstract String use();
}
