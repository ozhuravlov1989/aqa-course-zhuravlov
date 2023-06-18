package Oop;

public class Cards {

    private static int id;
    private String number;
    private String expireDate;
    private String cvv;
    private CardsType cardType;

    public Cards(String number, String expireDate, String cvv, String cardType) {
        this.number = number;
        this.expireDate = expireDate;
        this.cvv = cvv;
        id += 1;

        switch (cardType) {
            case "Visa":
                this.cardType = CardsType.VISA;
                break;
            case "MasterCard":
                this.cardType = CardsType.MASTERCARD;
                break;
            default:
                throw new IllegalArgumentException("'Visa' or 'MasterCard' values allowed");
        }
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

    public CardsType getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = CardsType.valueOf(cardType);
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
