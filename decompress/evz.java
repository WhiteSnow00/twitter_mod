import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class evz extends rd
{
    public static final Parcelable$Creator<evz> CREATOR;
    public final String D0;
    
    static {
        CREATOR = (Parcelable$Creator)new rwz();
    }
    
    public evz(final String d0) {
        this.D0 = d0;
    }
    
    public final void writeToParcel(final Parcel parcel, int d1) {
        d1 = fli.d1(parcel, 20293);
        fli.Y0(parcel, 2, this.D0);
        fli.g1(parcel, d1);
    }
}
