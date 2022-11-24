import android.os.RemoteException;
import java.util.Objects;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jxy extends uwy
{
    public final Activity J0;
    public final fzy K0;
    
    public jxy(final fzy k0, final Activity j0) {
        this.K0 = k0;
        this.J0 = j0;
        super(k0.F0, true);
    }
    
    @Override
    public final void a() throws RemoteException {
        final npy f = this.K0.F0.f;
        Objects.requireNonNull(f, "null reference");
        f.onActivityStarted((l3d)new p5j(this.J0), super.G0);
    }
}
