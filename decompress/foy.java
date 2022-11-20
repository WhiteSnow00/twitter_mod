import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class foy extends rd
{
    public static final Parcelable$Creator<foy> CREATOR;
    public final String D0;
    public final int E0;
    
    static {
        CREATOR = (Parcelable$Creator)new bty();
    }
    
    public foy(final String d0, final int e0) {
        this.D0 = d0;
        this.E0 = e0;
    }
    
    public final void writeToParcel(final Parcel parcel, int d1) {
        d1 = fli.d1(parcel, 20293);
        fli.Y0(parcel, 1, this.D0);
        fli.T0(parcel, 2, this.E0);
        fli.g1(parcel, d1);
    }
}
