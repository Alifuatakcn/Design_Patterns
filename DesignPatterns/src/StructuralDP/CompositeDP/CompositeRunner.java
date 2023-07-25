package StructuralDP.CompositeDP;

public class CompositeRunner {
    public static void main(String[] args) {

        //tüm çalışanları listele

        HeadDepartment head=new HeadDepartment();
        Finance finance=new Finance();
        Sales sales=new Sales();
        Arge arge=new Arge();

        head.add(finance);
        head.add(sales);
        head.add(arge);


        System.out.println("Tüm departmanlar: "+head.getName());
        System.out.println("Tüm çalışanlar: "+head.getEmployees());


    }
}
