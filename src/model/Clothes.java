package model;

import controller.ClothesController;

public class Clothes extends Model
{
    private static final String file = "clothes.txt";

    public static ClothesController getClothes(String id) {
        String[] data = getById(id, file);
        if (data != null) {
            return new ClothesController(id, data[1], data[2], Integer.parseInt(data[3]), Integer.parseInt(data[4]), data[5], data[6]);
        } else {
            return null;
        }
    }

    public static boolean updateClothes(ClothesController clothes) {
        return update(clothes.getId(), clothes.toString(), file);
    }

    public static ClothesController createClothes(String name, String size, int number, int price, String gender, String cat) {
        String[] allData = getAllData(file);
        String id = String.valueOf(Integer.parseInt(allData[allData.length - 1].split(",")[0]) + 1);
        for (String data: allData) {
            if (data.split(",")[1].equals(name)) return null;
        }
        ClothesController clothes = new ClothesController(id, name, size, number, price, gender, cat);
        if(create(clothes.toString(), file)) {
            return clothes;
        } else {
            return null;
        }
    }
}
