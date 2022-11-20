import android.os.RemoteException;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import android.os.Parcel;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class rzz extends vhy implements gzz
{
    public static final int a = 0;
    
    public final boolean s(final int n, final Parcel parcel) throws RemoteException {
        if (n == 1) {
            final LocationResult locationResult = (LocationResult)hny.a(parcel, LocationResult.CREATOR);
            throw null;
        }
        if (n != 2) {
            return false;
        }
        final LocationAvailability locationAvailability = (LocationAvailability)hny.a(parcel, LocationAvailability.CREATOR);
        throw null;
    }
}
