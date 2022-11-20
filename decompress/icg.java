import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class icg extends hcg implements cqg
{
    public final zmi J0;
    public final mcg K0;
    public long L0;
    public Map<fx, Integer> M0;
    public final kcg N0;
    public gqg O0;
    public final Map<fx, Integer> P0;
    
    public icg(final zmi j0, final mcg k0) {
        czd.f((Object)j0, "coordinator");
        czd.f((Object)k0, "lookaheadScope");
        this.J0 = j0;
        this.K0 = k0;
        Objects.requireNonNull(ftd.Companion);
        this.L0 = ftd.b;
        this.N0 = new kcg(this);
        this.P0 = new LinkedHashMap();
    }
    
    public static final void U0(final icg icg, final gqg o0) {
        Objects.requireNonNull(icg);
        fzv a;
        if (o0 != null) {
            ((wgk)icg).I0(rp9.t(o0.getWidth(), o0.getHeight()));
            a = fzv.a;
        }
        else {
            a = null;
        }
        if (a == null) {
            Objects.requireNonNull(ltd.Companion);
            ((wgk)icg).I0(0L);
        }
        if (!czd.a((Object)icg.O0, (Object)o0) && o0 != null) {
            final LinkedHashMap m0 = icg.M0;
            if (((m0 != null && !m0.isEmpty()) || (o0.d().isEmpty() ^ true)) && !czd.a((Object)o0.d(), (Object)icg.M0)) {
                ((kx)((bwe$a)icg.V0()).N0).g();
                LinkedHashMap m2;
                if ((m2 = icg.M0) == null) {
                    m2 = new LinkedHashMap();
                    icg.M0 = m2;
                }
                m2.clear();
                m2.putAll(o0.d());
            }
        }
        icg.O0 = o0;
    }
    
    public final void G0(final long l0, final float n, final qsb<? super o7c, fzv> qsb) {
        if (!ftd.b(this.L0, l0)) {
            this.L0 = l0;
            final bwe$a i = this.J0.J0.f1.l;
            if (i != null) {
                i.M0();
            }
            this.S0(this.J0);
        }
        if (super.H0) {
            return;
        }
        this.W0();
    }
    
    public int H(final int n) {
        final zmi k0 = this.J0.K0;
        czd.c((Object)k0);
        final icg s0 = k0.S0;
        czd.c((Object)s0);
        return s0.H(n);
    }
    
    public int K(final int n) {
        final zmi k0 = this.J0.K0;
        czd.c((Object)k0);
        final icg s0 = k0.S0;
        czd.c((Object)s0);
        return s0.K(n);
    }
    
    public final hcg L0() {
        final zmi k0 = this.J0.K0;
        icg s0;
        if (k0 != null) {
            s0 = k0.S0;
        }
        else {
            s0 = null;
        }
        return s0;
    }
    
    public final eve M0() {
        return (eve)this.N0;
    }
    
    public final boolean N0() {
        return this.O0 != null;
    }
    
    public final vve O0() {
        return this.J0.J0;
    }
    
    public final gqg P0() {
        final gqg o0 = this.O0;
        if (o0 != null) {
            return o0;
        }
        throw new IllegalStateException("LookaheadDelegate has not been measured yet when measureResult is requested.".toString());
    }
    
    public final hcg Q0() {
        final zmi l0 = this.J0.L0;
        icg s0;
        if (l0 != null) {
            s0 = l0.S0;
        }
        else {
            s0 = null;
        }
        return s0;
    }
    
    public final long R0() {
        return this.L0;
    }
    
    public final void T0() {
        this.G0(this.L0, 0.0f, null);
    }
    
    public final lx V0() {
        final bwe$a l = this.J0.J0.f1.l;
        czd.c((Object)l);
        return (lx)l;
    }
    
    public void W0() {
        final wgk$a$a companion = wgk$a.Companion;
        final int width = this.P0().getWidth();
        final fve t0 = this.J0.J0.T0;
        final eve c = wgk$a.c;
        Objects.requireNonNull(companion);
        final int b = wgk$a.b;
        Objects.requireNonNull(companion);
        final fve a = wgk$a.a;
        final bwe d = wgk$a.d;
        wgk$a.b = width;
        wgk$a.a = t0;
        final boolean n = wgk$a$a.n(companion, (hcg)this);
        this.P0().c();
        super.I0 = n;
        wgk$a.b = b;
        wgk$a.a = a;
        wgk$a.c = c;
        wgk$a.d = d;
    }
    
    public int e(final int n) {
        final zmi k0 = this.J0.K0;
        czd.c((Object)k0);
        final icg s0 = k0.S0;
        czd.c((Object)s0);
        return s0.e(n);
    }
    
    public final float getDensity() {
        return this.J0.getDensity();
    }
    
    public final fve getLayoutDirection() {
        return this.J0.J0.T0;
    }
    
    public final Object m() {
        return this.J0.m();
    }
    
    public final float p0() {
        return this.J0.p0();
    }
    
    public int x(final int n) {
        final zmi k0 = this.J0.K0;
        czd.c((Object)k0);
        final icg s0 = k0.S0;
        czd.c((Object)s0);
        return s0.x(n);
    }
}
