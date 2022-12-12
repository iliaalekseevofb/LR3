package Dishes;

public class Test {
  public static void main(String[] args) {
    // Объявление и инициализация
    Pan pan1 = new Pan("Сковорода для блинчиков", "Алюминий", 300, "Для электронных плит",
            "Для блинчиков", 15, 2);
    Plate plate1 = new Plate("Большая тарелка", "Стекло", 400, "Прозрачный", 10, 8);
    Spoon spoon1 = new Spoon("Столовая ложка", "Серебро", 50, "Столовая");

    // Тестирование
    System.out.println(pan1.getMaterial());
    System.out.println(pan1.getPurpose());
    pan1.displayInfo();
    pan1.setRadius(10);
    System.out.println(pan1.getRadius());

    System.out.println(plate1.use());
    System.out.println(plate1.getDepth());
    plate1.setName("Новое имя тарелки");
    System.out.println(plate1.getName());

    System.out.println(spoon1.getType());
    spoon1.setType("Новый тип ложки");
    System.out.println(spoon1.getType());
    System.out.println(spoon1.getWeight());
  }
}
