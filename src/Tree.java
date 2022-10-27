

public class Tree
{
    /**
     * string with tree and escape sequences
     * @return returned tree string
     */
    public static String draw()
    {
        String treeBuilder = "       /\\ \n      /  \\ \n     /    \\ \n    /      \\  \n   /        \\ \n  ------------ \n    ''   ''  \n    ''   ''  \n    ''   ''  \n";

        return treeBuilder;
    }

    /**
     * start method
     */
    public void start()
    {
        System.out.println(draw());
    }



}
