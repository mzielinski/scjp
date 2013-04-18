package pl.mzielinski.scjp.package8;

/**
 * @author Maciej Zielinski, Rule Financial
 */
public  class Test
{
    final Object obj;
    Test()
    {
        obj = null; // 1
        System.out.println(obj instanceof Object); //2
        Integer i = new Integer("1"); //3
//        obj = i;    //4
    }
    public static void main(String[] args)
    {
        Test test = new Test();
        System.out.println(test.obj);
    }
}
