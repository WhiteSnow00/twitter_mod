import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class h8y implements Parcelable$Creator<SignInConfiguration>
{
    public final Object createFromParcel(final Parcel parcel) {
        final int w = SafeParcelReader.w(parcel);
        String e = null;
        GoogleSignInOptions googleSignInOptions = null;
        while (parcel.dataPosition() < w) {
            final int int1 = parcel.readInt();
            final char c = (char)int1;
            if (c != '\u0002') {
                if (c != '\u0005') {
                    SafeParcelReader.v(parcel, int1);
                }
                else {
                    googleSignInOptions = SafeParcelReader.d(parcel, int1, (android.os.Parcelable$Creator<GoogleSignInOptions>)GoogleSignInOptions.CREATOR);
                }
            }
            else {
                e = SafeParcelReader.e(parcel, int1);
            }
        }
        SafeParcelReader.j(parcel, w);
        return new SignInConfiguration(e, googleSignInOptions);
    }
    
    public final /* bridge */ Object[] newArray(final int n) {
        return new SignInConfiguration[n];
    }
}
