import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class m3p implements qbi
{
    public final /* synthetic */ q7r<w3p> C0;
    public final /* synthetic */ boolean D0;
    
    public m3p(final q7r<w3p> c0, final boolean d0) {
        this.C0 = c0;
        this.D0 = d0;
    }
    
    public final long b(long n, final long n2, final int n3) {
        if (this.D0) {
            final w3p w3p = (w3p)this.C0.getValue();
            if (w3p.d.a()) {
                Objects.requireNonNull(qfj.Companion);
                n = qfj.b;
            }
            else {
                n = w3p.h(w3p.e(w3p.d.b(w3p.e(w3p.g(n2)))));
            }
        }
        else {
            Objects.requireNonNull(qfj.Companion);
            n = qfj.b;
        }
        return n;
    }
    
    public final Object c(long n, long d0, final ap6<? super spw> ap6) {
        Object o = null;
        Label_0059: {
            if (ap6 instanceof m3p$a) {
                final m3p$a m3p$a = (m3p$a)ap6;
                final int g0 = m3p$a.G0;
                if ((g0 & Integer.MIN_VALUE) != 0x0) {
                    m3p$a.G0 = g0 + Integer.MIN_VALUE;
                    o = m3p$a;
                    break Label_0059;
                }
            }
            o = new m3p$a(this, (ap6)ap6);
        }
        Object o2 = ((m3p$a)o).E0;
        final zy6 c0 = zy6.C0;
        final int g2 = ((m3p$a)o).G0;
        m3p c2 = null;
        Label_0217: {
            if (g2 != 0) {
                if (g2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                d0 = ((m3p$a)o).D0;
                c2 = ((m3p$a)o).C0;
                kq9.b1(o2);
            }
            else {
                kq9.b1(o2);
                if (!this.D0) {
                    Objects.requireNonNull(spw.Companion);
                    n = spw.b;
                    c2 = this;
                    break Label_0217;
                }
                final w3p w3p = (w3p)this.C0.getValue();
                ((m3p$a)o).C0 = this;
                ((m3p$a)o).D0 = d0;
                ((m3p$a)o).G0 = 1;
                o2 = w3p.b(d0, (ap6)o);
                if (o2 == c0) {
                    return c0;
                }
                c2 = this;
            }
            n = spw.d(d0, ((spw)o2).a);
        }
        final spw spw = new spw(n);
        ((w3p)c2.C0.getValue()).d(false);
        return spw;
    }
    
    public final long f(final long n, int n2) {
        Objects.requireNonNull(wbi.Companion);
        if (n2 == 2) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        if (n2 != 0) {
            ((w3p)this.C0.getValue()).d(true);
        }
        Objects.requireNonNull(qfj.Companion);
        return qfj.b;
    }
}
