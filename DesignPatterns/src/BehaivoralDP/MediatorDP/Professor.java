package BehaivoralDP.MediatorDP;

public class Professor implements Actor{

    public String name;

    public Dispatcher dispatcher;

    //param const
    public Professor(String name, Dispatcher dispatcher) {
        this.name = name;
        this.dispatcher = dispatcher;
    }

    @Override//dispatcher taraf. iletilen mesajı alacak
    public void receiveMessage(String message) {
        System.out.println(this.name+ " mesajı cevaplıyor: " + message);
    }

    @Override//prof soruyu ilgili katılımcıya yönlendirmesi için dispatcher ı kullanacak
    public void sendMessage(String topic, String message) {
          dispatcher.dispatch(topic,message);
    }
}
