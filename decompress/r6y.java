import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.SignInAccount;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class r6y implements Parcelable$Creator<SignInAccount>
{
    public final Object createFromParcel(final Parcel parcel) {
        final int w = SafeParcelReader.w(parcel);
        String e = "";
        GoogleSignInAccount googleSignInAccount = null;
        String e2 = "";
        while (parcel.dataPosition() < w) {
            final int int1 = parcel.readInt();
            final char c = (char)int1;
            if (c != '\u0004') {
                if (c != '\u0007') {
                    if (c != '\b') {
                        SafeParcelReader.v(parcel, int1);
                    }
                    else {
                        e2 = SafeParcelReader.e(parcel, int1);
                    }
                }
                else {
                    googleSignInAccount = SafeParcelReader.d(parcel, int1, (android.os.Parcelable$Creator<GoogleSignInAccount>)GoogleSignInAccount.CREATOR);
                }
            }
            else {
                e = SafeParcelReader.e(parcel, int1);
            }
        }
        SafeParcelReader.j(parcel, w);
        return new SignInAccount(e, googleSignInAccount, e2);
    }
    
    public final /* bridge */ Object[] newArray(final int n) {
        return new SignInAccount[n];
    }
}
