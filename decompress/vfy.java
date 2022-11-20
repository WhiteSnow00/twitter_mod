import android.os.RemoteException;
import java.util.Objects;
import android.os.Parcel;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class vfy extends why implements mfy
{
    public vfy() {
        super("com.google.android.gms.maps.internal.IOnMarkerClickListener");
    }
    
    public final boolean s(int n, final Parcel parcel, final Parcel parcel2) throws RemoteException {
        if (n == 1) {
            final syz x = czz.x(parcel.readStrongBinder());
            final v4c$c a = ((ciy)this).a;
            Objects.requireNonNull(x, "null reference");
            Objects.requireNonNull((bm3)a);
            n = ui2$f.b1;
            parcel2.writeNoException();
            n = iny.a;
            parcel2.writeInt(1);
            return true;
        }
        return false;
    }
}
