import java.util.Objects;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yro implements xro
{
    public static final yro.yro$c Companion;
    public static final dto<yro, ?> d;
    public final Map<Object, Map<String, List<Object>>> a;
    public final Map<Object, yro.yro$d> b;
    public bso c;
    
    static {
        Companion = new yro.yro$c();
        yro.d = (eto.eto$c)eto.a((gub)yro$a.C0, (rtb)yro$b.C0);
    }
    
    public yro() {
        this(null, 1, null);
    }
    
    public yro(final Map<Object, Map<String, List<Object>>> a) {
        zzd.f((Object)a, "savedStates");
        this.a = a;
        this.b = new LinkedHashMap();
    }
    
    public yro(final Map map, final int n, final hg8 hg8) {
        final LinkedHashMap a = new LinkedHashMap();
        this.a = a;
        this.b = new LinkedHashMap();
    }
    
    @Override
    public final void c(final Object o) {
        zzd.f(o, "key");
        final yro.yro$d yro$d = this.b.get(o);
        if (yro$d != null) {
            yro$d.b = false;
        }
        else {
            this.a.remove(o);
        }
    }
    
    @Override
    public final void d(final Object o, final gub<? super m76, ? super Integer, oyv> gub, final m76 m76, final int n) {
        zzd.f(o, "key");
        zzd.f((Object)gub, "content");
        final m76 h = m76.h(-1198538093);
        final ea6$b a = ea6.a;
        h.x(444418301);
        h.B(o);
        h.x(-642722479);
        h.x(-492369756);
        final Object y = h.y();
        Objects.requireNonNull(m76.Companion);
        Object o2 = y;
        if (y == m76$a.b) {
            final bso c = this.c;
            if (c != null && !c.a(o)) {
                throw new IllegalArgumentException(mag.j("Type of the key ", o, " is not supported. On Android you can only use types which can be stored inside the Bundle.").toString());
            }
            o2 = new yro.yro$d(this, o);
            h.p(o2);
        }
        h.O();
        final yro.yro$d yro$d = (yro.yro$d)o2;
        se6.a(new oll[] { dso.a.b((Object)yro$d.c) }, (gub)gub, h, (n & 0x70) | 0x8);
        jgw.c((Object)oyv.a, (rtb)new yro$e(this, o, yro$d), h);
        h.O();
        h.w();
        h.O();
        final vwo k = h.k();
        if (k != null) {
            k.a((gub)new yro$f(this, o, (gub)gub, n));
        }
    }
}
