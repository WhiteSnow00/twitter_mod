import android.os.IBinder;
import android.app.PendingIntent;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eky implements Parcelable$Creator<aky>
{
    public final Object createFromParcel(final Parcel parcel) {
        final int w = SafeParcelReader.w(parcel);
        qjy qjy = null;
        Object o;
        Object q = o = null;
        Object q3;
        Object q2 = q3 = o;
        int r = 1;
        while (parcel.dataPosition() < w) {
            final int int1 = parcel.readInt();
            switch ((char)int1) {
                default: {
                    SafeParcelReader.v(parcel, int1);
                    continue;
                }
                case '\u0006': {
                    q3 = SafeParcelReader.q(parcel, int1);
                    continue;
                }
                case '\u0005': {
                    q2 = SafeParcelReader.q(parcel, int1);
                    continue;
                }
                case '\u0004': {
                    o = SafeParcelReader.d(parcel, int1, (android.os.Parcelable$Creator<PendingIntent>)PendingIntent.CREATOR);
                    continue;
                }
                case '\u0003': {
                    q = SafeParcelReader.q(parcel, int1);
                    continue;
                }
                case '\u0002': {
                    qjy = SafeParcelReader.d(parcel, int1, (android.os.Parcelable$Creator<qjy>)qjy.CREATOR);
                    continue;
                }
                case '\u0001': {
                    r = SafeParcelReader.r(parcel, int1);
                    continue;
                }
            }
        }
        SafeParcelReader.j(parcel, w);
        return new aky(r, qjy, (IBinder)q, (PendingIntent)o, (IBinder)q2, (IBinder)q3);
    }
    
    public final Object[] newArray(final int n) {
        return new aky[n];
    }
}
