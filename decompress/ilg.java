import android.os.RemoteException;
import com.google.android.gms.maps.model.RuntimeRemoteException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ilg
{
    public final syz a;
    
    public ilg(final syz a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (!(o instanceof ilg)) {
            return false;
        }
        try {
            return this.a.r1(((ilg)o).a);
        }
        catch (final RemoteException ex) {
            throw new RuntimeRemoteException(ex);
        }
    }
    
    @Override
    public final int hashCode() {
        try {
            return this.a.k();
        }
        catch (final RemoteException ex) {
            throw new RuntimeRemoteException(ex);
        }
    }
}
