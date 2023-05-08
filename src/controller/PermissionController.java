package controller;

public class PermissionController
{
    private final String id;
    private final String name;
    private String[] permission;


    public PermissionController(String id, String name, String[] permission)
    {
        this.id = id;
        this.name = name;
        this.permission = permission;
    }

    // i
    public String getId() {
        return id;
    }

    // name
    public String getName()
    {
        return name;
    }

    
    // permission
    public void setPermission(String[] permission)
    {
        this.permission = permission;
    }
    public String[] getPermission()
    {
        return permission;
    }


    public String toString()
    {
        StringBuilder output = new StringBuilder();

        output.append(this.getId()).append(",");
        output.append(this.getName());

        for (String permission:this.getPermission())
        {
            output.append(",").append(permission);
        }

        return output.toString();
    }
    
}
