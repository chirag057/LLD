package ObserverPattern.Observer;

import ObserverPattern.ObserveAble.StocksObserveAble;


public class EmailAlertObserverImpl implements NotificationAlertObserver {

    String EmailId;
    StocksObserveAble observeAble;

    //This is a Constructor Injection

    public EmailAlertObserverImpl(String EmailId, StocksObserveAble observeAble) {
        this.EmailId = EmailId;
        this.observeAble = observeAble;
    }

    public void update() {
        sendMail(EmailId, "Stocks are in Hurry Up!");
    }

    private void sendMail(String EmailId, String msg) {
        System.out.println("Mail sent to :" + EmailId);
    }
}
