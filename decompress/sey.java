import android.os.RemoteException;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.Objects;
import android.os.Parcel;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class sey extends qiy implements jey
{
    public sey() {
        super("com.google.android.gms.maps.internal.IOnMapLoadedCallback");
    }
    
    public final boolean s(final int n, final Parcel parcel, final Parcel parcel2) throws RemoteException {
        if (n == 1) {
            final ff8 ff8 = (ff8)((dlz)this).a;
            final wjk wjk = (wjk)ff8.F0;
            final x5c x5c = (x5c)ff8.G0;
            final clg$a clg$a = (clg$a)ff8.H0;
            Objects.requireNonNull(wjk);
            final nea nea = new nea(wjk, clg$a, 5);
            Objects.requireNonNull(x5c);
            try {
                x5c.a.D((umy)new eyz((x5c$d)nea), (l3d)null);
                parcel2.writeNoException();
                return true;
            }
            catch (final RemoteException ex) {
                throw new RuntimeRemoteException(ex);
            }
        }
        return false;
    }
}
