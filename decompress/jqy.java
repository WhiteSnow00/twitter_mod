import android.os.Bundle;
import android.os.RemoteException;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jqy extends jvy
{
    public final /* synthetic */ String G0;
    public final /* synthetic */ String H0;
    public final /* synthetic */ omy I0;
    public final /* synthetic */ wxy J0;
    
    public jqy(final wxy j0, final String g0, final String h0, final omy i0) {
        this.J0 = j0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        super(j0, true);
    }
    
    @Override
    public final void a() throws RemoteException {
        final doy f = this.J0.f;
        Objects.requireNonNull(f, "null reference");
        f.getConditionalUserProperties(this.G0, this.H0, (roy)this.I0);
    }
    
    @Override
    public final void b() {
        this.I0.m((Bundle)null);
    }
}
