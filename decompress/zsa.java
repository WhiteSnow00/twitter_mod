import java.util.Objects;
import android.content.SharedPreferences;
import android.content.SharedPreferences$OnSharedPreferenceChangeListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zsa implements SharedPreferences$OnSharedPreferenceChangeListener
{
    public final int D0;
    public final Object E0;
    
    public zsa(final Object e0, final int d0) {
        this.D0 = d0;
        this.E0 = e0;
    }
    
    public final void onSharedPreferenceChanged(final SharedPreferences sharedPreferences, final String s) {
        switch (this.D0) {
            default: {
                final d7j d7j = (d7j)this.E0;
                if ("coin.amount".equals(s)) {
                    ((i6j$a)d7j).onNext((Object)sharedPreferences.getLong(s, 0L));
                }
                return;
            }
            case 1: {
                final bbs bbs = (bbs)this.E0;
                czd.f((Object)bbs, "this$0");
                czd.f((Object)s, "key");
                if (czd.a((Object)bbs.a, (Object)s)) {
                    bbs.d = bbs.b.getBoolean(bbs.a, true);
                    final af4 af4 = new af4();
                    String s2;
                    if (bbs.d) {
                        s2 = "enable_tap_to_search";
                    }
                    else {
                        s2 = "disable_tap_to_search";
                    }
                    ((u0p)af4).q(new String[] { hmg.h("settings::::", s2) });
                    cbw.b((elm)af4);
                }
                return;
            }
            case 0: {
                Objects.requireNonNull(this.E0);
                wk0.b().t();
            }
        }
    }
}
