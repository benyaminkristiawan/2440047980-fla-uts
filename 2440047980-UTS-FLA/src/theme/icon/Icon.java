package theme.icon;

public abstract class Icon {
	protected String pic;

	public Icon(String pic) {
		super();
		this.pic = pic;
	}

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}
	
}
