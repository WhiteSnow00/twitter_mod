import android.os.Parcelable;
import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class xg6 extends rd
{
    public static final Parcelable$Creator<xg6> CREATOR;
    public final kko D0;
    public final boolean E0;
    public final boolean F0;
    public final int[] G0;
    public final int H0;
    public final int[] I0;
    
    static {
        CREATOR = (Parcelable$Creator)new knz();
    }
    
    public xg6(final kko d0, final boolean e0, final boolean f0, final int[] g0, final int h0, final int[] i0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int d1 = fli.d1(parcel, 20293);
        fli.X0(parcel, 1, (Parcelable)this.D0, n);
        fli.K0(parcel, 2, this.E0);
        fli.K0(parcel, 3, this.F0);
        fli.U0(parcel, 4, this.G0);
        fli.T0(parcel, 5, this.H0);
        fli.U0(parcel, 6, this.I0);
        fli.g1(parcel, d1);
    }
}
