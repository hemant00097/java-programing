class AreaOfRectangle
{
    void Rectangle(int l,int b)
    {
        int area= l*b;
        System.out.println(area);
    }
    public static void main(String[] args) {
        AreaOfRectangle A1= new AreaOfRectangle();
        A1.Rectangle(10, 20);
    }
}