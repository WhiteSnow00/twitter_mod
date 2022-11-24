import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cpg extends pue implements kub<dlh, d86, Integer, dlh>
{
    public final int F0;
    public final kks G0;
    
    public cpg(final int f0, final kks g0) {
        this.F0 = f0;
        this.G0 = g0;
        super(3);
    }
    
    public final Object h0(Object o, Object o2, final Object o3) {
        final dlh dlh = (dlh)o;
        final d86 d86 = (d86)o2;
        lf.L((Number)o3, dlh, "$this$composed", d86, -1027014173);
        final sa6$b a = sa6.a;
        final int f0 = this.F0;
        final int n = 0;
        if (f0 > 0) {
            Object o4;
            if (f0 == Integer.MAX_VALUE) {
                o4 = dlh.Companion;
                d86.O();
            }
            else {
                final rp8 rp8 = (rp8)d86.m((df6)ff6.e);
                final qkb$b qkb$b = (qkb$b)d86.m((df6)ff6.h);
                final cwe cwe = (cwe)d86.m((df6)ff6.k);
                final kks g0 = this.G0;
                d86.x(511388516);
                final boolean p3 = d86.P((Object)g0);
                final boolean p4 = d86.P((Object)cwe);
                o2 = d86.y();
                Label_0207: {
                    if (!(p3 | p4)) {
                        Objects.requireNonNull(d86.Companion);
                        if ((o = o2) != d86$a.b) {
                            break Label_0207;
                        }
                    }
                    o = ix.E(g0, cwe);
                    d86.p(o);
                }
                d86.O();
                final kks kks = (kks)o;
                d86.x(511388516);
                final boolean p5 = d86.P((Object)qkb$b);
                final boolean p6 = d86.P((Object)kks);
                o2 = d86.y();
                Label_0404: {
                    if (!(p5 | p6)) {
                        Objects.requireNonNull(d86.Companion);
                        if ((o = o2) != d86$a.b) {
                            break Label_0404;
                        }
                    }
                    final f1r a2 = kks.a;
                    final qkb f2 = a2.f;
                    qlb qlb;
                    if ((qlb = a2.c) == null) {
                        Objects.requireNonNull(qlb.Companion);
                        qlb = qlb.M0;
                    }
                    final mlb d87 = kks.a.d;
                    int a3;
                    if (d87 != null) {
                        a3 = d87.a;
                    }
                    else {
                        Objects.requireNonNull(mlb.Companion);
                        a3 = 0;
                    }
                    final nlb e = kks.a.e;
                    int a4;
                    if (e != null) {
                        a4 = e.a;
                    }
                    else {
                        Objects.requireNonNull(nlb.Companion);
                        a4 = 1;
                    }
                    o = qkb$b.a(f2, qlb, a3, a4);
                    d86.p(o);
                }
                d86.O();
                final l9r l9r = (l9r)o;
                final kks g2 = this.G0;
                o2 = l9r.getValue();
                d86.x(-568225417);
                int i = 0;
                boolean b = false;
                while (i < 5) {
                    b |= d86.P((new Object[] { rp8, qkb$b, g2, cwe, o2 })[i]);
                    ++i;
                }
                o2 = d86.y();
                Label_0554: {
                    if (!b) {
                        Objects.requireNonNull(d86.Companion);
                        if ((o = o2) != d86$a.b) {
                            break Label_0554;
                        }
                    }
                    o = nud.b(ugs.a(kks, rp8, qkb$b, ugs.a, 1));
                    d86.p(o);
                }
                d86.O();
                final int intValue = ((Number)o).intValue();
                final kks g3 = this.G0;
                o2 = l9r.getValue();
                d86.x(-568225417);
                boolean b2 = false;
                for (int j = n; j < 5; ++j) {
                    b2 |= d86.P((new Object[] { rp8, qkb$b, g3, cwe, o2 })[j]);
                }
                o2 = d86.y();
                Label_0740: {
                    if (!b2) {
                        Objects.requireNonNull(d86.Companion);
                        if ((o = o2) != d86$a.b) {
                            break Label_0740;
                        }
                    }
                    o = new StringBuilder();
                    final String a5 = ugs.a;
                    ((StringBuilder)o).append(a5);
                    ((StringBuilder)o).append('\n');
                    ((StringBuilder)o).append(a5);
                    o = nud.b(ugs.a(kks, rp8, qkb$b, ((StringBuilder)o).toString(), 2));
                    d86.p(o);
                }
                d86.O();
                o4 = heq.k((dlh)dlh.Companion, 0.0f, rp8.m0((this.F0 - 1) * (((Number)o).intValue() - intValue) + intValue), 1);
                final sa6$b a6 = sa6.a;
                d86.O();
            }
            return o4;
        }
        throw new IllegalArgumentException("maxLines must be greater than 0".toString());
    }
}
