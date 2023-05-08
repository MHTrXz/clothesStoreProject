package controller;

public class ClothesController
{
    private final String id;
    private String name;
    private String size;
    private int number;
    private int price;
    private String gender;
    private String cat;


    public ClothesController(String id, String name, String size, int number, int price, String gender, String cat)
    {
        this.id = id;
        this.name = name;
        this.size = size;
        this.number = number;
        this.price = price;
        this.gender = gender;
        this.cat = cat;
    }


    // id
    public String getId()
    {
        return id;
    }


    // name
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }


    // size
    public void setSize(String size)
    {
        this.size = size;
    }
    public String getSize()
    {
        return size;
    }


    // number
    public void setNumber(int number)
    {
        this.number = number;
    }
    public int getNumber()
    {
        return number;
    }


    // price
    public void setPrice(int price)
    {
        this.price = price;
    }
    public int getPrice()
    {
        return price;
    }


    // gender
    public void setGender(String gender)
    {
        this.gender = gender;
    }
    public String getGender()
    {
        return gender;
    }


    // cat
    public void setCat(CategoryController category)
    {
        this.cat = category.getId();
    }
    public String getCat()
    {
        return this.cat;
    }


    // toString
    public String toString()
    {
        return String.format("%s,%s,%s,%d,%d,%s,%s", this.getId(), this.getName(), this.getSize(), this.getNumber(), this.getPrice(), this.getGender(), this.getCat());
    }
}
