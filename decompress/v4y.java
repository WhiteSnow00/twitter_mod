import java.util.ArrayList;
import java.util.List;
import com.google.android.gms.common.api.Scope;
import android.accounts.Account;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class v4y implements Parcelable$Creator<GoogleSignInOptions>
{
    public final Object createFromParcel(final Parcel parcel) {
        final int w = SafeParcelReader.w(parcel);
        List<k6c> i = null;
        ArrayList<Object> j = null;
        String e;
        Object o = e = null;
        String e3;
        String e2 = e3 = e;
        int r = 0;
        boolean k = false;
        boolean l = false;
        boolean m = false;
        while (parcel.dataPosition() < w) {
            final int int1 = parcel.readInt();
            switch ((char)int1) {
                default: {
                    SafeParcelReader.v(parcel, int1);
                    continue;
                }
                case '\n': {
                    e3 = SafeParcelReader.e(parcel, int1);
                    continue;
                }
                case '\t': {
                    i = SafeParcelReader.i(parcel, int1, k6c.CREATOR);
                    continue;
                }
                case '\b': {
                    e2 = SafeParcelReader.e(parcel, int1);
                    continue;
                }
                case '\u0007': {
                    e = SafeParcelReader.e(parcel, int1);
                    continue;
                }
                case '\u0006': {
                    m = SafeParcelReader.k(parcel, int1);
                    continue;
                }
                case '\u0005': {
                    l = SafeParcelReader.k(parcel, int1);
                    continue;
                }
                case '\u0004': {
                    k = SafeParcelReader.k(parcel, int1);
                    continue;
                }
                case '\u0003': {
                    o = SafeParcelReader.d(parcel, int1, (android.os.Parcelable$Creator<Account>)Account.CREATOR);
                    continue;
                }
                case '\u0002': {
                    j = SafeParcelReader.i(parcel, int1, (android.os.Parcelable$Creator<Object>)Scope.CREATOR);
                    continue;
                }
                case '\u0001': {
                    r = SafeParcelReader.r(parcel, int1);
                    continue;
                }
            }
        }
        SafeParcelReader.j(parcel, w);
        return new GoogleSignInOptions(r, (ArrayList)j, (Account)o, k, l, m, e, e2, GoogleSignInOptions.t((List)i), e3);
    }
    
    public final Object[] newArray(final int n) {
        return new GoogleSignInOptions[n];
    }
}
