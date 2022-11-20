import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ff4 extends rd
{
    public static final Parcelable$Creator<ff4> CREATOR;
    public final int D0;
    public final String E0;
    
    static {
        CREATOR = (Parcelable$Creator)new x0y();
    }
    
    public ff4(final int d0, final String e0) {
        this.D0 = d0;
        this.E0 = e0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ff4)) {
            return false;
        }
        final ff4 ff4 = (ff4)o;
        return ff4.D0 == this.D0 && f5j.a(ff4.E0, this.E0);
    }
    
    @Override
    public final int hashCode() {
        return this.D0;
    }
    
    @Override
    public final String toString() {
        final int d0 = this.D0;
        final String e0 = this.E0;
        final StringBuilder sb = new StringBuilder(String.valueOf(e0).length() + 12);
        sb.append(d0);
        sb.append(":");
        sb.append(e0);
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, int d1) {
        d1 = fli.d1(parcel, 20293);
        fli.T0(parcel, 1, this.D0);
        fli.Y0(parcel, 2, this.E0);
        fli.g1(parcel, d1);
    }
}
