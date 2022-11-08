import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class koz extends sd
{
    public static final Parcelable$Creator<koz> CREATOR;
    public final int C0;
    public final String D0;
    public final long E0;
    public final Long F0;
    public final String G0;
    public final String H0;
    public final Double I0;
    
    static {
        CREATOR = (Parcelable$Creator)new moz();
    }
    
    public koz(final int c0, final String d0, final long e0, final Long f0, final Float n, final String g0, final String h0, final Double i0) {
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        if (c0 == 1) {
            Double value;
            if (n != null) {
                value = (double)n;
            }
            else {
                value = null;
            }
            this.I0 = value;
        }
        else {
            this.I0 = i0;
        }
        this.G0 = g0;
        this.H0 = h0;
    }
    
    public koz(final String d0, final long e0, final Object o, final String h0) {
        xd.q(d0);
        this.C0 = 2;
        this.D0 = d0;
        this.E0 = e0;
        this.H0 = h0;
        if (o == null) {
            this.F0 = null;
            this.I0 = null;
            this.G0 = null;
            return;
        }
        if (o instanceof Long) {
            this.F0 = (Long)o;
            this.I0 = null;
            this.G0 = null;
            return;
        }
        if (o instanceof String) {
            this.F0 = null;
            this.I0 = null;
            this.G0 = (String)o;
            return;
        }
        if (o instanceof Double) {
            this.F0 = null;
            this.I0 = (Double)o;
            this.G0 = null;
            return;
        }
        throw new IllegalArgumentException("User attribute given of un-supported type");
    }
    
    public koz(final poz poz) {
        this(poz.c, poz.d, poz.e, poz.b);
    }
    
    public final Object r() {
        final Long f0 = this.F0;
        if (f0 != null) {
            return f0;
        }
        final Double i0 = this.I0;
        if (i0 != null) {
            return i0;
        }
        final String g0 = this.G0;
        if (g0 != null) {
            return g0;
        }
        return null;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        moz.a(this, parcel);
    }
}
