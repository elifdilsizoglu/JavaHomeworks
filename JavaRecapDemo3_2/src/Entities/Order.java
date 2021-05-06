package Entities;

public class Order implements IEntity {
	private int id;
	private User user;
	private Game game;
	private Campaign campaign;
	private double totalPrice;
	private boolean status;
	
	public Order(int id, User user, Game game, Campaign campaign, double totalPrice, boolean status) {
		super();
		this.id = id;
		this.user = user;
		this.game = game;
		this.campaign = campaign;
		this.totalPrice = totalPrice;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public Campaign getCampaign() {
		return campaign;
	}

	public void setCampaign(Campaign campaign) {
		this.campaign = campaign;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}


}
