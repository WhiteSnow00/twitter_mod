import android.content.Context;
import android.preference.PreferenceManager;
import java.util.Objects;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lqf
{
    public final boolean a;
    
    public lqf(final kvf kvf, final Activity activity) {
        Objects.requireNonNull(kvf);
        this.a = (!ita.b().b("live_event_hero_video_use_autoplay_manager_enabled", false) || tqb.q(PreferenceManager.getDefaultSharedPreferences((Context)activity)));
    }
}
