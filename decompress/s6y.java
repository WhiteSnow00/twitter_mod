import android.os.RemoteException;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.api.Status;
import android.os.Parcel;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class s6y extends i7y
{
    public s6y() {
        super("com.google.android.gms.auth.api.identity.internal.ISavePasswordCallback");
    }
    
    public final boolean s(final int n, final Parcel parcel, final Parcel parcel2) throws RemoteException {
        if (n == 1) {
            p4j.Q((Status)n7y.a(parcel, (android.os.Parcelable$Creator<Status>)Status.CREATOR), (Object)n7y.a(parcel, eto.CREATOR), ((v6y)this).a);
            return true;
        }
        return false;
    }
}
