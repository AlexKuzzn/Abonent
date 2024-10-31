import java.util.Random;

class Main {
Abonent[] array = new Abonent[20];
Random random = new Random();
}
class Abonent {
    private int id;
    private String surname;
    private String name;
    private String patronymic;
    private String address;
    private int talkTime;
    private String creditCardNumber;
    private int debt;

    public Abonent(int id, String surname, String name, String patronymic, String address, int talkTime, String creditCardNumber, int debt) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.address = address;
        this.talkTime = talkTime;
        this.creditCardNumber = creditCardNumber;
        this.debt = debt;
    }

    public Abonent(String surname, String name, String patronymic, String address) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDebt() {
        return debt;
    }

    public void setDebt(int debt) {
        this.debt = debt;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public int getTalkTime() {
        return talkTime;
    }

    public void setTalkTime(int talkTime) {
        this.talkTime = talkTime;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

}