import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class tcq
{
    public static final yya a;
    public static final yya b;
    public static final yya c;
    public static final wsx d;
    public static final wsx e;
    public static final wsx f;
    public static final wsx g;
    public static final wsx h;
    public static final wsx i;
    
    static {
        a = new yya(2, 1.0f, (rtb)new scq(1.0f));
        b = new yya(1, 1.0f, (rtb)new qcq(1.0f));
        c = new yya(3, 1.0f, (rtb)new rcq(1.0f));
        Objects.requireNonNull(dx.Companion);
        d = c((dx$b)dx$a.o, false);
        e = c((dx$b)dx$a.n, false);
        f = a((dx$c)dx$a.l, false);
        g = a((dx$c)dx$a.k, false);
        h = b((dx)dx$a.f, false);
        i = b((dx)dx$a.b, false);
    }
    
    public static final wsx a(final dx$c dx$c, final boolean b) {
        return new wsx(1, b, (gub)new tcq$a(dx$c), (Object)dx$c, (rtb)new tcq$b(dx$c, b));
    }
    
    public static final wsx b(final dx dx, final boolean b) {
        return new wsx(3, b, (gub)new tcq$c(dx), (Object)dx, (rtb)new tcq$d(dx, b));
    }
    
    public static final wsx c(final dx$b dx$b, final boolean b) {
        return new wsx(2, b, (gub)new tcq$e(dx$b), (Object)dx$b, (rtb)new tcq$f(dx$b, b));
    }
    
    public static final jkh d(final jkh jkh, final float n, final float n2) {
        zzd.f((Object)jkh, "$this$defaultMinSize");
        final ssd$a a = ssd.a;
        final ssd$a a2 = ssd.a;
        return jkh.E((jkh)new d1w(n, n2));
    }
    
    public static jkh f(final jkh jkh) {
        zzd.f((Object)jkh, "<this>");
        return jkh.E((jkh)tcq.b);
    }
    
    public static jkh g(final jkh jkh) {
        zzd.f((Object)jkh, "<this>");
        return jkh.E((jkh)tcq.c);
    }
    
    public static final jkh h(final jkh jkh, final float n) {
        zzd.f((Object)jkh, "<this>");
        yya a;
        if (n == 1.0f) {
            a = tcq.a;
        }
        else {
            a = new yya(2, n, (rtb)new scq(n));
        }
        return jkh.E((jkh)a);
    }
    
    public static final jkh j(final jkh jkh, final float n) {
        zzd.f((Object)jkh, "$this$height");
        final ssd$a a = ssd.a;
        final ssd$a a2 = ssd.a;
        return jkh.E((jkh)new vcq(0.0f, n, 0.0f, n, 5));
    }
    
    public static jkh k(final jkh jkh, float n, float n2, final int n3) {
        if ((n3 & 0x1) != 0x0) {
            Objects.requireNonNull(e99.Companion);
            n = Float.NaN;
        }
        if ((n3 & 0x2) != 0x0) {
            Objects.requireNonNull(e99.Companion);
            n2 = Float.NaN;
        }
        zzd.f((Object)jkh, "$this$heightIn");
        final ssd$a a = ssd.a;
        final ssd$a a2 = ssd.a;
        return jkh.E((jkh)new vcq(0.0f, n, 0.0f, n2, 5));
    }
    
    public static final jkh l(final jkh jkh, final float n) {
        zzd.f((Object)jkh, "$this$requiredSize");
        final ssd$a a = ssd.a;
        final ssd$a a2 = ssd.a;
        return jkh.E((jkh)new vcq(n, n, n, n, false));
    }
    
    public static final jkh m(final jkh jkh, final float n) {
        zzd.f((Object)jkh, "$this$size");
        final ssd$a a = ssd.a;
        final ssd$a a2 = ssd.a;
        return jkh.E((jkh)new vcq(n, n, n, n, true));
    }
    
    public static final jkh n(final jkh jkh, final long n) {
        zzd.f((Object)jkh, "$this$size");
        return o(jkh, h99.b(n), h99.a(n));
    }
    
    public static final jkh o(final jkh jkh, final float n, final float n2) {
        zzd.f((Object)jkh, "$this$size");
        final ssd$a a = ssd.a;
        final ssd$a a2 = ssd.a;
        return jkh.E((jkh)new vcq(n, n2, n, n2, true));
    }
    
    public static final jkh p(final jkh jkh, final float n, final float n2, final float n3, final float n4) {
        zzd.f((Object)jkh, "$this$sizeIn");
        final ssd$a a = ssd.a;
        final ssd$a a2 = ssd.a;
        return jkh.E((jkh)new vcq(n, n2, n3, n4, true));
    }
    
    public static final jkh r(final jkh jkh, final float n) {
        zzd.f((Object)jkh, "$this$width");
        final ssd$a a = ssd.a;
        final ssd$a a2 = ssd.a;
        return jkh.E((jkh)new vcq(n, 0.0f, n, 0.0f, 10));
    }
    
    public static jkh s(final jkh jkh, float n, float n2, final int n3) {
        if ((n3 & 0x1) != 0x0) {
            Objects.requireNonNull(e99.Companion);
            n = Float.NaN;
        }
        if ((n3 & 0x2) != 0x0) {
            Objects.requireNonNull(e99.Companion);
            n2 = Float.NaN;
        }
        zzd.f((Object)jkh, "$this$widthIn");
        final ssd$a a = ssd.a;
        final ssd$a a2 = ssd.a;
        return jkh.E((jkh)new vcq(n, 0.0f, n2, 0.0f, 10));
    }
    
    public static jkh t(final jkh jkh) {
        final dx$a companion = dx.Companion;
        Objects.requireNonNull(companion);
        final gw1$b l = dx$a.l;
        zzd.f((Object)jkh, "<this>");
        Objects.requireNonNull(companion);
        wsx wsx;
        if (zzd.a((Object)l, (Object)l)) {
            wsx = tcq.f;
        }
        else if (zzd.a((Object)l, (Object)dx$a.k)) {
            wsx = tcq.g;
        }
        else {
            wsx = a((dx$c)l, false);
        }
        return jkh.E((jkh)wsx);
    }
    
    public static jkh u(final jkh jkh, dx f, final int n) {
        if ((n & 0x1) != 0x0) {
            Objects.requireNonNull(dx.Companion);
            f = (dx)dx$a.f;
        }
        zzd.f((Object)jkh, "<this>");
        zzd.f((Object)f, "align");
        Objects.requireNonNull(dx.Companion);
        wsx wsx;
        if (zzd.a((Object)f, (Object)dx$a.f)) {
            wsx = tcq.h;
        }
        else if (zzd.a((Object)f, (Object)dx$a.b)) {
            wsx = tcq.i;
        }
        else {
            wsx = b(f, false);
        }
        return jkh.E((jkh)wsx);
    }
    
    public static jkh v(final jkh jkh, dx$b o, final int n) {
        if ((n & 0x1) != 0x0) {
            Objects.requireNonNull(dx.Companion);
            o = (dx$b)dx$a.o;
        }
        zzd.f((Object)jkh, "<this>");
        zzd.f((Object)o, "align");
        Objects.requireNonNull(dx.Companion);
        wsx wsx;
        if (zzd.a((Object)o, (Object)dx$a.o)) {
            wsx = tcq.d;
        }
        else if (zzd.a((Object)o, (Object)dx$a.n)) {
            wsx = tcq.e;
        }
        else {
            wsx = c(o, false);
        }
        return jkh.E((jkh)wsx);
    }
}
