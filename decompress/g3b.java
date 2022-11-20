import com.twitter.rooms.ui.spacebar.FleetlineViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class g3b extends ste implements qsb<tmi, fzv>
{
    public final FleetlineViewModel D0;
    public final wc6 E0;
    
    public g3b(final FleetlineViewModel d0, final wc6 e0) {
        this.D0 = d0;
        this.E0 = e0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final tmi tmi = (tmi)o;
        final FleetlineViewModel d0 = this.D0;
        d0.O0 = true;
        if (d0.N0) {
            this.E0.a(d0.P0.a());
        }
        return fzv.a;
    }
}
