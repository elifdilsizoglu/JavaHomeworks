package Entities;

public class Game implements IEntity {
	private int id;
	private String name;
	private double price;
	private double finalPrice;
	private Campaign campaign;
	private boolean status;
	
	public Game(int id, String name, double price,Campaign campaign, boolean status) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.campaign = campaign;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getFinalPrice() {
		return finalPrice;
	}

	public void setFinalPrice(double finalPrice, Campaign campaing) {
		if(campaign.isDiscountApplied()&& campaign  !=  null) {
			this.finalPrice = this.price-this.price*campaign.getDiscount()/100;
		}else {
			this.finalPrice= this.price;
		}
		
	}

	public Campaign getCampaign() {
		return campaign;
	}

	public void setCampaign(Campaign campaign) {
		this.campaign = campaign;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
}
