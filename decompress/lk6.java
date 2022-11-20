import java.util.List;
import java.util.HashMap;
import java.nio.ByteBuffer;
import java.util.Map;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lk6
{
    public static final int f;
    public static final long g;
    public final Context a;
    public final UserIdentifier b;
    public final i1g c;
    public final ek6 d;
    public final a e;
    
    static {
        final boolean b = asa.b().b("onboarding_legacy_addressbook_upload_behavior_enabled", false);
        int f2;
        if (b) {
            f2 = 50;
        }
        else {
            f2 = 100;
        }
        f = f2;
        long g2;
        if (b) {
            g2 = 0L;
        }
        else {
            g2 = f2 * 1000 / 500;
        }
        g = g2;
    }
    
    public lk6(final Context a, final UserIdentifier b, final i1g c, final ek6 d, final a e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final void a(final Map<String, ByteBuffer> map, final nk6 nk6, final boolean b, final boolean b2) {
        final int size = map.size();
        if (size > 0) {
            final int b3 = b2v.b(size, lk6.f);
            final List u = rif.u((Iterable)map.keySet());
            final HashMap hashMap = new HashMap();
            for (int i = 0; i < b3; ++i) {
                final int f = lk6.f;
                final int n = i * f;
                hashMap.put(i, u.subList(n, Math.min(u.size(), f + n)));
            }
            h5j.fromIterable((Iterable)hashMap.keySet()).flatMap((psb)new jk6(this, b, b2, hashMap, (Map)map, nk6)).takeUntil((ytk)a71.X0).subscribeOn(owo.c()).subscribe();
        }
    }
    
    public static final class a
    {
    }
}
