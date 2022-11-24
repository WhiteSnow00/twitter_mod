import android.os.Parcel;
import java.util.Arrays;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qdy extends sd
{
    public static final Parcelable$Creator<qdy> CREATOR;
    public final int F0;
    public final int G0;
    public final long H0;
    public final long I0;
    
    static {
        CREATOR = (Parcelable$Creator)new ydy();
    }
    
    public qdy(final int f0, final int g0, final long h0, final long i0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null) {
            if (qdy.class == o.getClass()) {
                final qdy qdy = (qdy)o;
                if (this.F0 == qdy.F0 && this.G0 == qdy.G0 && this.H0 == qdy.H0 && this.I0 == qdy.I0) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.G0, this.F0, this.I0, this.H0 });
    }
    
    @Override
    public final String toString() {
        final StringBuilder j = j98.j("NetworkLocationStatus:", " Wifi status: ");
        j.append(this.F0);
        j.append(" Cell status: ");
        j.append(this.G0);
        j.append(" elapsed time NS: ");
        j.append(this.I0);
        j.append(" system time ms: ");
        j.append(this.H0);
        return j.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, int x1) {
        x1 = xd.x1(parcel, 20293);
        xd.n1(parcel, 1, this.F0);
        xd.n1(parcel, 2, this.G0);
        xd.q1(parcel, 3, this.H0);
        xd.q1(parcel, 4, this.I0);
        xd.B1(parcel, x1);
    }
}
