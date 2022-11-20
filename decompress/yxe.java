import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yxe extends ste implements itb<Integer, Integer, qsb<? super wgk$a, ? extends fzv>, gqg>
{
    public final yze D0;
    public final long E0;
    public final int F0;
    public final int G0;
    
    public yxe(final yze d0, final long e0, final int f0, final int g0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        super(3);
    }
    
    public final Object h0(final Object o, final Object o2, final Object o3) {
        final int intValue = ((Number)o).intValue();
        final int intValue2 = ((Number)o2).intValue();
        final qsb qsb = (qsb)o3;
        czd.f((Object)qsb, "placement");
        return ((iqg)this.D0).J(uoz.u(this.E0, intValue + this.F0), uoz.t(this.E0, intValue2 + this.G0), (Map)k2a.D0, qsb);
    }
}
