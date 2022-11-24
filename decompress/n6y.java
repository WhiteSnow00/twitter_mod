import java.util.List;
import android.net.Uri;
import com.google.android.gms.auth.api.credentials.IdToken;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import android.os.Parcel;
import com.google.android.gms.auth.api.credentials.Credential;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class n6y implements Parcelable$Creator<Credential>
{
    public final Object createFromParcel(final Parcel parcel) {
        final int w = SafeParcelReader.w(parcel);
        String e = null;
        Object e2 = null;
        Object i;
        Object o = i = e2;
        Object e4;
        Object e3 = e4 = i;
        Object e6;
        String e5 = (String)(e6 = e4);
        while (parcel.dataPosition() < w) {
            final int int1 = parcel.readInt();
            switch ((char)int1) {
                default: {
                    SafeParcelReader.v(parcel, int1);
                    continue;
                }
                case '\n': {
                    e6 = SafeParcelReader.e(parcel, int1);
                    continue;
                }
                case '\t': {
                    e5 = SafeParcelReader.e(parcel, int1);
                    continue;
                }
                case '\u0006': {
                    e4 = SafeParcelReader.e(parcel, int1);
                    continue;
                }
                case '\u0005': {
                    e3 = SafeParcelReader.e(parcel, int1);
                    continue;
                }
                case '\u0004': {
                    i = SafeParcelReader.i(parcel, int1, (android.os.Parcelable$Creator<Object>)IdToken.CREATOR);
                    continue;
                }
                case '\u0003': {
                    o = SafeParcelReader.d(parcel, int1, (android.os.Parcelable$Creator<Uri>)Uri.CREATOR);
                    continue;
                }
                case '\u0002': {
                    e2 = SafeParcelReader.e(parcel, int1);
                    continue;
                }
                case '\u0001': {
                    e = SafeParcelReader.e(parcel, int1);
                    continue;
                }
            }
        }
        SafeParcelReader.j(parcel, w);
        return new Credential(e, (String)e2, (Uri)o, (List)i, (String)e3, (String)e4, e5, (String)e6);
    }
    
    public final /* bridge */ Object[] newArray(final int n) {
        return new Credential[n];
    }
}
