import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class d96 extends ste implements itb<qr0<?>, qfq, qcm, fzv>
{
    public final Object D0;
    public final int E0;
    public final int F0;
    
    public d96(final Object d0, final int e0, final int f0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        super(3);
    }
    
    public final Object h0(final Object o, final Object o2, final Object o3) {
        final qr0 qr0 = (qr0)o;
        final qfq qfq = (qfq)o2;
        ed.D(qr0, "<anonymous parameter 0>", qfq, "slots", (qcm)o3, "<anonymous parameter 2>");
        if (czd.a(this.D0, qfq.L(this.E0, this.F0))) {
            final int f0 = this.F0;
            Objects.requireNonNull(x66.Companion);
            qfq.I(f0, x66$a.b);
            return fzv.a;
        }
        n96.d("Slot table is out of sync".toString());
        throw null;
    }
}
