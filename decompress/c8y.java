import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class c8y implements Parcelable$Creator<dto>
{
    public final Object createFromParcel(final Parcel parcel) {
        final int w = SafeParcelReader.w(parcel);
        i7q i7q = null;
        String e = null;
        while (parcel.dataPosition() < w) {
            final int int1 = parcel.readInt();
            final char c = (char)int1;
            if (c != '\u0001') {
                if (c != '\u0002') {
                    SafeParcelReader.v(parcel, int1);
                }
                else {
                    e = SafeParcelReader.e(parcel, int1);
                }
            }
            else {
                i7q = SafeParcelReader.d(parcel, int1, (android.os.Parcelable$Creator<i7q>)i7q.CREATOR);
            }
        }
        SafeParcelReader.j(parcel, w);
        return new dto(i7q, e);
    }
    
    public final /* bridge */ Object[] newArray(final int n) {
        return new dto[n];
    }
}
