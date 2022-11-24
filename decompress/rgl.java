import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rgl implements k9t
{
    public final h3t<l3t> a(final Context context, final i3t i3t, final jpv jpv, final int m1) {
        e0e.f((Object)context, "context");
        e0e.f((Object)i3t, "requestConfig");
        e0e.f((Object)jpv, "urtCursorProvider");
        if (fdi.d().f() == eei.H0) {
            final fg4 fg4 = new fg4(iuk.g0(i3t));
            ((o1p)fg4).q(new String[] { "profile", "tweets_and_replies", "stream", null, "poor_network" });
            sbw.b((tlm)fg4);
        }
        final tqv tqv = new tqv(context, iuk.g0(i3t), iuk.d0(i3t), i3t.g, jpv, 27, i3t.d, iuk.h0(i3t));
        ((h3t)tqv).l1 = i3t.c;
        final int a = o5j.a;
        ((h3t)tqv).m1 = m1;
        return (h3t<l3t>)tqv;
    }
}
