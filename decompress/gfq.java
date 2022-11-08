import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gfq
{
    public final void a(final jsi jsi, final String s) {
        zzd.f((Object)jsi, "info");
        final String h = jsi.h;
        final xca a = xca.a();
        final UserIdentifier b = jsi.B;
        final zf4 zf4 = new zf4(jsi.B);
        zf4.T = nca.Companion.e("notification", "status_bar", "", h, s).toString();
        final int a2 = w4j.a;
        zf4.v = jsi.c;
        a.b(b, (okm)zf4);
    }
    
    public final void b(final jsi jsi, final String s, final double n, int a, final int n2, final String s2, final String s3) {
        zzd.f((Object)jsi, "info");
        final lev lev = new lev();
        lev.r1 = new lfq(n, a, n2, s2, s3);
        final String h = jsi.h;
        final xca a2 = xca.a();
        final UserIdentifier b = jsi.B;
        final zf4 zf4 = new zf4(jsi.B);
        zf4.T = nca.Companion.e("notification", "status_bar", "", h, s).toString();
        a = w4j.a;
        zf4.v = jsi.c;
        zf4.i((szo)lev);
        a2.b(b, (okm)zf4);
    }
}
