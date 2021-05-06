package Business;

import Entities.Campaign;
import Logger.LoggerService;

public class CampaignManager implements CamapaignService {
	private LoggerService[] loggers;
	
	public CampaignManager(LoggerService... loggers) {
		this.loggers = loggers;
	}
	@Override
	public void add(Campaign campaign) {
		System.out.println("kampanya eklendi");
		for (LoggerService loggerService : loggers) {
			System.out.println("kampanya eklendi");
		}

	}

	@Override
	public void delete(Campaign campaign) {
		campaign.setDiscountApplied(false);
		System.out.println("kampanya silindi");
		for (LoggerService loggerService : loggers) {
			System.out.println("kampanya silindi");
		}

	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("kampanya güncellendi");
		for (LoggerService loggerService : loggers) {
			System.out.println("kampanya güncellendi");
		}

	}

}
