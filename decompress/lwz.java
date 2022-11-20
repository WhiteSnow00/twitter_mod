import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lwz extends rd
{
    public static final Parcelable$Creator<lwz> CREATOR;
    public final boolean D0;
    public final String E0;
    public final int F0;
    
    static {
        CREATOR = (Parcelable$Creator)new mxz();
    }
    
    public lwz(final boolean d0, final String e0, final int n) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = oj7.p(n) - 1;
    }
    
    public final void writeToParcel(final Parcel parcel, int d1) {
        d1 = fli.d1(parcel, 20293);
        fli.K0(parcel, 1, this.D0);
        fli.Y0(parcel, 2, this.E0);
        fli.T0(parcel, 3, this.F0);
        fli.g1(parcel, d1);
    }
}
