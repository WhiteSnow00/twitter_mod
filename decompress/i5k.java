import android.view.ViewGroup;
import android.app.Activity;
import android.content.SharedPreferences;
import tv.periscope.android.api.ApiManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class i5k implements xpa
{
    public final ApiManager a;
    public final l9w b;
    public final u9a c;
    public final m8d d;
    public final SharedPreferences e;
    public final xmp f;
    public final e9w g;
    public final hf2 h;
    public final m8d i;
    
    public i5k(final ApiManager a, final l9w b, final u9a c, final m8d d, final SharedPreferences e, final xmp f, final e9w g, final hf2 h, final m8d i) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    public final Object a(final Object o, final Object o2, final Object o3, final Object o4, final Object o5) {
        final ApiManager a = this.a;
        final l9w b = this.b;
        final u9a c = this.c;
        final m8d d = this.d;
        final SharedPreferences e = this.e;
        final xmp f = this.f;
        final e9w g = this.g;
        final hf2 h = this.h;
        final m8d i = this.i;
        final Activity activity = (Activity)o;
        final giw giw = (giw)o2;
        final u5k u5k = (u5k)o3;
        final obi obi = (obi)o4;
        final adw adw = (adw)o5;
        final ViewGroup viewGroup = (ViewGroup)activity.findViewById(16908290);
        final int a2 = y5k.a;
        return new cdl(activity, giw, adw, viewGroup, u5k, (y5k)w5k.b, a, b, c, d, e, f, g, h, i, obi);
    }
}
