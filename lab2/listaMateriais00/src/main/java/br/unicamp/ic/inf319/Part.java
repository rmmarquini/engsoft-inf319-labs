package br.unicamp.ic.inf319;

public class Part {
	
	private String title;
	private String description;
	private final PartNumber partNumber;
	
	public Part(String title, String description, PartNumber partNumber) {
		this.setTitle("");
		this.setDescription("");
		this.partNumber = new PartNumber();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public PartNumber getPartNumber() {
		return partNumber;
	}
	
	
	
}
