package controller;

public class CategoryController
{
    private final String id;
    private String name;

    public CategoryController(String id, String name)
    {
        this.id = id;
        this.name = name;
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


    public String toString()
    {
        return String.format("%s,%s", this.id, this.name);
    }
}
