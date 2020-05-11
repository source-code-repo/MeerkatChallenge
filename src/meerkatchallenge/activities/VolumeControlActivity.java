package meerkatchallenge.activities;

import android.app.Activity;
import android.media.AudioManager;
import android.os.Bundle;

/**
 * An activity that makes the volume controls affect only 
 * the STREAM_MUSIC volume.
 * @author 
 *
 */
public class VolumeControlActivity extends Activity {
	/**
	 * Sets the volume buttons to control STREAM_MUSIC
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		setVolumeControlStream(AudioManager.STREAM_MUSIC);
		super.onCreate(savedInstanceState);
	}
}
