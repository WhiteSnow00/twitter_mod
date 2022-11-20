import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class x8y extends rd
{
    public static final Parcelable$Creator<x8y> CREATOR;
    public final String D0;
    public final String E0;
    
    static {
        CREATOR = (Parcelable$Creator)new aiy();
    }
    
    public x8y(final String d0, final String e0) {
        this.D0 = d0;
        this.E0 = e0;
    }
    
    public final void writeToParcel(final Parcel parcel, int d1) {
        d1 = fli.d1(parcel, 20293);
        fli.Y0(parcel, 1, this.D0);
        fli.Y0(parcel, 2, this.E0);
        fli.g1(parcel, d1);
    }
}
