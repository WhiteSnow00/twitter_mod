import com.twitter.util.user.UserIdentifier;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class p9p implements y7t
{
    public final x1t<b2t> a(final Context context, final y1t y1t, final znv znv, int h1) {
        zzd.f((Object)context, "context");
        zzd.f((Object)y1t, "requestConfig");
        zzd.f((Object)znv, "urtCursorProvider");
        final String a = y1t.k.a("q");
        final UserIdentifier k = ivl.k(y1t);
        final int g = y1t.g;
        final String b = y1t.a.a.b;
        final tpv i = y1t.k;
        final String value = String.valueOf(a);
        final aav l = ivl.l(y1t);
        h1 = wpv.H1;
        return (x1t<b2t>)new wpv(context, k, g, znv, b, i, value, m6p.a(context, k), l);
    }
}
