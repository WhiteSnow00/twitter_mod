import com.twitter.util.user.UserIdentifier;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class e2k implements y7t
{
    public final x1t<b2t> a(final Context context, final y1t y1t, final znv znv, int g) {
        zzd.f((Object)context, "context");
        zzd.f((Object)y1t, "requestConfig");
        zzd.f((Object)znv, "urtCursorProvider");
        final UserIdentifier k = ivl.k(y1t);
        g = y1t.g;
        final tpv i = y1t.k;
        zzd.e((Object)i, "requestConfig.requestParams");
        return (x1t<b2t>)new w6w(context, k, g, znv, i, y1t.a.a.b, ivl.l(y1t));
    }
}
