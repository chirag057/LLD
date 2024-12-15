package ObserverPattern.ObserveAble;

import ObserverPattern.Observer.NotificationAlertObserver;

public interface StocksObserveAble {

    public void add(NotificationAlertObserver observer);

    public void remove(NotificationAlertObserver observer);

    public void notifySubscribers();

    void setStockCount(int newStockCount);

    public int getStockCount();
}
