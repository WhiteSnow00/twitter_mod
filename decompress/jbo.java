import com.twitter.rooms.manager.RoomStateManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jbo extends pue implements stb<lrn, vzv>
{
    public final ptb<vzv> F0;
    public final lrn G0;
    public final RoomStateManager H0;
    
    public jbo(final ptb<vzv> f0, final lrn g0, final RoomStateManager h0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        e0e.f((Object)o, "it");
        this.F0.invoke();
        if (this.G0.u == mrn.F0) {
            this.H0.B1.onNext((Object)Boolean.TRUE);
        }
        return vzv.a;
    }
}
