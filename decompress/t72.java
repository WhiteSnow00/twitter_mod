// 
// Decompiled by Procyon v0.6.0
// 

public final class t72
{
    public static final jkh a(final jkh jkh, final a82 a82, final oqp oqp) {
        zzd.f((Object)jkh, "<this>");
        zzd.f((Object)a82, "border");
        zzd.f((Object)oqp, "shape");
        return c(jkh, a82.a, a82.b, oqp);
    }
    
    public static final jkh b(final jkh jkh, final float n, final long n2, final oqp oqp) {
        zzd.f((Object)jkh, "$this$border");
        zzd.f((Object)oqp, "shape");
        return c(jkh, n, new skq(n2), oqp);
    }
    
    public static final jkh c(final jkh jkh, final float n, final oq2 oq2, final oqp oqp) {
        zzd.f((Object)jkh, "$this$border");
        zzd.f((Object)oq2, "brush");
        zzd.f((Object)oqp, "shape");
        final ssd$a a = ssd.a;
        return l76.a(jkh, (rtb)ssd.a, (jub)new t72$a(n, oqp, oq2));
    }
    
    public static final q72 d(final d7m<q72> d7m) {
        q72 a;
        if ((a = (q72)d7m.a) == null) {
            a = new q72((h6d)null, (rg3)null, (sg3)null, (hzj)null, 15, (hg8)null);
            d7m.a = a;
        }
        return a;
    }
    
    public static final long e(final long n, final float n2) {
        return zi8.d(Math.max(0.0f, jy6.b(n) - n2), Math.max(0.0f, jy6.c(n) - n2));
    }
}
