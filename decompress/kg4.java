import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kg4 extends sd
{
    public static final Parcelable$Creator<kg4> CREATOR;
    public final int F0;
    public final String G0;
    
    static {
        CREATOR = (Parcelable$Creator)new r1y();
    }
    
    public kg4(final int f0, final String g0) {
        this.F0 = f0;
        this.G0 = g0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof kg4)) {
            return false;
        }
        final kg4 kg4 = (kg4)o;
        return kg4.F0 == this.F0 && r5j.a(kg4.G0, this.G0);
    }
    
    @Override
    public final int hashCode() {
        return this.F0;
    }
    
    @Override
    public final String toString() {
        final int f0 = this.F0;
        final String g0 = this.G0;
        final StringBuilder sb = new StringBuilder(String.valueOf(g0).length() + 12);
        sb.append(f0);
        sb.append(":");
        sb.append(g0);
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, int x1) {
        x1 = xd.x1(parcel, 20293);
        xd.n1(parcel, 1, this.F0);
        xd.s1(parcel, 2, this.G0);
        xd.B1(parcel, x1);
    }
}
