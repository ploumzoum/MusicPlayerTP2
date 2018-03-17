package main.MusicServices;
import java.util.ArrayList;
import de.voidplus.soundcloud.*;
import main.Song.Song;
import main.Song.SongBuilder;

public class SoundCloudService implements ServiceInterface{
	
	SoundCloud soundcloud = new SoundCloud(
		    "appClientId",
		    "appClientSecret"
	);

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean authenticate() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Song> getSongs(String query) {
		// TODO Auto-generated method stub
		return null;
	}

}
