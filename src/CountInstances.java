public class CountInstances
{
    //Creates several Slogan objects and prints the number of
    //objects that were created
    public static void main (String[] args)
    {
        Slogan obj;
        obj = new Slogan("Remember the Alamo.");
        System.out.println(obj);
        obj = new Slogan("Don't Worry. Be Happy.");
        System.out.println(obj);
        obj = new Slogan("Live Free or Die.");
        System.out.println(obj);
        obj = new Slogan("Talk is Cheap.");
        System.out.println(obj);
        obj = new Slogan("Write Once, Run Anywhere.");
        System.out.println(obj);
        System.out.println();
        System.out.println("Slogans created: " + Slogan.getCount());
    }
}//end of class
