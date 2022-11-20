import android.os.Parcel;
import java.util.Arrays;
import java.util.Objects;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gnl extends rd
{
    public static final Parcelable$Creator<gnl> CREATOR;
    public final String D0;
    public final String E0;
    public final String F0;
    
    static {
        CREATOR = (Parcelable$Creator)new xzz();
    }
    
    public gnl(final String d0, final String e0, final String f0) {
        Objects.requireNonNull(d0, "null reference");
        this.D0 = d0;
        Objects.requireNonNull(e0, "null reference");
        this.E0 = e0;
        this.F0 = f0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (!(o instanceof gnl)) {
            return false;
        }
        final gnl gnl = (gnl)o;
        return f5j.a(this.D0, gnl.D0) && f5j.a(this.E0, gnl.E0) && f5j.a(this.F0, gnl.F0);
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.D0, this.E0, this.F0 });
    }
    
    public final void writeToParcel(final Parcel parcel, int d1) {
        d1 = fli.d1(parcel, 20293);
        fli.Y0(parcel, 2, this.D0);
        fli.Y0(parcel, 3, this.E0);
        fli.Y0(parcel, 4, this.F0);
        fli.g1(parcel, d1);
    }
}
