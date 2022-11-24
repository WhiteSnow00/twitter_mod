import android.os.Bundle;
import android.os.RemoteException;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class try extends uwy
{
    public final String J0;
    public final String K0;
    public final yny L0;
    public final jzy M0;
    
    public try(final jzy m0, final String j0, final String k0, final yny l0) {
        this.M0 = m0;
        this.J0 = j0;
        this.K0 = k0;
        this.L0 = l0;
        super(m0, true);
    }
    
    @Override
    public final void a() throws RemoteException {
        final npy f = this.M0.f;
        Objects.requireNonNull(f, "null reference");
        f.getConditionalUserProperties(this.J0, this.K0, (aqy)this.L0);
    }
    
    @Override
    public final void b() {
        this.L0.m(null);
    }
}
