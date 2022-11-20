import android.net.Uri;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class o7y implements Parcelable$Creator<k6q>
{
    public final Object createFromParcel(final Parcel parcel) {
        final int w = SafeParcelReader.w(parcel);
        String e = null;
        Object e3;
        Object e2 = e3 = null;
        Object o;
        String e4 = (String)(o = e3);
        Object e6;
        Object e5 = e6 = o;
        while (parcel.dataPosition() < w) {
            final int int1 = parcel.readInt();
            switch ((char)int1) {
                default: {
                    SafeParcelReader.v(parcel, int1);
                    continue;
                }
                case '\u0007': {
                    e6 = SafeParcelReader.e(parcel, int1);
                    continue;
                }
                case '\u0006': {
                    e5 = SafeParcelReader.e(parcel, int1);
                    continue;
                }
                case '\u0005': {
                    o = SafeParcelReader.d(parcel, int1, (android.os.Parcelable$Creator<Uri>)Uri.CREATOR);
                    continue;
                }
                case '\u0004': {
                    e4 = SafeParcelReader.e(parcel, int1);
                    continue;
                }
                case '\u0003': {
                    e3 = SafeParcelReader.e(parcel, int1);
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
        return new k6q(e, (String)e2, (String)e3, e4, (Uri)o, (String)e5, (String)e6);
    }
    
    public final /* bridge */ Object[] newArray(final int n) {
        return new k6q[n];
    }
}
