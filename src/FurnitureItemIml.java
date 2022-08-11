import java.util.Scanner;
public class FurnitureItemIml {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FurnitureItem obj = new FurnitureItem();
        obj.furnitureCode = sc.nextInt();
        System.out.println("Furniture code = "+obj.furnitureCode);
        obj.furnitureType = sc.next();
        System.out.println("Furniture type = "+ obj.furnitureType);
        obj.gradeOfFurniture = sc.nextInt();
        System.out.println("Furniture grade = "+ obj.gradeOfFurniture);
        obj.furnitureUsages = sc.next();
        System.out.println("Usages of furniture ="+obj.furnitureUsages);
        obj.color = sc.next();
        System.out.println("Color = "+obj.color);

        obj.price = sc.nextDouble();
        System.out.println("Furniture price = "+ obj.price);
        System.out.println("After discount = "+obj.calculation(5));
    }
}
