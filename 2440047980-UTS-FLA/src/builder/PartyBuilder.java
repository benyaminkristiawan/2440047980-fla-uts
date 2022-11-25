package builder;

import models.theme.Party;
import theme.background.Background;
import theme.border.Border;
import theme.icon.Icon;
import theme.music.Music;

public class PartyBuilder implements ThemeBuilder{
	
	private Party party;
	
	public PartyBuilder() {
		party = new Party(null, null, null, null);
	}
	
	@Override
	public void setBackground(Background background) {
		// TODO Auto-generated method stub
		party.setBackground(background);
	}

	@Override
	public void setBorder(Border border) {
		// TODO Auto-generated method stub
		party.setBorder(border);
	}

	@Override
	public void setIcon(Icon icon) {
		// TODO Auto-generated method stub
		party.setIcon(icon);
	}

	@Override
	public void setMusic(Music music) {
		// TODO Auto-generated method stub
		party.setMusic(music);
	}
	public Party getTheme() {
		return party;
	}
}
