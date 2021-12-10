package Concrete;

import Abstract.CustomerService;
import Abstract.PersonCheckService;
import Entities.Customer;

public class CustomerManager implements CustomerService {
    PersonCheckService personCheckService;

    public CustomerManager() {
    }

    public CustomerManager(PersonCheckService personCheckService) {
        this.personCheckService = personCheckService;
    }

    @Override
    public void add(Customer customer) {
        if(personCheckService.checkIfRealPerson(customer)) {
            System.out.println(customer.getFirstName() + " " + customer.getLastName() + " basariyla kayit oldu");
        }else{
            System.out.println("kayit mernisde bulunamadi");
        }
    }

    @Override
    public void update(Customer customer) {
        System.out.println(customer.getFirstName()+" "+customer.getLastName()+" bilgilerini guncelledi");
    }

    @Override
    public void delete(Customer customer) {
        System.out.println(customer.getFirstName()+" "+customer.getLastName()+" kaydini sildi");

    }
}
