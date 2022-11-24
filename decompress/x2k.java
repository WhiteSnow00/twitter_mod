import com.twitter.util.user.UserIdentifier;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class x2k implements k9t
{
    public final h3t<l3t> a(final Context context, final i3t i3t, final jpv jpv, int g) {
        e0e.f((Object)context, "context");
        e0e.f((Object)i3t, "requestConfig");
        e0e.f((Object)jpv, "urtCursorProvider");
        final UserIdentifier g2 = iuk.g0(i3t);
        g = i3t.g;
        final arv k = i3t.k;
        e0e.e((Object)k, "requestConfig.requestParams");
        return (h3t<l3t>)new v7w(context, g2, g, jpv, k, i3t.a.a.b, iuk.h0(i3t));
    }
}
