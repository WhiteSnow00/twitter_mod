import tv.periscope.model.NarrowcastSpaceType;
import java.util.Set;
import tv.periscope.android.api.UploadTestResponse;

// 
// Decompiled by Procyon v0.6.0
// 

public final class san extends ste implements nsb<String>
{
    public final ran D0;
    public final UploadTestResponse E0;
    public final String F0;
    public final Set<String> G0;
    public final boolean H0;
    public final boolean I0;
    public final NarrowcastSpaceType J0;
    public final String K0;
    
    public san(final ran d0, final UploadTestResponse e0, final String f0, final Set<String> g0, final boolean h0, final boolean i0, final NarrowcastSpaceType j0, final String k0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
        this.K0 = k0;
        super(0);
    }
    
    public final Object invoke() {
        final String broadcast = this.D0.c.createBroadcast(this.E0.region, "audio-room", edq.Companion.b(100, 100), false, true, 0L, this.F0, 0, (String)null, (Set)this.G0, this.H0, this.I0, this.J0, this.K0);
        czd.e((Object)broadcast, "periscopeApiManager.crea\u2026yId\n                    )");
        return broadcast;
    }
}
