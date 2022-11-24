import android.os.Parcelable;
import android.os.Parcel;
import java.util.Objects;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kby extends sd
{
    public static final Parcelable$Creator<kby> CREATOR;
    public String F0;
    public String G0;
    public xpz H0;
    public long I0;
    public boolean J0;
    public String K0;
    public final rhy L0;
    public long M0;
    public rhy N0;
    public final long O0;
    public final rhy P0;
    
    static {
        CREATOR = (Parcelable$Creator)new tby();
    }
    
    public kby(final String f0, final String g0, final xpz h0, final long i0, final boolean j0, final String k0, final rhy l0, final long m0, final rhy n0, final long o0, final rhy p11) {
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
    
    public kby(final kby kby) {
        Objects.requireNonNull(kby, "null reference");
        this.F0 = kby.F0;
        this.G0 = kby.G0;
        this.H0 = kby.H0;
        this.I0 = kby.I0;
        this.J0 = kby.J0;
        this.K0 = kby.K0;
        this.L0 = kby.L0;
        this.M0 = kby.M0;
        this.N0 = kby.N0;
        this.O0 = kby.O0;
        this.P0 = kby.P0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int x1 = xd.x1(parcel, 20293);
        xd.s1(parcel, 2, this.F0);
        xd.s1(parcel, 3, this.G0);
        xd.r1(parcel, 4, (Parcelable)this.H0, n);
        xd.q1(parcel, 5, this.I0);
        xd.e1(parcel, 6, this.J0);
        xd.s1(parcel, 7, this.K0);
        xd.r1(parcel, 8, (Parcelable)this.L0, n);
        xd.q1(parcel, 9, this.M0);
        xd.r1(parcel, 10, (Parcelable)this.N0, n);
        xd.q1(parcel, 11, this.O0);
        xd.r1(parcel, 12, (Parcelable)this.P0, n);
        xd.B1(parcel, x1);
    }
}
