import android.os.Parcel;
import java.util.Arrays;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gta extends sd
{
    public static final Parcelable$Creator<gta> CREATOR;
    public final String F0;
    @Deprecated
    public final int G0;
    public final long H0;
    
    static {
        CREATOR = (Parcelable$Creator)new roy();
    }
    
    public gta(final String f0, final int g0, final long h0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
    }
    
    public gta(final String f0, final long h0) {
        this.F0 = f0;
        this.H0 = h0;
        this.G0 = -1;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof gta) {
            final gta gta = (gta)o;
            final String f0 = this.F0;
            if (((f0 != null && f0.equals(gta.F0)) || (this.F0 == null && gta.F0 == null)) && this.p() == gta.p()) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.F0, this.p() });
    }
    
    public final long p() {
        long h0;
        if ((h0 = this.H0) == -1L) {
            h0 = this.G0;
        }
        return h0;
    }
    
    @Override
    public final String toString() {
        final r5j.a a = new r5j.a(this);
        a.a("name", this.F0);
        a.a("version", this.p());
        return a.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, int x1) {
        x1 = xd.x1(parcel, 20293);
        xd.s1(parcel, 1, this.F0);
        xd.n1(parcel, 2, this.G0);
        xd.q1(parcel, 3, this.p());
        xd.B1(parcel, x1);
    }
}
