package singleTone;

public class Card {
    private static int serialNum = 10000;
    private int cardNumber;

    public Card(){
        serialNum++;
        this.cardNumber = serialNum;
    }

    public static int getSerialNum() {
        return serialNum;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }
}
