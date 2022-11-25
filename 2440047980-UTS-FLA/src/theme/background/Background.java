package theme.background;

public abstract class Background {
	
	protected String name;
	protected String pallete;
	
	public Background(String name, String pallete) {
		super();
		this.name = name;
		this.pallete = pallete;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPallete() {
		return pallete;
	}
	public void setPallete(String pallete) {
		this.pallete = pallete;
	}
	
}
