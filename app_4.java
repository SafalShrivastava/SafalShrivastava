public class app_4 {
    public static void main(String args[])
    {
        String miles="36.56";
      //  System.out.println("int values"+Integer.parseInt(miles));
        System.out.println("int values"+Float.parseFloat(miles));
        System.out.println("int values"+Double.parseDouble(miles));
        double km=Double.parseDouble(miles)*1.67;
        String res=String.valueOf(km);
        System.out.println("km value"+res+"km.");
        }
}