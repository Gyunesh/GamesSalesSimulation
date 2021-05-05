package Entities;


public class Campaign {
	
	private int id;
	private String campaignName;
	private String campaignDescription;
	
	public Campaign() {
		
	}

	public Campaign(int id, String campaignName, String campaignDescription) {
		this.id = id;
		this.campaignName = campaignName;
		this.campaignDescription = campaignDescription;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public String getCampaignDescription() {
		return campaignDescription;
	}

	public void setCampaignDescription(String campaignDescription) {
		this.campaignDescription = campaignDescription;
	}
	
}
