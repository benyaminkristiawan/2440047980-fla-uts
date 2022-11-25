package builder;

import theme.background.Background;
import theme.border.Border;
import theme.icon.Icon;
import theme.music.Music;

public interface ThemeBuilder {
	public void setBackground(Background background);
	public void setBorder(Border border);
	public void setIcon(Icon icon);
	public void setMusic(Music music);
}
