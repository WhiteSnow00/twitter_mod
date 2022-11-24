import android.os.RemoteException;
import android.location.Location;
import android.os.Parcel;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class u100 extends piy implements l100
{
    public static final int a = 0;
    
    public u100() {
        super("com.google.android.gms.location.ILocationListener");
    }
    
    @Override
    public final boolean s(final int n, Parcel parcel) throws RemoteException {
        if (n == 1) {
            final Location location = (Location)boy.a(parcel, Location.CREATOR);
            parcel = (Parcel)this;
            synchronized (parcel) {
                ((yhy)parcel).b.a((qnf$b)new diy(location));
                return true;
            }
        }
        return false;
    }
}
