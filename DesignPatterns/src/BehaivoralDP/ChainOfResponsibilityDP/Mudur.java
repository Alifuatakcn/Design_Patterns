package BehaivoralDP.ChainOfResponsibilityDP;

public class Mudur extends Approver{

    public Mudur(Approver chief) {
        super(chief);
    }

    @Override
    boolean approveLoan(int amount) {
        if (amount<10000){
            System.out.println("Müdür onayladı.");
            System.out.println("*****************************");
            return true;
        } else if (chief!=null) {
            System.out.println("Müdürün bu miktarı onaylama yetkisi yok, şefe yönlendiriliyorsunuz..");
            return chief.approveLoan(amount);
        }
        return false;
    }
}
