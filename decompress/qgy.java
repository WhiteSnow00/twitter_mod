import android.os.RemoteException;
import java.util.Objects;
import android.os.Parcel;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class qgy extends qiy implements hgy
{
    public qgy() {
        super("com.google.android.gms.maps.internal.IOnMarkerClickListener");
    }
    
    public final boolean s(int n, final Parcel parcel, final Parcel parcel2) throws RemoteException {
        if (n == 1) {
            final szz x = c000.x(parcel.readStrongBinder());
            final x5c$c a = ((wiy)this).a;
            Objects.requireNonNull(x, "null reference");
            Objects.requireNonNull((lb0)a);
            n = kj2$f.d1;
            parcel2.writeNoException();
            n = coy.a;
            parcel2.writeInt(1);
            return true;
        }
        return false;
    }
}
