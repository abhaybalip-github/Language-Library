class JavaLearning 
{
    public static void main(String[] args) 
    {
        System.out.println("main methode invoked");
        
        Bank cmp =  new Bank();

        cmp.setdata("sbi",25,20);
        cmp.getdata();

        Bank our = new Bank();
        our.setdata("hdfc",20,25);
        our.getdata();
    }
}
class Bank
{
    private String name;
    private int customer; // crore people
    private int asset ; // million dollar worth

    public void setdata(String argname, int argcustomer, int argasset)
    {
        name = argname;
        customer = argcustomer;
        asset = argasset;
    }

    public void getdata()
    {
        System.out.println("Bank Name :");System.out.print(name);
        System.out.println("Number of customer :");System.out.println(customer);
        System.out.println("Total Assets :");System.out.println(asset);
    }
}