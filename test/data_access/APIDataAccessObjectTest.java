package data_access;

import entity.Playlist;
import entity.Song;
import org.json.JSONObject;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class APIDataAccessObjectTest {


    @Before
    public void setUp() {
        // Instance of APIDataAccessObject not required since methods are static
    }

    @Test
    public void requestAccessToken() {
        String accessToken = APIDataAccessObject.requestAccessToken();
        assertNotNull(accessToken);

    }

    @Test
    public void requestPlaylistData() {
        String accessToken = APIDataAccessObject.requestAccessToken();
        JSONObject playlistData = APIDataAccessObject.requestPlaylistData(accessToken, "37i9dQZF1DX5Ejj0EkURtP");
        assertNotNull(playlistData);
    }

    @Test
    public void getSong() {
        String accessToken = APIDataAccessObject.requestAccessToken();
        JSONObject playlistData = APIDataAccessObject.requestPlaylistData(accessToken, "37i9dQZF1DX5Ejj0EkURtP");
        Song song  = APIDataAccessObject.getSong(playlistData, 0);
        assertNotNull(song.getTitle());

    }

    @Test
    public void getPlaylist() {
        // todo

    }
}