package services;

import models.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerService implements Management<Customer>{

    private static List<Customer> customerList = new ArrayList<>();

    static {
        initCustomer();

    }


        public static Customer initCustomer(){
        Customer customer = new Customer();
        customer.setIdCustomer(customerList.size() + 1);
        customer.setCitizenIdentificationCard("000000001");
        customerList.add(customer);
        return customer;
        }

    @Override
    public Customer findByID(long iD) {
        for (int i = 0; i < customerList.size(); i++){
            if (customerList.get(i).getIdCustomer() == iD){
                return customerList.get(i);
            }
        }
        return null;
    }

    @Override
    public void printList() {
        System.out.printf("%-20s%-30s%-30s%-18s%n", "Customer Id:", "CitizenIdentificationCard:", "Age:", "Phone Number:");
        System.out.println(customerList);

    }

    @Override
    public void updateByID(long iD, Customer customer) {
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getIdCustomer() == iD) {
                customerList.get(i).setCitizenIdentificationCard(initCustomer().getCitizenIdentificationCard());

            }
        }
    }

    @Override
    public void add(Customer customer) {
        customer.setIdCustomer(customerList.size()+1);
        customerList.add(customer);
    }

    @Override
    public void delete(long iD) {
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getIdCustomer() == iD) {
                customerList.remove(i);
                return;

            }
        }

    }

    public static void main(String[] args) {
        CustomerService customerService = new CustomerService();
        Customer customer = new Customer(1, "555555555", 12, 11112);
        customerService.add(customer);

        customerService.add(new Customer(2, "123456789",24, 22223));
        customerService.printList();

        System.out.println("___________________________");
        Customer updatedcustomer = new Customer (4, "81132329", 36, 33334);
        customerService.updateByID(2, updatedcustomer);

        System.out.println("_______________________________");
        System.out.println(customerService.findByID(3));
        customerService.delete(3);
        customerService.printList();

    }
    }

