import android.os.Parcelable;
import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qoz extends sd
{
    public static final Parcelable$Creator<qoz> CREATOR;
    public final cyz[] F0;
    public final r2z G0;
    public final r2z H0;
    public final r2z I0;
    public final String J0;
    public final float K0;
    public final String L0;
    public final int M0;
    public final boolean N0;
    public final int O0;
    public final int P0;
    
    static {
        CREATOR = (Parcelable$Creator)new mrz();
    }
    
    public qoz(final cyz[] f0, final r2z g0, final r2z h0, final r2z i0, final String j0, final float k0, final String l0, final int m0, final boolean n0, final int o0, final int p11) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
        this.K0 = k0;
        this.L0 = l0;
        this.M0 = m0;
        this.N0 = n0;
        this.O0 = o0;
        this.P0 = p11;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int x1 = xd.x1(parcel, 20293);
        xd.v1(parcel, 2, (Parcelable[])this.F0, n);
        xd.r1(parcel, 3, (Parcelable)this.G0, n);
        xd.r1(parcel, 4, (Parcelable)this.H0, n);
        xd.r1(parcel, 5, (Parcelable)this.I0, n);
        xd.s1(parcel, 6, this.J0);
        xd.k1(parcel, 7, this.K0);
        xd.s1(parcel, 8, this.L0);
        xd.n1(parcel, 9, this.M0);
        xd.e1(parcel, 10, this.N0);
        xd.n1(parcel, 11, this.O0);
        xd.n1(parcel, 12, this.P0);
        xd.B1(parcel, x1);
    }
}
