import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ulo
{
    public static final rlo a;
    
    static {
        final ds0 a2 = ds0.a;
        final ds0$j b = ds0.b;
        final float n = 0;
        final o67.b companion = o67.Companion;
        Objects.requireNonNull(ex.Companion);
        a = (rlo)jee.n0(1, (mtb)ulo$a.D0, n, companion.b(ex.a.k));
    }
    
    public static final fqg a(final ds0.d d, final ex.c c, final x66 x66) {
        czd.f((Object)d, "horizontalArrangement");
        x66.x(-837807694);
        final n96$b a = n96.a;
        x66.x(511388516);
        final boolean p3 = x66.P((Object)d);
        final boolean p4 = x66.P((Object)c);
        final Object y = x66.y();
        Object o = null;
        Label_0159: {
            if (!(p3 | p4)) {
                Objects.requireNonNull(x66.Companion);
                if ((o = y) != x66$a.b) {
                    break Label_0159;
                }
            }
            final ds0 a2 = ds0.a;
            Object o2 = null;
            Label_0149: {
                if (czd.a((Object)d, (Object)ds0.b)) {
                    Objects.requireNonNull(ex.Companion);
                    if (czd.a((Object)c, (Object)ex.a.k)) {
                        o2 = ulo.a;
                        break Label_0149;
                    }
                }
                o2 = jee.n0(1, (mtb)new vlo(d), d.a(), o67.Companion.b(c));
            }
            x66.p(o2);
            o = o2;
        }
        x66.O();
        final fqg fqg = (fqg)o;
        x66.O();
        return fqg;
    }
}
