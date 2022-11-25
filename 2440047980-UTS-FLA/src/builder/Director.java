package builder;

import theme.background.BiruMetalik;
import theme.background.Emas;
import theme.background.PinkMenyala;
import theme.background.Platinum;
import theme.background.PutihPerak;
import theme.border.A;
import theme.border.B;
import theme.border.C;
import theme.border.D;
import theme.border.E;
import theme.icon.Icon1;
import theme.icon.Icon2;
import theme.icon.Icon3;
import theme.icon.Icon4;
import theme.icon.Icon5;
import theme.music.Music1;
import theme.music.Music2;
import theme.music.Music3;
import theme.music.Music4;
import theme.music.Music5;

public class Director {
	//builder
	private ThemeBuilder themeBuilder;
	
	public Director(ThemeBuilder themeBuilder) {
		this.themeBuilder = themeBuilder;
	}

	public Director() {
		// TODO Auto-generated constructor stub
	}
	public void buildSerenityTheme() {
		this.themeBuilder.setBackground(new PutihPerak());
		this.themeBuilder.setBorder(new A());
		this.themeBuilder.setIcon(new Icon1());
		this.themeBuilder.setMusic(new Music1());
	}
	
	public void buildPartyTheme() {
		this.themeBuilder.setBackground(new PinkMenyala());
		this.themeBuilder.setBorder(new B());
		this.themeBuilder.setIcon(new Icon2());
		this.themeBuilder.setMusic(new Music2());
	}
	
	public void buildHeroesTheme() {
		this.themeBuilder.setBackground(new BiruMetalik());
		this.themeBuilder.setBorder(new C());
		this.themeBuilder.setIcon(new Icon3());
		this.themeBuilder.setMusic(new Music3());
	}
	
	public void buildGoldTheme() {
		this.themeBuilder.setBackground(new Emas());
		this.themeBuilder.setBorder(new D());
		this.themeBuilder.setIcon(new Icon4());
		this.themeBuilder.setMusic(new Music4());
		
	}
	
	public void buildVIPTheme() {
		this.themeBuilder.setBackground(new Platinum());
		this.themeBuilder.setBorder(new E());
		this.themeBuilder.setIcon(new Icon5());
		this.themeBuilder.setMusic(new Music5());
	}
}
