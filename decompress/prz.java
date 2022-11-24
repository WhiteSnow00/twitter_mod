import java.util.List;
import android.graphics.Rect;
import android.graphics.Point;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class prz implements Parcelable$Creator<orz>
{
    public final Object createFromParcel(final Parcel parcel) {
        final int w = SafeParcelReader.w(parcel);
        String e = null;
        Object i;
        Object o = i = null;
        Object j;
        Object e2 = j = i;
        while (parcel.dataPosition() < w) {
            final int int1 = parcel.readInt();
            final char c = (char)int1;
            if (c != '\u0001') {
                if (c != '\u0002') {
                    if (c != '\u0003') {
                        if (c != '\u0004') {
                            if (c != '\u0005') {
                                SafeParcelReader.v(parcel, int1);
                            }
                            else {
                                j = SafeParcelReader.i(parcel, int1, (android.os.Parcelable$Creator<Object>)tqz.CREATOR);
                            }
                        }
                        else {
                            e2 = SafeParcelReader.e(parcel, int1);
                        }
                    }
                    else {
                        i = SafeParcelReader.i(parcel, int1, (android.os.Parcelable$Creator<Point>)Point.CREATOR);
                    }
                }
                else {
                    o = SafeParcelReader.d(parcel, int1, (android.os.Parcelable$Creator<Rect>)Rect.CREATOR);
                }
            }
            else {
                e = SafeParcelReader.e(parcel, int1);
            }
        }
        SafeParcelReader.j(parcel, w);
        return new orz(e, (Rect)o, (List<Point>)i, (String)e2, (List<tqz>)j);
    }
    
    public final /* bridge */ Object[] newArray(final int n) {
        return new orz[n];
    }
}
