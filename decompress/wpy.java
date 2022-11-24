import android.os.RemoteException;
import android.os.Bundle;
import android.os.Parcel;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class wpy extends bmy implements aqy
{
    public wpy() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }
    
    public final boolean s(final int n, final Parcel parcel, final Parcel parcel2) throws RemoteException {
        if (n == 1) {
            final Bundle bundle = (Bundle)emy.a(parcel, Bundle.CREATOR);
            emy.b(parcel);
            ((yny)this).m(bundle);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
