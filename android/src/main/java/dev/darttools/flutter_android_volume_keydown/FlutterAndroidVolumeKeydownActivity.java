package dev.darttools.flutter_android_volume_keydown;

import static android.view.KeyEvent.KEYCODE_VOLUME_DOWN;
import static android.view.KeyEvent.KEYCODE_VOLUME_UP;

import static dev.darttools.flutter_android_volume_keydown.FlutterAndroidVolumeKeydownPlugin.eventSink;

import android.view.KeyEvent;
import java.io.Console;
import io.flutter.embedding.android.FlutterActivity;
import android.os.Build;

public class FlutterAndroidVolumeKeydownActivity extends FlutterActivity {
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        /*
        if(keyCode == KEYCODE_VOLUME_DOWN && eventSink != null) {
            eventSink.success(true);
            return true;
        }
        if(keyCode == KEYCODE_VOLUME_UP && eventSink != null) {
            eventSink.success(false);
            return true;
        }
        */

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            return super.onKeyDown(keyCode, event);
        }

        switch (keyCode) {
            case KeyEvent.KEYCODE_MEDIA_PLAY:
                eventSink.success(true);
                return true;
        }

        return super.onKeyDown(keyCode, event);
    }
}
