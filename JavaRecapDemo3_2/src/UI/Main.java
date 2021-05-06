package UI;

import Adaptors.UserCheckManager;
import Business.OrderManager;
import Entities.*;
import Logger.*;

public class Main {

	public static void main(String[] args) {
		Campaign campaign = new Campaign(1,"yýlbaþý kampanyasý",20,true);
		Game game = new Game(1,"LOL",125,campaign,true);
		User user = new User(1,"elif","d","12345687954","1995",true);
		Order order = new Order(1,user,game,campaign,game.getFinalPrice(),true);
		
		OrderManager orderManager = new OrderManager(new UserCheckManager(),new FileLogger());
		orderManager.add(order);
	}

}
