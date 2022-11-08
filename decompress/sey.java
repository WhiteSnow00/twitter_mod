import android.os.RemoteException;
import android.os.Parcel;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class sey extends ehy implements key
{
    public sey() {
        super("com.google.android.gms.location.internal.ISettingsCallbacks");
    }
    
    public final boolean s(final int n, final Parcel parcel) throws RemoteException {
        if (n == 1) {
            final y6g y6g = (y6g)rmy.a(parcel, y6g.CREATOR);
            final xiy xiy = (xiy)this;
            xiy.a.a((Object)y6g);
            xiy.a = null;
            return true;
        }
        return false;
    }
}
