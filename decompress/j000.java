import android.os.RemoteException;
import android.location.Location;
import android.os.Parcel;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class j000 extends ehy implements a000
{
    public j000() {
        super("com.google.android.gms.location.ILocationListener");
    }
    
    public final boolean s(final int n, Parcel parcel) throws RemoteException {
        if (n == 1) {
            final Location location = (Location)rmy.a(parcel, Location.CREATOR);
            parcel = (Parcel)this;
            synchronized (parcel) {
                ((ogy)parcel).b.a((inf$b)new tgy(location));
                return true;
            }
        }
        return false;
    }
}
