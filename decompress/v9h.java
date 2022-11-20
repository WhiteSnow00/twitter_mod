import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class v9h extends rd
{
    public static final Parcelable$Creator<v9h> CREATOR;
    public final int D0;
    public final int E0;
    public final int F0;
    public final long G0;
    public final long H0;
    public final String I0;
    public final String J0;
    public final int K0;
    public final int L0;
    
    static {
        CREATOR = (Parcelable$Creator)new a5y();
    }
    
    public v9h(final int d0, final int e0, final int f0, final long g0, final long h0, final String i0, final String j0, final int k0, final int l0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
        this.K0 = k0;
        this.L0 = l0;
    }
    
    public final void writeToParcel(final Parcel parcel, int d1) {
        d1 = fli.d1(parcel, 20293);
        fli.T0(parcel, 1, this.D0);
        fli.T0(parcel, 2, this.E0);
        fli.T0(parcel, 3, this.F0);
        fli.W0(parcel, 4, this.G0);
        fli.W0(parcel, 5, this.H0);
        fli.Y0(parcel, 6, this.I0);
        fli.Y0(parcel, 7, this.J0);
        fli.T0(parcel, 8, this.K0);
        fli.T0(parcel, 9, this.L0);
        fli.g1(parcel, d1);
    }
}
