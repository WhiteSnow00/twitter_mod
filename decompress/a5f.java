import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class a5f implements eo6
{
    public qv F0;
    public final s1c G0;
    public final r8p H0;
    public final nn I0;
    public final otm<qv> J0;
    public final b5f K0;
    public final sml$a$b L0;
    public final glq M0;
    
    public a5f(final Intent intent, final b5f k0, final nn i0, final otm<qv> j0, final r8p h0, final s1c g0, final glq m0) {
        final qv qv = (qv)gmp.a(intent.getByteArrayExtra("extra_advanced_filters"), (nmp)qv.f);
        final qv g2 = qv.g;
        qv f0 = qv;
        if (qv == null) {
            f0 = g2;
        }
        this.G0 = g0;
        this.K0 = k0;
        this.I0 = i0;
        this.J0 = j0;
        this.F0 = f0;
        this.H0 = h0;
        this.M0 = m0;
        this.L0 = (sml$a$b)rml.b((eo6)this, k0.F0);
    }
    
    public final vn6 c() {
        return (vn6)this.L0;
    }
}
