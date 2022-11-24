import android.os.BaseBundle;
import android.os.Bundle;
import java.util.List;
import com.twitter.business.features.mobileappmodule.model.MobileAppUrlsByStore;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class h7z implements qur
{
    public static final h7z F0;
    
    static {
        F0 = new h7z();
    }
    
    public void a(final Map map, final Map map2, final String s, final pah pah) {
        final String j = bs4.J(map, s);
        if (!e0e.a((Object)j, (Object)"not_found")) {
            bs4.m0(map2, Float.parseFloat(j), pah);
        }
    }
    
    public void b(final Map map, final Map map2, final String s, final pah pah) {
        final String i = bs4.I(map, q6r.F0, s);
        if (!e0e.a((Object)i, (Object)"not_found")) {
            bs4.m0(map2, Float.parseFloat(i), pah);
        }
    }
    
    public void c(final Map map, final Map map2, final String s, final pah pah) {
        final String i = bs4.I(map, q6r.F0, s);
        if (!e0e.a((Object)i, (Object)"not_found")) {
            bs4.m0(map2, Integer.parseInt(i), pah);
        }
    }
    
    public MobileAppUrlsByStore d(final pfh pfh) {
        String a = pfh.a;
        final List list = null;
        List x0 = null;
        Label_0040: {
            if (a != null) {
                if (!(slr.k1((CharSequence)a) ^ true)) {
                    a = null;
                }
                if (a != null) {
                    x0 = shw.x0((Object)a);
                    break Label_0040;
                }
            }
            x0 = null;
        }
        String b = pfh.b;
        List x2 = list;
        if (b != null) {
            if (!(slr.k1((CharSequence)b) ^ true)) {
                b = null;
            }
            x2 = list;
            if (b != null) {
                x2 = shw.x0((Object)b);
            }
        }
        return new MobileAppUrlsByStore(x0, x2);
    }
    
    public mcs e(final Object o) {
        final Bundle bundle = (Bundle)o;
        final int h = smo.h;
        mcs mcs;
        if (bundle != null && ((BaseBundle)bundle).containsKey("google.messenger")) {
            mcs = mds.e((Object)null);
        }
        else {
            mcs = mds.e((Object)bundle);
        }
        return mcs;
    }
}
