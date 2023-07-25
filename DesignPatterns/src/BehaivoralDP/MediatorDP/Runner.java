package BehaivoralDP.MediatorDP;

public class Runner {

    public static void main(String[] args) {

        MessageDispatcher dispatcher=new MessageDispatcher();

        Actor actor1=new Professor("Prof. Math",dispatcher);
        Actor actor2=new Professor("Prof. IT",dispatcher);
        Actor actor3=new Professor("Prof. Chem",dispatcher);

        //3 profesör uzmanlık alanlarını belirterek kayıt olsun
        dispatcher.register(actor1,"math");
        dispatcher.register(actor2,"IT");
        dispatcher.register(actor3,"chem");


        System.out.println("Prof. Math soruyor...  ");
        actor1.sendMessage("IT","IT nedir???");
        actor1.sendMessage("chem","Kimya nedir??");

        System.out.println("Prof. IT soruyor...  ");
        actor2.sendMessage("math","Gerçek hayatta matemetiği nerede kullanırız???");

    }
}
