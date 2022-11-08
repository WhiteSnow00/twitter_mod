import android.os.Parcel;
import java.util.Arrays;
import java.util.Objects;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ymz extends sd
{
    public static final Parcelable$Creator<ymz> CREATOR;
    public final long C0;
    public final byte[] D0;
    public final byte[] E0;
    public final byte[] F0;
    
    static {
        CREATOR = (Parcelable$Creator)new irz();
    }
    
    public ymz(final long c0, final byte[] d0, final byte[] e0, final byte[] f0) {
        this.C0 = c0;
        Objects.requireNonNull(d0, "null reference");
        this.D0 = d0;
        Objects.requireNonNull(e0, "null reference");
        this.E0 = e0;
        Objects.requireNonNull(f0, "null reference");
        this.F0 = f0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (!(o instanceof ymz)) {
            return false;
        }
        final ymz ymz = (ymz)o;
        return this.C0 == ymz.C0 && Arrays.equals(this.D0, ymz.D0) && Arrays.equals(this.E0, ymz.E0) && Arrays.equals(this.F0, ymz.F0);
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.C0, this.D0, this.E0, this.F0 });
    }
    
    public final void writeToParcel(final Parcel parcel, int x0) {
        x0 = ri4.x0(parcel, 20293);
        ri4.q0(parcel, 1, this.C0);
        ri4.i0(parcel, 2, this.D0);
        ri4.i0(parcel, 3, this.E0);
        ri4.i0(parcel, 4, this.F0);
        ri4.A0(parcel, x0);
    }
}
