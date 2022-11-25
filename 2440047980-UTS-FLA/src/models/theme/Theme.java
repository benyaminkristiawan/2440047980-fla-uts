package models.theme;

import theme.background.Background;
import theme.border.Border;
import theme.icon.Icon;
import theme.music.Music;

public abstract class Theme {
	protected Background background;
	protected Border border;
	protected Icon icon;
	protected Music music;
	
	public Theme(Background background, Border border, Icon icon, Music music) {
		super();
		this.background = background;
		this.border = border;
		this.icon = icon;
		this.music = music;
	}

	public Background getBackground() {
		return background;
	}

	public void setBackground(Background background) {
		this.background = background;
	}

	public Border getBorder() {
		return border;
	}

	public void setBorder(Border border) {
		this.border = border;
	}

	public Icon getIcon() {
		return icon;
	}

	public void setIcon(Icon icon) {
		this.icon = icon;
	}

	public Music getMusic() {
		return music;
	}

	public void setMusic(Music music) {
		this.music = music;
	}
	
}
