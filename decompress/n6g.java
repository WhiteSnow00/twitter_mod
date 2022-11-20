import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class n6g extends rd
{
    public static final Parcelable$Creator<n6g> CREATOR;
    public final boolean D0;
    public final boolean E0;
    public final boolean F0;
    public final boolean G0;
    public final boolean H0;
    public final boolean I0;
    
    static {
        CREATOR = (Parcelable$Creator)new ocy();
    }
    
    public n6g(final boolean d0, final boolean e0, final boolean f0, final boolean g0, final boolean h0, final boolean i0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
    }
    
    public final void writeToParcel(final Parcel parcel, int d1) {
        d1 = fli.d1(parcel, 20293);
        fli.K0(parcel, 1, this.D0);
        fli.K0(parcel, 2, this.E0);
        fli.K0(parcel, 3, this.F0);
        fli.K0(parcel, 4, this.G0);
        fli.K0(parcel, 5, this.H0);
        fli.K0(parcel, 6, this.I0);
        fli.g1(parcel, d1);
    }
}
