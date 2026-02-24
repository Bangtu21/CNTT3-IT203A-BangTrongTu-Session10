package btth;

import java.util.Scanner;

public class CreditCard extends PaymentMethod implements Payable {
    private String cardNumber;
    private String cvv;
    private double creditLimit;

    public CreditCard() {
    }

    public CreditCard(String accountName, String paymentId, String cardNumber, String cvv, double creditLimit) {
        super(accountName, paymentId);
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.creditLimit = creditLimit;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    @Override
    public void pay(double money) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã bảo mật: ");
        String inputCvv = sc.nextLine();
        if(money > creditLimit) {
            System.err.println("Vượt quá hạn mức");
            return;
        }
        if (inputCvv.equals(this.cvv)) {
            System.out.println("Thanh toán thành công " + money + " VNĐ");
        } else {
            System.err.println("Mã CVV không đúng");
        }
    }

    @Override
    public void validate() {
        Scanner sc = new Scanner(System.in);
        super.setAccountName(inputName(sc));
        super.setPaymentId(String.valueOf(Math.random() * 1000000));
        this.setCardNumber(String.valueOf(Math.random() * 1000000));
        this.setCvv(String.valueOf(Math.random() * 1000));
        this.creditLimit = inputCreditLimit(sc);
    }

    public String inputName(Scanner sc) {
        do {
            System.out.println("Nhập tên: ");
            String name = sc.nextLine();
            if (name.isBlank()) {
                System.err.println("Không được bỏ trống");
            } else {
                return name;
            }
        } while (true);
    }

    public double inputCreditLimit(Scanner sc) {
        do {
            System.out.println("Nhập hạn mức: ");
            double creditLimit = Double.parseDouble(sc.nextLine());
            if (creditLimit < 0) {
                System.err.println("Hạn mức không hợp lệ");
            } else {
                return creditLimit;
            }
        } while (true);
    }
}