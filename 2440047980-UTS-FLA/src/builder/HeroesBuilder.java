package builder;

import models.theme.Heroes;
import theme.background.Background;
import theme.border.Border;
import theme.icon.Icon;
import theme.music.Music;

public class HeroesBuilder implements ThemeBuilder {

	private Heroes heroes;
	public HeroesBuilder() {
		heroes=new Heroes(null, null, null, null);
	}
	@Override
	public void setBackground(Background background) {
		// TODO Auto-generated method stub
		heroes.setBackground(background);
	}

	@Override
	public void setBorder(Border border) {
		// TODO Auto-generated method stub
		heroes.setBorder(border);
	}

	@Override
	public void setIcon(Icon icon) {
		// TODO Auto-generated method stub
		heroes.setIcon(icon);
	}

	@Override
	public void setMusic(Music music) {
		// TODO Auto-generated method stub
		heroes.setMusic(music);
	}
	public Heroes getTheme() {
		return heroes;
	}
	
}
