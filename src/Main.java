import java.util.Random;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Abonent[] array = new Abonent[20];
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        Abonent abonent = new Abonent();
        int id;
        String surname;
        String name;
        String patronymic;
        String address;
        int talkTime;
        String creditCardNumber;
        int debt;
        for (int i = 0; i < 20; i++) {
System.out.println("Введите фамилию:");
surname = scanner.next();
abonent.setSurname(surname);
            System.out.println("Введите имя:");
            name = scanner.next();
            abonent.setName(name);
            System.out.println("Введите отчество:");
            patronymic = scanner.next();
            abonent.setPatronymic(patronymic);
            System.out.println("Введите адрес:");
            address = scanner.next();
            abonent.setAddress(address);
            System.out.println("Введите номер кредитки:");
            creditCardNumber = scanner.next();
            abonent.setCreditCardNumber(creditCardNumber);
            talkTime = random.nextInt(0, 3600);
            abonent.setTalkTime(talkTime);
            debt = random.nextInt(0, 3600);
            abonent.setDebt(debt);
            array[i] = new Abonent(i, surname, name, patronymic, address, talkTime, creditCardNumber, debt);
if (debt > 2000) {
    System.out.println("Превышено время переговоров: Абонент " + surname + " " + name + ", id " + i + ", время - " + debt);
}
        }
    }
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

    public Abonent() {
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