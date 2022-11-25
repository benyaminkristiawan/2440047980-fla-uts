package builder;

import models.theme.VIPTheme;
import theme.background.Background;
import theme.border.Border;
import theme.icon.Icon;
import theme.music.Music;

public class VIPThemeBuilder implements ThemeBuilder {

	private VIPTheme vipTheme;
	
	public VIPThemeBuilder() {
		// TODO Auto-generated constructor stub
		vipTheme=new VIPTheme(null, null, null, null);
	}

	@Override
	public void setBackground(Background background) {
		// TODO Auto-generated method stub
		vipTheme.setBackground(background);
	}

	@Override
	public void setBorder(Border border) {
		// TODO Auto-generated method stub
		vipTheme.setBorder(border);
	}

	@Override
	public void setIcon(Icon icon) {
		// TODO Auto-generated method stub
		vipTheme.setIcon(icon);
	}

	@Override
	public void setMusic(Music music) {
		// TODO Auto-generated method stub
		vipTheme.setMusic(music);
	}
	public VIPTheme getTheme() {
		return vipTheme;
	}
}
