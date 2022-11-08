import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.api.Status;
import android.os.Parcel;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class j7y extends y5y implements l7y
{
    public j7y() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }
    
    public final boolean s(final int n, final Parcel parcel, final Parcel parcel2) throws RemoteException {
        switch (n) {
            default: {
                return false;
            }
            case 103: {
                ((l7y)this).z1((Status)d6y.a(parcel, (Parcelable$Creator)Status.CREATOR));
                break;
            }
            case 102: {
                ((l7y)this).v((Status)d6y.a(parcel, (Parcelable$Creator)Status.CREATOR));
                break;
            }
            case 101: {
                final GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount)d6y.a(parcel, (Parcelable$Creator)GoogleSignInAccount.CREATOR);
                final Status status = (Status)d6y.a(parcel, (Parcelable$Creator)Status.CREATOR);
                throw new UnsupportedOperationException();
            }
        }
        parcel2.writeNoException();
        return true;
    }
}
