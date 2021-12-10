package com.company;

import Concrete.*;
import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Customer customer =new Customer(1,"Rza","Maharramov","991212",2003);
        Game game = new Game(1,"CallofDuty",100);
        Campaign campaign = new Campaign(1,"Christmas indirimi",20);

        CustomerManager customerManager = new CustomerManager(new PersonCheckManager());
        customerManager.add(customer);
        GameManager gameManager = new GameManager();
        gameManager.add(game);
        CampaignManager campaignManager = new CampaignManager();
        campaignManager.add(campaign);
        SaleManager saleManager = new SaleManager();
        saleManager.sale(customer,game,campaign);


    }
}
