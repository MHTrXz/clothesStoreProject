package controller;

public class person
{
    private final String id;
    private String name;
    private String username;
    private String password;


    public person(String id, String name, String username, String  password)
    {
        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
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


    // username
    public void setUsername(String username)
    {
        this.username = username;
    }
    public String getUsername()
    {
        return username;
    }


    // password
    public void setPassword(String password)
    {
        this.password = password;
    }
    public String getPassword()
    {
        return password;
    }

}
