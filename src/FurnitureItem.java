public class FurnitureItem {
    int furnitureCode;
    String furnitureType;
    int gradeOfFurniture;
    String color;
    String furnitureUsages;
    double price;
    FurnitureItem(){
    furnitureCode = 0;
    furnitureType = "";
    gradeOfFurniture = 0;
    color = "";
    furnitureUsages = "";
    price = 0.0;

    }
    public double calculation(double discount){
        double result = 0.0;
        if(furnitureUsages == "Outdoor"){
            result = price - ((price * discount) / 100);
        }
        return  result;
    }

}
