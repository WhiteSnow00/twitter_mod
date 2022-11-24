import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.api.Status;
import android.os.Parcel;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class t8y extends i7y implements v8y
{
    public t8y() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }
    
    public final boolean s(final int n, final Parcel parcel, final Parcel parcel2) throws RemoteException {
        switch (n) {
            default: {
                return false;
            }
            case 103: {
                this.z1(n7y.a(parcel, (android.os.Parcelable$Creator<Status>)Status.CREATOR));
                break;
            }
            case 102: {
                this.v(n7y.a(parcel, (android.os.Parcelable$Creator<Status>)Status.CREATOR));
                break;
            }
            case 101: {
                final GoogleSignInAccount googleSignInAccount = n7y.a(parcel, (android.os.Parcelable$Creator<GoogleSignInAccount>)GoogleSignInAccount.CREATOR);
                final Status status = n7y.a(parcel, (android.os.Parcelable$Creator<Status>)Status.CREATOR);
                throw new UnsupportedOperationException();
            }
        }
        parcel2.writeNoException();
        return true;
    }
}
