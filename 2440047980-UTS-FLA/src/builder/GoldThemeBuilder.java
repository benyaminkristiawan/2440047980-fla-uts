package builder;

import models.theme.GoldTheme;
import theme.background.Background;
import theme.border.Border;
import theme.icon.Icon;
import theme.music.Music;

public class GoldThemeBuilder implements ThemeBuilder {
	
	private GoldTheme goldTheme ;
	
	public GoldThemeBuilder() {
		goldTheme = new GoldTheme(null, null, null, null);
	}
	
	@Override
	public void setBackground(Background background) {
		// TODO Auto-generated method stub
		goldTheme.setBackground(background);
	}

	@Override
	public void setBorder(Border border) {
		// TODO Auto-generated method stub
		goldTheme.setBorder(border);
	}

	@Override
	public void setIcon(Icon icon) {
		// TODO Auto-generated method stub
		goldTheme.setIcon(icon);
	}

	@Override
	public void setMusic(Music music) {
		// TODO Auto-generated method stub
		goldTheme.setMusic(music);
	}
	
	public GoldTheme getTheme() {
		return goldTheme;
	}

}
