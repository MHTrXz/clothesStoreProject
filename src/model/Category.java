package model;

import controller.CategoryController;
public class Category extends Model {

    private static final String file = "category.txt";

    public static CategoryController getCategory(String id) {
        String[] data = getById(id, file);
        if (data != null) {
            return new CategoryController(id, data[1]);
        } else {
            return null;
        }
    }

    public static boolean updateCategory(CategoryController category) {
        return update(category.getId(), category.toString(), file);
    }

    public static CategoryController createCategory(String categoryName) {
        String[] allData = getAllData(file);
        String id = String.valueOf(Integer.parseInt(allData[allData.length - 1].split(",")[0]) + 1);
        for (String data: allData) {
            if (data.split(",")[1].equals(categoryName)) return null;
        }
        CategoryController makeCategory = new CategoryController(id, categoryName);
        if(create(makeCategory.toString(), file)) {
            return makeCategory;
        } else {
            return null;
        }
    }
}
