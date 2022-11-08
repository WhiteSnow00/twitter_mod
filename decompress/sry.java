import android.os.RemoteException;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class sry extends jvy
{
    public final /* synthetic */ String G0;
    public final /* synthetic */ wxy H0;
    
    public sry(final wxy h0, final String g0) {
        this.H0 = h0;
        this.G0 = g0;
        super(h0, true);
    }
    
    @Override
    public final void a() throws RemoteException {
        final doy f = this.H0.f;
        Objects.requireNonNull(f, "null reference");
        f.endAdUnitExposure(this.G0, super.D0);
    }
}
