import android.os.Parcel;
import java.util.Arrays;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wcy extends rd
{
    public static final Parcelable$Creator<wcy> CREATOR;
    public final int D0;
    public final int E0;
    public final long F0;
    public final long G0;
    
    static {
        CREATOR = (Parcelable$Creator)new edy();
    }
    
    public wcy(final int d0, final int e0, final long f0, final long g0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null) {
            if (wcy.class == o.getClass()) {
                final wcy wcy = (wcy)o;
                if (this.D0 == wcy.D0 && this.E0 == wcy.E0 && this.F0 == wcy.F0 && this.G0 == wcy.G0) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.E0, this.D0, this.G0, this.F0 });
    }
    
    @Override
    public final String toString() {
        final StringBuilder g = shc.g("NetworkLocationStatus:", " Wifi status: ");
        g.append(this.D0);
        g.append(" Cell status: ");
        g.append(this.E0);
        g.append(" elapsed time NS: ");
        g.append(this.G0);
        g.append(" system time ms: ");
        g.append(this.F0);
        return g.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, int d1) {
        d1 = fli.d1(parcel, 20293);
        fli.T0(parcel, 1, this.D0);
        fli.T0(parcel, 2, this.E0);
        fli.W0(parcel, 3, this.F0);
        fli.W0(parcel, 4, this.G0);
        fli.g1(parcel, d1);
    }
}
