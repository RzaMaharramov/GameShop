package Concrete;

import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public class SaleManager {
public void sale(Customer customer,Game game,Campaign campaign){
    double discountPrice =(game.getGamePrice()-game.getGamePrice()*campaign.getDiscount()/100);
    System.out.println(customer.getFirstName()+" "+customer.getLastName()+" adli oyuncu "+game.getGameName()+" oyununu "+discountPrice+"TL fiyatiyla satin aldi");
}
}
