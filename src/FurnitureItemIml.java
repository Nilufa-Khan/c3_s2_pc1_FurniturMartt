public class FurnitureItemIml {
    public static void main(String[] args) {
        FurnitureItem obj = new FurnitureItem();
        obj.furnitureCode = 123;
        System.out.println("Furniture code = "+obj.furnitureCode);
        obj.furnitureType = "Tables";
        System.out.println("Furniture type = "+ obj.furnitureType);
        obj.gradeOfFurniture = 2;
        System.out.println("Furniture grade = "+ obj.gradeOfFurniture);
        obj.furnitureUsages = "Outdoor";
        System.out.println("Furniture usages = "+obj.furnitureUsages);
        obj.price = 1000.00;
        System.out.println("Furniture price = "+ obj.price);
        System.out.println("After discount = "+obj.calculation(5));
    }
}
