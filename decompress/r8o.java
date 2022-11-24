import android.content.res.AssetFileDescriptor;
import java.io.IOException;
import android.media.MediaPlayer$OnCompletionListener;
import java.util.Iterator;
import java.util.List;
import android.media.MediaPlayer;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class r8o
{
    public static final a Companion;
    public final Context a;
    public final MediaPlayer b;
    public final t10 c;
    public final gcu d;
    public final List<String> e;
    public Iterator<String> f;
    public final e39 g;
    public boolean h;
    
    static {
        Companion = new a();
    }
    
    public r8o(final Context a, final MediaPlayer b, final kcm kcm, final t10 c, final gcu d) {
        e0e.f((Object)a, "context");
        e0e.f((Object)b, "mediaPlayer");
        e0e.f((Object)kcm, "releaseCompletable");
        e0e.f((Object)c, "applicationManager");
        e0e.f((Object)d, "preferences");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        final List y0 = shw.y0((Object[])new String[] { "join_guest_1.ogg", "join_guest_2.ogg", "join_guest_3.ogg", "join_guest_4.ogg", "join_guest_5.ogg", "join_guest_6.ogg" });
        this.e = y0;
        this.f = y0.iterator();
        this.g = new e39();
        this.h = true;
        kcm.i((sj)new qp3((Object)this, 25));
    }
    
    public final void a(final String s, final boolean b) {
        if (this.d.e("room_sound_effects_enabled", true)) {
            if (this.h) {
                MediaPlayer b2;
                if (b) {
                    b2 = this.b;
                }
                else {
                    b2 = new MediaPlayer();
                }
                try {
                    b2.reset();
                    b2.setVolume(1.0f, 1.0f);
                    b2.setLooping(false);
                    final AssetFileDescriptor openFd = this.a.getAssets().openFd(s);
                    e0e.e((Object)openFd, "context.assets.openFd(filename)");
                    b2.setDataSource(openFd.getFileDescriptor(), openFd.getStartOffset(), openFd.getLength());
                    openFd.close();
                    b2.prepare();
                    b2.setOnCompletionListener((MediaPlayer$OnCompletionListener)new q8o(b));
                    b2.start();
                }
                catch (final Exception ex) {
                    final Throwable t = new Throwable("RoomSoundEffectsManager: playFromAsset", ex);
                    if (ex instanceof IOException) {
                        r9a.h(t);
                    }
                    else {
                        r9a.d(t);
                    }
                }
            }
        }
    }
    
    public static final class a
    {
    }
}
