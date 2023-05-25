package Oop;

public class Cards {

    private static int id;
    private String number;
    private String expireDate;
    private String cvv;
    private String cardType;

    public Cards(String number, String expireDate, String cvv, String cardType) {
        this.number = number;
        this.expireDate = expireDate;
        this.cvv = cvv;

        if (cardType.equals("Visa") || cardType.equals("MasterCard")) {
            this.cardType = cardType;
        } else {
            throw new IllegalArgumentException("'Visa' or 'MasterCard' values allowed");
        }

        id += 1;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public static int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Cards{" +
                "number='" + number + '\'' +
                ", expireDate='" + expireDate + '\'' +
                ", cvv='" + cvv + '\'' +
                ", cardType='" + cardType + '\'' +
                '}';
    }
}
