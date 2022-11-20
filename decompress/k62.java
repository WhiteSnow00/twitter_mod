import com.twitter.util.user.UserIdentifier;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class k62 implements q8t
{
    public final n2t<r2t> a(final Context context, final o2t o2t, final yov yov, int g) {
        czd.f((Object)context, "context");
        czd.f((Object)o2t, "requestConfig");
        czd.f((Object)yov, "urtCursorProvider");
        final UserIdentifier b = eli.B(o2t);
        g = o2t.g;
        final String b2 = o2t.a.a.b;
        final pqv k = o2t.k;
        czd.e((Object)k, "requestConfig.requestParams");
        return (n2t<r2t>)new y52(context, b, g, yov, b2, k, eli.C(o2t));
    }
}
