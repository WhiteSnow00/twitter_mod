import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ygs extends ste implements itb<okh, x66, Integer, okh>
{
    public final xhs D0;
    public final mhs E0;
    public final ais F0;
    public final boolean G0;
    public final boolean H0;
    public final zfj I0;
    public final gtv J0;
    public final qsb<ais, fzv> K0;
    
    public ygs(final xhs d0, final mhs e0, final ais f0, final boolean g0, final boolean h0, final zfj i0, final gtv j0, final qsb<? super ais, fzv> k0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
        this.K0 = (qsb<ais, fzv>)k0;
        super(3);
    }
    
    public final Object h0(Object o, Object y, final Object o2) {
        final okh okh = (okh)o;
        final x66 x66 = (x66)y;
        ua.y((Number)o2, okh, "$this$composed", x66, 58482146);
        final n96$b a = n96.a;
        x66.x(-492369756);
        y = x66.y();
        Objects.requireNonNull(x66.Companion);
        o = y;
        if (y == x66$a.b) {
            o = new gjs();
            x66.p(o);
        }
        x66.O();
        final okh a2 = rpe.a((okh)okh.Companion, (qsb<? super kpe, Boolean>)new xgs((Object)new wgs(this.D0, this.E0, this.F0, this.G0, this.H0, (gjs)o, this.I0, this.J0, (qsb)this.K0)));
        x66.O();
        return a2;
    }
}
