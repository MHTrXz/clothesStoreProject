package controller;

public class AdminController extends person
{
    private String rule;


    public AdminController(String id, String name, String username, String  password, String rule)
    {
        super(id, name, username, password);
        this.rule = rule;
    }


    // rule
    public void setRule(PermissionController rule)
    {
        this.rule = rule.getName();
    }
    public String getRule()
    {
        return rule;
    }


    public String toString()
    {
        return String.format("%s,%s,%s,%s,%s", this.getId(), this.getName(), this.getUsername(), this.getPassword(), this.getRule());
    }
}
