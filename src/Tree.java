

public class Tree
{
    public static String draw()
    {
        String treeBuilder = "       /\\ \n      /  \\ \n     /    \\ \n    /      \\  \n   /        \\ \n  ------------ \n    ''   ''  \n    ''   ''  \n    ''   ''  \n";

        return treeBuilder;
    }

    public void start()
    {
        System.out.println(draw());
    }



}
