public class Die
{
    // instance variables go here
    int sides;

    // constructor
    public Die(int n)
    {
        sides = n;
    }
    public Die()
    {
        sides = 6;
    }

    //methods
    public int roll()
    {
        int r = (int)(Math.random() * sides) + 1;
        return r;
    }
}