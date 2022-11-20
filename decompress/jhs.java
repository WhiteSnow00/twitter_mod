import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jhs
{
    public static final c Companion;
    public static final uto<jhs, Object> f;
    public final hwj a;
    public final hwj b;
    public c6m c;
    public long d;
    public final hwj e;
    
    static {
        Companion = new c();
        jhs.f = (vto.vto$c)plf.a((ftb)jhs$a.D0, (qsb)jhs$b.D0);
    }
    
    public jhs() {
        this(ooj.D0, 0.0f);
    }
    
    public jhs(final ooj ooj, final float n) {
        czd.f((Object)ooj, "initialOrientation");
        this.a = (hwj)blz.Q(n);
        this.b = (hwj)blz.Q(0.0f);
        Objects.requireNonNull(c6m.Companion);
        this.c = c6m.e;
        Objects.requireNonNull(hjs.Companion);
        this.d = hjs.b;
        this.e = (hwj)blz.P(ooj, (hiq)mlr.a);
    }
    
    public final float a() {
        return ((Number)this.b.getValue()).floatValue();
    }
    
    public final float b() {
        return ((Number)this.a.getValue()).floatValue();
    }
    
    public final ooj c() {
        return (ooj)this.e.getValue();
    }
    
    public final void d(final float n) {
        this.a.setValue((Object)n);
    }
    
    public final void e(final ooj ooj, final c6m c, int n, int n2) {
        final float n3 = (float)(n2 - n);
        this.b.setValue((Object)n3);
        float n4 = c.a;
        final c6m c2 = this.c;
        final float a = c2.a;
        final int n5 = 0;
        if (n4 == a) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        Label_0238: {
            if (n2 != 0) {
                if (c.b == c2.b) {
                    n2 = 1;
                }
                else {
                    n2 = 0;
                }
                if (n2 != 0) {
                    break Label_0238;
                }
            }
            n2 = n5;
            if (ooj == ooj.D0) {
                n2 = 1;
            }
            if (n2 != 0) {
                n4 = c.b;
            }
            float n6;
            if (n2 != 0) {
                n6 = c.d;
            }
            else {
                n6 = c.c;
            }
            final float b = this.b();
            final float n7 = (float)n;
            final float n8 = b + n7;
            float n9 = 0.0f;
            Label_0222: {
                if (n6 <= n8) {
                    n = fcmpg(n4, b);
                    if (n >= 0 || n6 - n4 <= n7) {
                        if (n < 0 && n6 - n4 <= n7) {
                            n9 = n4 - b;
                            break Label_0222;
                        }
                        n9 = 0.0f;
                        break Label_0222;
                    }
                }
                n9 = n6 - n8;
            }
            this.d(this.b() + n9);
            this.c = c;
        }
        this.d(rrz.o(this.b(), 0.0f, n3));
    }
    
    public static final class c
    {
    }
}
