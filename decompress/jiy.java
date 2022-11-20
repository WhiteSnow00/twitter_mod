import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jiy implements Parcelable$Creator<psy>
{
    public final /* bridge */ Object createFromParcel(final Parcel parcel) {
        return new psy(parcel.readStrongBinder());
    }
    
    public final /* bridge */ Object[] newArray(final int n) {
        return new psy[n];
    }
}
