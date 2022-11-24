import com.twitter.util.user.UserIdentifier;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abp implements k9t
{
    public final h3t<l3t> a(final Context context, final i3t i3t, final jpv jpv, int g) {
        e0e.f((Object)context, "context");
        e0e.f((Object)i3t, "requestConfig");
        e0e.f((Object)jpv, "urtCursorProvider");
        final String a = i3t.k.a("q");
        final UserIdentifier g2 = iuk.g0(i3t);
        g = i3t.g;
        final String b = i3t.a.a.b;
        final arv k = i3t.k;
        final String value = String.valueOf(a);
        final kbv h0 = iuk.h0(i3t);
        final int k2 = drv.K1;
        return (h3t<l3t>)new drv(context, g2, g, jpv, b, k, value, x7p.a(context, g2), h0);
    }
}
