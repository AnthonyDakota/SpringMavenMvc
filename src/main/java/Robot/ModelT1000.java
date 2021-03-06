package Robot;

import interfaces.Hand;
import interfaces.Head;
import interfaces.Leg;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Created by dtoy on 24.06.2016.
 */
public class ModelT1000 extends BaseModel implements InitializingBean, DisposableBean {
    private Hand hand;
    private Leg leg;
    private Head head;

    private String color;
    private int year;
    private boolean soundEnable;

    public ModelT1000(Hand hand, Leg leg, Head head) {
        super(hand, leg, head);
    }


    public ModelT1000(String color, int year, boolean soundEnable) {

        this.color = color;
        this.year = year;
        this.soundEnable = soundEnable;
    }

    public ModelT1000(Hand hand, Leg leg, Head head, String color, int year, boolean soundEnable) {
        super(hand, leg, head);
        this.color = color;
        this.year = year;
        this.soundEnable = soundEnable;
    }

    public ModelT1000() {
    }

    public void initObject() {
        System.out.println("Init obj");
    }

    public void destroyObject() {
        System.out.println("Destroy obj");
    }
//    @Override
//    public void action() {
//        head.calc();
//        hand.catchSomething();
//        leg.go();
//        System.out.println("color:" + color);
//        System.out.println("year" + year);
//        System.out.println("can play sound" + soundEnable);
//

    @Override
    public void action() {
        getHead().calc();
        getHand().catchSomething();
        getLeg().go();
        System.out.println("color: " + color);
        System.out.println("year: " + year);
        System.out.println("can play sound: " + soundEnable);
    }

    @Override
    public void dance() {
        System.out.println("T1000 is dansing!");
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public Leg getLeg() {
        return leg;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isSoundEnable() {
        return soundEnable;
    }

    public void setSoundEnable(boolean soundEnable) {
        this.soundEnable = soundEnable;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println(this + " - method destroy()");

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(this + " - method init()");
    }
}
