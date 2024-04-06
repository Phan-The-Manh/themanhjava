package models;

public class Customer {
    private long idCustomer;
    private String citizenIdentificationCard;

    int age;
    long phoneNumber;

    public Customer() {
    }

    public Customer(long idCustomer, String citizenIdentificationCard, int age, long phoneNumber) {
        this.idCustomer = idCustomer;
        this.citizenIdentificationCard = citizenIdentificationCard;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public long getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(long idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getCitizenIdentificationCard() {
        return citizenIdentificationCard;
    }

    public void setCitizenIdentificationCard(String citizenIdentificationCard) {
        this.citizenIdentificationCard = citizenIdentificationCard;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        System.out.printf("%-20s%-35s%-30s%-18s%n", "Customer Id:", "CitizenIdentificationCard:", "Age:", "Phone Number:");
        return String.format("%-20s%-35s%-30s%-18s", getIdCustomer(), getCitizenIdentificationCard(), getAge(), getPhoneNumber());
    }
}
