package Robot;

import interfaces.Hand;
import interfaces.Head;
import interfaces.Leg;
import interfaces.Robot;

/**
 * Created by dtoy on 24.06.2016.
 */
public class ModelT1000 implements Robot {
    private Hand hand;
    private Leg leg;
    private Head head;



    public ModelT1000(Hand hand, Leg leg, Head head) {
        this.hand = hand;
        this.leg = leg;
        this.head = head;
    }

    public ModelT1000() {
    }

    @Override
    public void action() {
    head.calc();
    hand.catchSomething();
    leg.go();
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
}
