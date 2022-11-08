import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pfs extends gue implements gub<m76, Integer, oyv>
{
    public final /* synthetic */ luh<mcq> C0;
    public final /* synthetic */ urj D0;
    public final /* synthetic */ gub<m76, Integer, oyv> E0;
    public final /* synthetic */ int F0;
    
    public pfs(final luh<mcq> c0, final urj d0, final gub<? super m76, ? super Integer, oyv> e0, final int f0) {
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = (gub<m76, Integer, oyv>)e0;
        this.F0 = f0;
        super(2);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final m76 m76 = (m76)o;
        if ((((Number)o2).intValue() & 0xB) == 0x2 && m76.i()) {
            m76.H();
        }
        else {
            final ea6$b a = ea6.a;
            final jkh z = rqu.z((jkh)jkh.Companion, (Object)"border");
            final long a2 = this.C0.getValue().a;
            final urj d0 = this.D0;
            final float a3 = opj.a;
            zzd.f((Object)z, "$this$outlineCutout");
            zzd.f((Object)d0, "paddingValues");
            final jkh c = gd9.c(z, (rtb)new ppj(a2, d0));
            final gub<m76, Integer, oyv> e0 = this.E0;
            final int f0 = this.F0;
            m76.x(733328855);
            Objects.requireNonNull(dx.Companion);
            final gqg d2 = ib2.d((dx)dx$a.b, true, m76);
            m76.x(-1323940314);
            final dp8 dp8 = (dp8)m76.m((re6)te6.e);
            final tve tve = (tve)m76.m((re6)te6.k);
            final z5x z5x = (z5x)m76.m((re6)te6.o);
            Objects.requireNonNull(f76.Companion);
            final jwe$a b = f76.a.b;
            final jub a4 = cwe.a(c);
            if (!(m76.j() instanceof xr0)) {
                ukg.l0();
                throw null;
            }
            m76.E();
            if (m76.f()) {
                m76.A((otb)b);
            }
            else {
                m76.o();
            }
            m76.F();
            r9x.v(m76, (Object)d2, (gub)f76.a.e);
            r9x.v(m76, (Object)dp8, (gub)f76.a.d);
            r9x.v(m76, (Object)tve, (gub)f76.a.f);
            ((j36)a4).h0((Object)hvl.b(m76, z5x, f76.a.g, m76), (Object)m76, (Object)0);
            nh.y(m76, 2058660585, -2137368960, 1029492925);
            if (e0 != null) {
                e0.invoke((Object)m76, (Object)(f0 >> 12 & 0xE));
            }
            m76.O();
            m76.O();
            m76.O();
            m76.r();
            m76.O();
            m76.O();
        }
        return oyv.a;
    }
}
