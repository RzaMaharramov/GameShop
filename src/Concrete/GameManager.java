package Concrete;

import Abstract.GameService;
import Entities.Game;

public  class GameManager implements GameService {


    @Override
    public void add(Game game) {
        System.out.println(game.getGameName()+" "+game.getGamePrice()+"TL fiyatiyla oyun listenize eklendi");
    }

    @Override
    public void update(Game game) {
        System.out.println(game.getGameName()+" oyununuz guncellendi");
    }

    @Override
    public void delete(Game game) {
        System.out.println(game.getGameName()+" oyununuz listenizden silindi");

    }
}
