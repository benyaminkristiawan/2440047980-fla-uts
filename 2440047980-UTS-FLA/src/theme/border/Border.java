package theme.border;

public class Border {
	protected String type;
	protected String warna;

	public Border(String type, String warna) {
		super();
		this.type = type;
		this.warna = warna;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getWarna() {
		return warna;
	}

	public void setWarna(String warna) {
		this.warna = warna;
	}

}
