import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yoz extends rd
{
    public static final Parcelable$Creator<yoz> CREATOR;
    public final int D0;
    public final String E0;
    public final long F0;
    public final Long G0;
    public final String H0;
    public final String I0;
    public final Double J0;
    
    static {
        CREATOR = (Parcelable$Creator)new apz();
    }
    
    public yoz(final int d0, final String e0, final long f0, final Long g0, final Float n, final String h0, final String i0, final Double j0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        if (d0 == 1) {
            Double value;
            if (n != null) {
                value = (double)n;
            }
            else {
                value = null;
            }
            this.J0 = value;
        }
        else {
            this.J0 = j0;
        }
        this.H0 = h0;
        this.I0 = i0;
    }
    
    public yoz(final dpz dpz) {
        this(dpz.c, dpz.d, dpz.e, dpz.b);
    }
    
    public yoz(final String e0, final long f0, final Object o, final String i0) {
        eli.n(e0);
        this.D0 = 2;
        this.E0 = e0;
        this.F0 = f0;
        this.I0 = i0;
        if (o == null) {
            this.G0 = null;
            this.J0 = null;
            this.H0 = null;
            return;
        }
        if (o instanceof Long) {
            this.G0 = (Long)o;
            this.J0 = null;
            this.H0 = null;
            return;
        }
        if (o instanceof String) {
            this.G0 = null;
            this.J0 = null;
            this.H0 = (String)o;
            return;
        }
        if (o instanceof Double) {
            this.G0 = null;
            this.J0 = (Double)o;
            this.H0 = null;
            return;
        }
        throw new IllegalArgumentException("User attribute given of un-supported type");
    }
    
    public final Object r() {
        final Long g0 = this.G0;
        if (g0 != null) {
            return g0;
        }
        final Double j0 = this.J0;
        if (j0 != null) {
            return j0;
        }
        final String h0 = this.H0;
        if (h0 != null) {
            return h0;
        }
        return null;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        apz.a(this, parcel);
    }
}
