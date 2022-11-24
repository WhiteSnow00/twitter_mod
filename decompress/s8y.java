import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class s8y implements Parcelable$Creator<r8y>
{
    public final Object createFromParcel(final Parcel parcel) {
        final int w = SafeParcelReader.w(parcel);
        Credential credential = null;
        while (parcel.dataPosition() < w) {
            final int int1 = parcel.readInt();
            if ((char)int1 != '\u0001') {
                SafeParcelReader.v(parcel, int1);
            }
            else {
                credential = SafeParcelReader.d(parcel, int1, (android.os.Parcelable$Creator<Credential>)Credential.CREATOR);
            }
        }
        SafeParcelReader.j(parcel, w);
        return new r8y(credential);
    }
    
    public final /* bridge */ Object[] newArray(final int n) {
        return new r8y[n];
    }
}
