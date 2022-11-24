import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mrs extends a3r
{
    public static final Parcelable$Creator<mrs> CREATOR;
    public final long F0;
    public final long G0;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<mrs>() {
            public final Object createFromParcel(final Parcel parcel) {
                return new mrs(parcel.readLong(), parcel.readLong(), null);
            }
            
            public final Object[] newArray(final int n) {
                return new mrs[n];
            }
        };
    }
    
    public mrs(final long f0, final long g0) {
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public mrs(final long f0, final long g0, final mrs$a parcelable$Creator) {
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public static long a(final gxj gxj, long n) {
        final long n2 = gxj.t();
        if ((0x80L & n2) != 0x0L) {
            n = (0x1FFFFFFFFL & ((n2 & 0x1L) << 32 | gxj.u()) + n);
        }
        else {
            n = -9223372036854775807L;
        }
        return n;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeLong(this.F0);
        parcel.writeLong(this.G0);
    }
}
