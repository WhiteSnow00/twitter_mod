import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import android.os.Parcelable$Creator;
import android.os.Parcel;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class n4y extends r2y implements u4y
{
    public n4y() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }
    
    @Override
    public final boolean V1(final int n, final Parcel parcel, final Parcel parcel2) throws RemoteException {
        switch (n) {
            default: {
                return false;
            }
            case 9: {
                final b5y b5y = (b5y)u3y.a(parcel, b5y.CREATOR);
                break;
            }
            case 8: {
                ((u4y)this).K0((n5y)u3y.a(parcel, (Parcelable$Creator)n5y.CREATOR));
                break;
            }
            case 7: {
                final Status status = (Status)u3y.a(parcel, Status.CREATOR);
                final GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount)u3y.a(parcel, GoogleSignInAccount.CREATOR);
                break;
            }
            case 6: {
                final Status status2 = (Status)u3y.a(parcel, Status.CREATOR);
                break;
            }
            case 4: {
                final Status status3 = (Status)u3y.a(parcel, Status.CREATOR);
                break;
            }
            case 3: {
                final bi6 bi6 = (bi6)u3y.a(parcel, bi6.CREATOR);
                final u1y u1y = (u1y)u3y.a(parcel, u1y.CREATOR);
                break;
            }
        }
        parcel2.writeNoException();
        return true;
    }
}
