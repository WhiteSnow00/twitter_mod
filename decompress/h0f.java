// 
// Decompiled by Procyon v0.6.0
// 

public final class h0f extends gue implements gub<m76, Integer, oyv>
{
    public final /* synthetic */ i0f C0;
    public final /* synthetic */ i0f.a D0;
    
    public h0f(final i0f c0, final i0f.a d0) {
        this.C0 = c0;
        this.D0 = d0;
        super(2);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final m76 m76 = (m76)o;
        if ((((Number)o2).intValue() & 0xB) == 0x2 && m76.i()) {
            m76.H();
        }
        else {
            final ea6$b a = ea6.a;
            final j0f j0f = (j0f)this.C0.b.invoke();
            final Integer n = j0f.f().get(this.D0.a);
            int n2;
            if (n != null) {
                ((nhq)this.D0.c).setValue((Object)n.intValue());
                n2 = n.intValue();
            }
            else {
                n2 = ((Number)((nhq)this.D0.c).getValue()).intValue();
            }
            m76.x(-715770513);
            if (n2 < j0f.a()) {
                final Object g = j0f.g(n2);
                if (zzd.a(g, this.D0.a)) {
                    this.C0.a.d(g, (gub<? super m76, ? super Integer, oyv>)m8y.j(m76, -1238863364, new e0f(j0f, n2)), m76, 568);
                }
            }
            m76.O();
            final i0f.a d0 = this.D0;
            jgw.c(d0.a, (rtb)new g0f(d0), m76);
        }
        return oyv.a;
    }
}
