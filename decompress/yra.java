import android.os.Parcel;
import java.util.Arrays;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yra extends rd
{
    public static final Parcelable$Creator<yra> CREATOR;
    public final String D0;
    @Deprecated
    public final int E0;
    public final long F0;
    
    static {
        CREATOR = (Parcelable$Creator)new xny();
    }
    
    public yra(final String d0, final int e0, final long f0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
    }
    
    public yra(final String d0, final long f0) {
        this.D0 = d0;
        this.F0 = f0;
        this.E0 = -1;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof yra) {
            final yra yra = (yra)o;
            final String d0 = this.D0;
            if (((d0 != null && d0.equals(yra.D0)) || (this.D0 == null && yra.D0 == null)) && this.r() == yra.r()) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.D0, this.r() });
    }
    
    public final long r() {
        long f0;
        if ((f0 = this.F0) == -1L) {
            f0 = this.E0;
        }
        return f0;
    }
    
    @Override
    public final String toString() {
        final f5j.a a = new f5j.a(this);
        a.a("name", this.D0);
        a.a("version", this.r());
        return a.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, int d1) {
        d1 = fli.d1(parcel, 20293);
        fli.Y0(parcel, 1, this.D0);
        fli.T0(parcel, 2, this.E0);
        fli.W0(parcel, 3, this.r());
        fli.g1(parcel, d1);
    }
}
