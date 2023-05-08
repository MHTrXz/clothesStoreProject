package controller;

public class CustomerController extends person
{
    private int amount;

    public CustomerController(String id, String name, String username, String password, int amount)
    {
        super(id, name, username, password);
        this.amount = amount;
    }


    // amount
    public void setAmount(int amount)
    {
        this.amount = amount;
    }
    public int getAmount()
    {
        return amount;
    }


    public String toString()
    {
        return String.format("%s,%s,%s,%s,%s", this.getId(), this.getName(), this.getUsername(), this.getPassword(), this.getAmount());
    }
}
