import android.os.RemoteException;
import java.util.Objects;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class sqy extends jvy
{
    public final /* synthetic */ Activity G0;
    public final /* synthetic */ String H0;
    public final /* synthetic */ String I0;
    public final /* synthetic */ wxy J0;
    
    public sqy(final wxy j0, final Activity g0, final String h0, final String i0) {
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
        f.setCurrentScreen((g3d)new x4j((Object)this.G0), this.H0, this.I0, super.C0);
    }
}
