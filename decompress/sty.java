import android.os.RemoteException;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class sty extends jvy
{
    public final /* synthetic */ String G0;
    public final /* synthetic */ Object H0;
    public final /* synthetic */ wxy I0;
    
    public sty(final wxy i0, final Object h0) {
        this.I0 = i0;
        this.G0 = "Error with data collection. Data lost.";
        this.H0 = h0;
        super(i0, false);
    }
    
    @Override
    public final void a() throws RemoteException {
        final doy f = this.I0.f;
        Objects.requireNonNull(f, "null reference");
        f.logHealthData(5, this.G0, (g3d)new x4j(this.H0), (g3d)new x4j((Object)null), (g3d)new x4j((Object)null));
    }
}
