import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kqw extends wvj
{
    public final wwj K0;
    public final wwj L0;
    public final zpw M0;
    public we6 N0;
    public final wwj O0;
    public float P0;
    public vr4 Q0;
    
    public kqw() {
        Objects.requireNonNull(aeq.Companion);
        this.K0 = (wwj)zzz.W((Object)new aeq(aeq.b));
        this.L0 = (wwj)zzz.W((Object)Boolean.FALSE);
        final zpw m0 = new zpw();
        m0.e = (ptb)new ptb<vzv>(this) {
            public final kqw F0;
            
            public final Object invoke() {
                ((cjq<Boolean>)this.F0.O0).setValue(Boolean.TRUE);
                return vzv.a;
            }
        };
        this.M0 = m0;
        this.O0 = (wwj)zzz.W((Object)Boolean.TRUE);
        this.P0 = 1.0f;
    }
    
    public final boolean b(final float p) {
        this.P0 = p;
        return true;
    }
    
    public final boolean e(final vr4 q0) {
        this.Q0 = q0;
        return true;
    }
    
    public final long h() {
        return ((cjq<aeq>)this.K0).getValue().a;
    }
    
    public final void j(final wd9 wd9) {
        e0e.f((Object)wd9, "<this>");
        final zpw m0 = this.M0;
        vr4 q0;
        if ((q0 = this.Q0) == null) {
            q0 = ((cjq<vr4>)m0.f).getValue();
        }
        if (((cjq<Boolean>)this.L0).getValue() && wd9.getLayoutDirection() == cwe.G0) {
            final long b0 = wd9.B0();
            final pd9 u0 = wd9.u0();
            final long c = u0.c();
            u0.b().p();
            u0.a().e(-1.0f, 1.0f, b0);
            m0.f(wd9, this.P0, q0);
            u0.b().c();
            u0.d(c);
        }
        else {
            m0.f(wd9, this.P0, q0);
        }
        if (((cjq<Boolean>)this.O0).getValue()) {
            ((cjq<Boolean>)this.O0).setValue(Boolean.FALSE);
        }
    }
    
    public final void k(final String i, final float g, final float h, final mub<? super Float, ? super Float, ? super d86, ? super Integer, vzv> mub, final d86 d86, final int n) {
        e0e.f((Object)i, "name");
        e0e.f((Object)mub, "content");
        final d86 h2 = d86.h(1264894527);
        final sa6$b a = sa6.a;
        final zpw m0 = this.M0;
        Objects.requireNonNull(m0);
        final a9c b = m0.b;
        Objects.requireNonNull(b);
        b.i = i;
        ((fow)b).c();
        final float g2 = m0.g;
        final int n2 = 0;
        if (g2 != g) {
            m0.g = g;
            m0.e();
        }
        int n3 = n2;
        if (m0.h == h) {
            n3 = 1;
        }
        if (n3 == 0) {
            m0.h = h;
            m0.e();
        }
        final xe6 i2 = kqe.i0(h2);
        final we6 n4 = this.N0;
        we6 a2 = null;
        Label_0193: {
            if (n4 != null) {
                a2 = n4;
                if (!n4.isDisposed()) {
                    break Label_0193;
                }
            }
            a2 = bf6.a((tr0)new ypw((fow)this.M0.b), i2);
        }
        (this.N0 = a2).f((hub<? super d86, ? super Integer, vzv>)w9y.j(-1916507005, true, new lqw(mub, this)));
        shw.b((Object)a2, (stb)new stb<h39, g39>(a2) {
            public final we6 F0;
            
            public final Object invoke(final Object o) {
                e0e.f((Object)o, "$this$DisposableEffect");
                return new jqw(this.F0);
            }
        }, h2);
        final gyo k = h2.k();
        if (k != null) {
            k.a((hub)new hub<d86, Integer, vzv>(this, i, g, h, mub, n) {
                public final kqw F0;
                public final String G0;
                public final float H0;
                public final float I0;
                public final mub<Float, Float, d86, Integer, vzv> J0;
                public final int K0;
                
                public final Object invoke(final Object o, final Object o2) {
                    final d86 d86 = (d86)o;
                    ((Number)o2).intValue();
                    this.F0.k(this.G0, this.H0, this.I0, this.J0, d86, this.K0 | 0x1);
                    return vzv.a;
                }
            });
        }
    }
}
