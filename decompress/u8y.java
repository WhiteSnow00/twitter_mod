import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.Credential;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.api.Status;
import android.os.Parcel;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class u8y extends i7y implements w8y
{
    public u8y() {
        super("com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks");
    }
    
    public final boolean s(final int n, final Parcel parcel, final Parcel parcel2) throws RemoteException {
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    return false;
                }
                final Status status = n7y.a(parcel, (android.os.Parcelable$Creator<Status>)Status.CREATOR);
                parcel.readString();
                throw new UnsupportedOperationException();
            }
            else {
                this.v(n7y.a(parcel, (android.os.Parcelable$Creator<Status>)Status.CREATOR));
            }
        }
        else {
            this.H0(n7y.a(parcel, (android.os.Parcelable$Creator<Status>)Status.CREATOR), n7y.a(parcel, (android.os.Parcelable$Creator<Credential>)Credential.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
