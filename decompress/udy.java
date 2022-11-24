import android.os.RemoteException;
import android.os.Parcelable$Creator;
import android.os.Parcel;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class udy extends piy implements tdy
{
    public udy() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
    }
    
    @Override
    public final boolean s(final int n, final Parcel parcel) throws RemoteException {
        if (n == 1) {
            ((hby)this).a.a((Object)((pby)boy.a(parcel, (Parcelable$Creator)pby.CREATOR)).F0);
            return true;
        }
        return false;
    }
}
