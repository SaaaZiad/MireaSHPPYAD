import proxy.CachingProxy;
import adapter.CardReader;
import adapter.MemoryCard;
public class Main {
    public static void main(String[] args) throws InterruptedException {
        MemoryCard card = new MemoryCard();
        CardReader obj = new CardReader(card);
        obj.connectWithUsbCable();
        //proxy
        var proxy = new CachingProxy();
        System.out.println(proxy.getAnswer("Vanya"));
        System.out.println(proxy.getAnswer("Vanya"));
    }
}
