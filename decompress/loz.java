import android.os.Parcel;
import java.util.Arrays;
import java.util.Objects;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class loz extends sd
{
    public static final Parcelable$Creator<loz> CREATOR;
    public final long F0;
    public final byte[] G0;
    public final byte[] H0;
    public final byte[] I0;
    
    static {
        CREATOR = (Parcelable$Creator)new vsz();
    }
    
    public loz(final long f0, final byte[] g0, final byte[] h0, final byte[] i0) {
        this.F0 = f0;
        Objects.requireNonNull(g0, "null reference");
        this.G0 = g0;
        Objects.requireNonNull(h0, "null reference");
        this.H0 = h0;
        Objects.requireNonNull(i0, "null reference");
        this.I0 = i0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (!(o instanceof loz)) {
            return false;
        }
        final loz loz = (loz)o;
        return this.F0 == loz.F0 && Arrays.equals(this.G0, loz.G0) && Arrays.equals(this.H0, loz.H0) && Arrays.equals(this.I0, loz.I0);
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.F0, this.G0, this.H0, this.I0 });
    }
    
    public final void writeToParcel(final Parcel parcel, int x1) {
        x1 = xd.x1(parcel, 20293);
        xd.q1(parcel, 1, this.F0);
        xd.i1(parcel, 2, this.G0);
        xd.i1(parcel, 3, this.H0);
        xd.i1(parcel, 4, this.I0);
        xd.B1(parcel, x1);
    }
}
