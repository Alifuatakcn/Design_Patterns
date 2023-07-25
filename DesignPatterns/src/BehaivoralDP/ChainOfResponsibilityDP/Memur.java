package BehaivoralDP.ChainOfResponsibilityDP;

public class Memur extends Approver{


    public Memur(Approver chief) {
        super(chief);
    }

    @Override
    boolean approveLoan(int amount) {

        if (amount<1000){
            System.out.println("Memur onayladı.");
            System.out.println("*****************************");
            return true;
        } else if (chief!=null) {
            System.out.println("Memurun bu miktarı onaylama yetkisi yok, şefe yönlendiriliyorsunuz..");
            return chief.approveLoan(amount);
        }
        return false;
    }
}
