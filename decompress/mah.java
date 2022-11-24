import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mah extends sd
{
    public static final Parcelable$Creator<mah> CREATOR;
    public final int F0;
    public final int G0;
    public final int H0;
    public final long I0;
    public final long J0;
    public final String K0;
    public final String L0;
    public final int M0;
    public final int N0;
    
    static {
        CREATOR = (Parcelable$Creator)new u5y();
    }
    
    public mah(final int f0, final int g0, final int h0, final long i0, final long j0, final String k0, final String l0, final int m0, final int n0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
        this.K0 = k0;
        this.L0 = l0;
        this.M0 = m0;
        this.N0 = n0;
    }
    
    public final void writeToParcel(final Parcel parcel, int x1) {
        x1 = xd.x1(parcel, 20293);
        xd.n1(parcel, 1, this.F0);
        xd.n1(parcel, 2, this.G0);
        xd.n1(parcel, 3, this.H0);
        xd.q1(parcel, 4, this.I0);
        xd.q1(parcel, 5, this.J0);
        xd.s1(parcel, 6, this.K0);
        xd.s1(parcel, 7, this.L0);
        xd.n1(parcel, 8, this.M0);
        xd.n1(parcel, 9, this.N0);
        xd.B1(parcel, x1);
    }
}
