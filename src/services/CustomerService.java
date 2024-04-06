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
        customer.setAge(18);
        customer.setPhoneNumber(81122234);
        customerList.add(customer);
        customerList.add(new Customer(customerList.size()+1, "12000000", 30, 9855943));
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
        for (int i =0; i < customerList.size(); i++){
            System.out.println(customerList.get(i));
        }

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
       customerService.add(new Customer(customerList.size()+1, "00000003", 40, 66388));
       customerService.printList();
    }
    }

