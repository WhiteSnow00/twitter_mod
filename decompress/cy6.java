import kotlin.NoWhenBranchMatchedException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cy6 extends pue implements hub<d86, Integer, vzv>
{
    public final pis F0;
    public final int G0;
    public final kks H0;
    public final bis I0;
    public final sis J0;
    public final bgx K0;
    public final dlh L0;
    public final dlh M0;
    public final dlh N0;
    public final dlh O0;
    public final oe2 P0;
    public final eis Q0;
    public final boolean R0;
    public final boolean S0;
    public final stb<qjs, vzv> T0;
    public final rp8 U0;
    
    public cy6(final pis f0, final int g0, final kks h0, final bis i0, final sis j0, final bgx k0, final dlh l0, final dlh m0, final dlh n0, final dlh o0, final oe2 p16, final eis q0, final boolean r0, final boolean s0, final stb<? super qjs, vzv> t0, final rp8 u0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
        this.K0 = k0;
        this.L0 = l0;
        this.M0 = m0;
        this.N0 = n0;
        this.O0 = o0;
        this.P0 = p16;
        this.Q0 = q0;
        this.R0 = r0;
        this.S0 = s0;
        this.T0 = (stb<qjs, vzv>)t0;
        this.U0 = u0;
        super(2);
    }
    
    public final Object invoke(Object o, final Object o2) {
        final d86 d86 = (d86)o;
        if ((((Number)o2).intValue() & 0xB) == 0x2 && d86.i()) {
            d86.H();
        }
        else {
            final sa6$b a = sa6.a;
            final dlh k = heq.k((dlh)dlh.Companion, ((cjq<s99>)this.F0.f).getValue().F0, 0.0f, 2);
            final int g0 = this.G0;
            final kks h0 = this.H0;
            e0e.f((Object)k, "<this>");
            e0e.f((Object)h0, "textStyle");
            final ysd$a a2 = ysd.a;
            final dlh a3 = c86.a(k, (stb<? super btd, vzv>)ysd.a, (kub<? super dlh, ? super d86, ? super Integer, ? extends dlh>)new cpg(g0, h0));
            final bis i0 = this.I0;
            final sis j0 = this.J0;
            final bgx k2 = this.K0;
            final by6 by6 = new by6(this.F0);
            e0e.f((Object)a3, "<this>");
            e0e.f((Object)i0, "scrollerPosition");
            e0e.f((Object)j0, "textFieldValue");
            e0e.f((Object)k2, "visualTransformation");
            final dpj c = i0.c();
            final long b = j0.b;
            final zjs.a companion = zjs.Companion;
            int n = (int)(b >> 32);
            if (n == (int)(i0.d >> 32)) {
                if (zjs.d(b) != zjs.d(i0.d)) {
                    n = zjs.d(b);
                }
                else {
                    n = zjs.g(b);
                }
            }
            i0.d = j0.b;
            final vzt a4 = sow.a(k2, j0.a);
            final int ordinal = ((Enum)c).ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                o = new tqc(i0, n, a4, (ptb)by6);
            }
            else {
                o = new duw(i0, n, a4, (ptb<rjs>)by6);
            }
            final dlh e = iuk.J(a3).E((dlh)o).E(this.L0).E(this.M0);
            final kks h2 = this.H0;
            e0e.f((Object)e, "<this>");
            e0e.f((Object)h2, "style");
            w9q.a(se2.a(c86.b(e, (kub)new ois(h2)).E(this.N0).E(this.O0), this.P0), (hub<? super d86, ? super Integer, vzv>)w9y.i(d86, 19580180, new ay6(this.Q0, this.F0, this.R0, this.S0, (stb)this.T0, this.U0, this.G0)), d86, 48, 0);
        }
        return vzv.a;
    }
}
