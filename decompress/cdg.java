import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class cdg extends bdg implements wqg
{
    public final qni L0;
    public final gdg M0;
    public long N0;
    public Map<fx, Integer> O0;
    public final edg P0;
    public arg Q0;
    public final Map<fx, Integer> R0;
    
    public cdg(final qni l0, final gdg m0) {
        e0e.f((Object)l0, "coordinator");
        e0e.f((Object)m0, "lookaheadScope");
        this.L0 = l0;
        this.M0 = m0;
        Objects.requireNonNull(hud.Companion);
        this.N0 = hud.b;
        this.P0 = new edg(this);
        this.R0 = new LinkedHashMap();
    }
    
    public static final void U0(final cdg cdg, final arg q0) {
        Objects.requireNonNull(cdg);
        vzv a;
        if (q0 != null) {
            ((khk)cdg).I0(shw.f(q0.getWidth(), q0.getHeight()));
            a = vzv.a;
        }
        else {
            a = null;
        }
        if (a == null) {
            Objects.requireNonNull(nud.Companion);
            ((khk)cdg).I0(0L);
        }
        if (!e0e.a((Object)cdg.Q0, (Object)q0) && q0 != null) {
            final LinkedHashMap o0 = cdg.O0;
            if (((o0 != null && !o0.isEmpty()) || (q0.d().isEmpty() ^ true)) && !e0e.a((Object)q0.d(), (Object)cdg.O0)) {
                ((lx)((ywe$a)cdg.V0()).P0).g();
                LinkedHashMap o2;
                if ((o2 = cdg.O0) == null) {
                    o2 = new LinkedHashMap();
                    cdg.O0 = o2;
                }
                o2.clear();
                o2.putAll(q0.d());
            }
        }
        cdg.Q0 = q0;
    }
    
    public final void G0(final long n0, final float n2, final stb<? super q8c, vzv> stb) {
        if (!hud.b(this.N0, n0)) {
            this.N0 = n0;
            final ywe$a l = this.L0.L0.h1.l;
            if (l != null) {
                l.M0();
            }
            this.S0(this.L0);
        }
        if (super.J0) {
            return;
        }
        this.W0();
    }
    
    public int H(final int n) {
        final qni m0 = this.L0.M0;
        e0e.c((Object)m0);
        final cdg u0 = m0.U0;
        e0e.c((Object)u0);
        return u0.H(n);
    }
    
    public int K(final int n) {
        final qni m0 = this.L0.M0;
        e0e.c((Object)m0);
        final cdg u0 = m0.U0;
        e0e.c((Object)u0);
        return u0.K(n);
    }
    
    public final bdg L0() {
        final qni m0 = this.L0.M0;
        cdg u0;
        if (m0 != null) {
            u0 = m0.U0;
        }
        else {
            u0 = null;
        }
        return u0;
    }
    
    public final bwe M0() {
        return (bwe)this.P0;
    }
    
    public final boolean N0() {
        return this.Q0 != null;
    }
    
    public final swe O0() {
        return this.L0.L0;
    }
    
    public final arg P0() {
        final arg q0 = this.Q0;
        if (q0 != null) {
            return q0;
        }
        throw new IllegalStateException("LookaheadDelegate has not been measured yet when measureResult is requested.".toString());
    }
    
    public final bdg Q0() {
        final qni n0 = this.L0.N0;
        cdg u0;
        if (n0 != null) {
            u0 = n0.U0;
        }
        else {
            u0 = null;
        }
        return u0;
    }
    
    public final long R0() {
        return this.N0;
    }
    
    public final void T0() {
        this.G0(this.N0, 0.0f, null);
    }
    
    public final mx V0() {
        final ywe$a l = this.L0.L0.h1.l;
        e0e.c((Object)l);
        return (mx)l;
    }
    
    public void W0() {
        final khk$a.a companion = khk$a.Companion;
        final int width = this.P0().getWidth();
        final cwe v0 = this.L0.L0.V0;
        final bwe c = khk$a.c;
        Objects.requireNonNull(companion);
        final int b = khk$a.b;
        Objects.requireNonNull(companion);
        final cwe a = khk$a.a;
        final ywe d = khk$a.d;
        khk$a.b = width;
        khk$a.a = v0;
        final boolean n = khk.khk$a.a.n(companion, this);
        this.P0().c();
        super.K0 = n;
        khk$a.b = b;
        khk$a.a = a;
        khk$a.c = c;
        khk$a.d = d;
    }
    
    public int e(final int n) {
        final qni m0 = this.L0.M0;
        e0e.c((Object)m0);
        final cdg u0 = m0.U0;
        e0e.c((Object)u0);
        return u0.e(n);
    }
    
    public final float getDensity() {
        return this.L0.getDensity();
    }
    
    public final cwe getLayoutDirection() {
        return this.L0.L0.V0;
    }
    
    public final Object m() {
        return this.L0.m();
    }
    
    public final float p0() {
        return this.L0.p0();
    }
    
    public int x(final int n) {
        final qni m0 = this.L0.M0;
        e0e.c((Object)m0);
        final cdg u0 = m0.U0;
        e0e.c((Object)u0);
        return u0.x(n);
    }
}
