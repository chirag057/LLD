package ObserverPattern.Observer;

import ObserverPattern.ObserveAble.StocksObserveAble;

public class MobileAlertObserverImpl implements NotificationAlertObserver {

    String userName;
    StocksObserveAble observeAble;

    public MobileAlertObserverImpl(String userName, StocksObserveAble observeAble) {
        this.userName = userName;
        this.observeAble = observeAble;
    }

    public void update() {
        sendMsgonMobile(userName, " Hurry Up Stocks are in!");
    }

    public void sendMsgonMobile(String userName, String msg) {
        System.out.println("Notification Sent to" + userName);
    }
}
