import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lgp extends pue implements stb<ptb<? extends kgj>, dlh>
{
    public final rp8 F0;
    public final fvh<nud> G0;
    
    public lgp(final rp8 f0, final fvh<nud> g0) {
        this.F0 = f0;
        this.G0 = g0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final ptb ptb = (ptb)o;
        e0e.f((Object)ptb, "center");
        final dlh.a companion = dlh.Companion;
        Objects.requireNonNull(bgg.Companion);
        return agg.b((dlh)companion, (stb)new jgp(ptb), bgg.h, (stb)new kgp(this.F0, this.G0));
    }
}
