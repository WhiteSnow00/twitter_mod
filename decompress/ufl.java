import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ufl implements y7t
{
    public final x1t<b2t> a(final Context context, final y1t y1t, final znv znv, final int j1) {
        zzd.f((Object)context, "context");
        zzd.f((Object)y1t, "requestConfig");
        zzd.f((Object)znv, "urtCursorProvider");
        if (mci.d().f() == kdi.E0) {
            final zf4 zf4 = new zf4(ivl.k(y1t));
            zf4.q(new String[] { "profile", "tweets", "stream", null, "poor_network" });
            saw.b((okm)zf4);
        }
        final mpv mpv = new mpv(context, ivl.k(y1t), ivl.j(y1t), y1t.g, znv, 28, y1t.d, ivl.l(y1t));
        ((x1t)mpv).i1 = y1t.c;
        final int a = w4j.a;
        ((x1t)mpv).j1 = j1;
        return (x1t<b2t>)mpv;
    }
}
