package ObserverPattern;

import ObserverPattern.ObserveAble.PhoneObserveAbleImpl;
import ObserverPattern.ObserveAble.StocksObserveAble;
import ObserverPattern.Observer.EmailAlertObserverImpl;
import ObserverPattern.Observer.MobileAlertObserverImpl;
import ObserverPattern.Observer.NotificationAlertObserver;

public class Store {
    public static void main(String[] args) {

        StocksObserveAble phoneStockObserveAble = new PhoneObserveAbleImpl();

        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("123@gmail.com", phoneStockObserveAble);
        NotificationAlertObserver observer2 = new MobileAlertObserverImpl("Nidhi", phoneStockObserveAble);

        phoneStockObserveAble.add(observer1);
        phoneStockObserveAble.add(observer2);

        phoneStockObserveAble.setStockCount(10);

    }
}
