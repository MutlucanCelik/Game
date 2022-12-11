package entities;

public class Campaign {

	private int id;
	private String campaignName;
	private int discountPercent;
	private String registerType;
	public Campaign(int id, String campaignName, int discountPercent, String registerType) {
		super();
		this.id = id;
		this.campaignName = campaignName;
		this.discountPercent = discountPercent;
		this.registerType = registerType;
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
	public int getDiscountPercent() {
		return discountPercent;
	}
	public void setDiscountPercent(int discountPercent) {
		this.discountPercent = discountPercent;
	}
	public String getRegisterType() {
		return registerType;
	}
	public void setRegisterType(String registerType) {
		this.registerType = registerType;
	}
	
	
	
}
