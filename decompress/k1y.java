import java.util.List;
import android.net.Uri;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class k1y implements Parcelable$Creator<GoogleSignInAccount>
{
    public final Object createFromParcel(final Parcel parcel) {
        final int w = SafeParcelReader.w(parcel);
        Object e2;
        Object e = e2 = null;
        Object e4;
        String e3 = (String)(e4 = e2);
        Object e5;
        Object o = e5 = e4;
        Object i;
        String e6 = (String)(i = e5);
        Object e8;
        Object e7 = e8 = i;
        long t = 0L;
        int r = 0;
        while (parcel.dataPosition() < w) {
            final int int1 = parcel.readInt();
            switch ((char)int1) {
                default: {
                    SafeParcelReader.v(parcel, int1);
                    continue;
                }
                case '\f': {
                    e8 = SafeParcelReader.e(parcel, int1);
                    continue;
                }
                case '\u000b': {
                    e7 = SafeParcelReader.e(parcel, int1);
                    continue;
                }
                case '\n': {
                    i = SafeParcelReader.i(parcel, int1, (Parcelable$Creator)Scope.CREATOR);
                    continue;
                }
                case '\t': {
                    e6 = SafeParcelReader.e(parcel, int1);
                    continue;
                }
                case '\b': {
                    t = SafeParcelReader.t(parcel, int1);
                    continue;
                }
                case '\u0007': {
                    e5 = SafeParcelReader.e(parcel, int1);
                    continue;
                }
                case '\u0006': {
                    o = SafeParcelReader.d(parcel, int1, Uri.CREATOR);
                    continue;
                }
                case '\u0005': {
                    e4 = SafeParcelReader.e(parcel, int1);
                    continue;
                }
                case '\u0004': {
                    e3 = SafeParcelReader.e(parcel, int1);
                    continue;
                }
                case '\u0003': {
                    e2 = SafeParcelReader.e(parcel, int1);
                    continue;
                }
                case '\u0002': {
                    e = SafeParcelReader.e(parcel, int1);
                    continue;
                }
                case '\u0001': {
                    r = SafeParcelReader.r(parcel, int1);
                    continue;
                }
            }
        }
        SafeParcelReader.j(parcel, w);
        return new GoogleSignInAccount(r, (String)e, (String)e2, e3, (String)e4, (Uri)o, (String)e5, t, e6, (List<Scope>)i, (String)e7, (String)e8);
    }
}
