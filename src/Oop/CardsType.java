package Oop;

public enum CardsType {

    MASTERCARD("Mastercard"),
    VISA("Visa");

    private String cardType;

    CardsType(String cardType) {
        this.cardType = cardType;
    }
}
