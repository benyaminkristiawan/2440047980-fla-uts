package builder;

import models.theme.Serenity;
import theme.background.Background;
import theme.border.Border;
import theme.icon.Icon;
import theme.music.Music;

public class SerenityBuilder implements ThemeBuilder{

	private Serenity serenity;
	
	public SerenityBuilder() {
		serenity = new Serenity(null, null, null, null);
	}

	@Override
	public void setBackground(Background background) {
		// TODO Auto-generated method stub
		serenity.setBackground(background);
	}

	@Override
	public void setBorder(Border border) {
		// TODO Auto-generated method stub
		serenity.setBorder(border);
	}

	@Override
	public void setIcon(Icon icon) {
		// TODO Auto-generated method stub
		serenity.setIcon(icon);
	}

	@Override
	public void setMusic(Music music) {
		// TODO Auto-generated method stub
		serenity.setMusic(music);
	}
	public Serenity getTheme() {
		return serenity;
	}
}
