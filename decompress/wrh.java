import com.google.android.exoplayer2.n;
import com.google.android.exoplayer2.r$a;
import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wrh implements q9h$b
{
    public static final Parcelable$Creator<wrh> CREATOR;
    public final long F0;
    public final long G0;
    public final long H0;
    public final long I0;
    public final long J0;
    
    static {
        CREATOR = (Parcelable$Creator)new wrh$a();
    }
    
    public wrh(final long f0, final long g0, final long h0, final long i0, final long j0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
    }
    
    public wrh(final Parcel parcel) {
        this.F0 = parcel.readLong();
        this.G0 = parcel.readLong();
        this.H0 = parcel.readLong();
        this.I0 = parcel.readLong();
        this.J0 = parcel.readLong();
    }
    
    public final void P1(final r$a r$a) {
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && wrh.class == o.getClass()) {
            final wrh wrh = (wrh)o;
            if (this.F0 != wrh.F0 || this.G0 != wrh.G0 || this.H0 != wrh.H0 || this.I0 != wrh.I0 || this.J0 != wrh.J0) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return w9y.o(this.J0) + (w9y.o(this.I0) + (w9y.o(this.H0) + (w9y.o(this.G0) + (w9y.o(this.F0) + 527) * 31) * 31) * 31) * 31;
    }
    
    public final n r0() {
        return null;
    }
    
    @Override
    public final String toString() {
        final long f0 = this.F0;
        final long g0 = this.G0;
        final long h0 = this.H0;
        final long i0 = this.I0;
        final long j0 = this.J0;
        final StringBuilder sb = new StringBuilder(218);
        sb.append("Motion photo metadata: photoStartPosition=");
        sb.append(f0);
        sb.append(", photoSize=");
        sb.append(g0);
        po.E(sb, ", photoPresentationTimestampUs=", h0, ", videoStartPosition=");
        sb.append(i0);
        sb.append(", videoSize=");
        sb.append(j0);
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeLong(this.F0);
        parcel.writeLong(this.G0);
        parcel.writeLong(this.H0);
        parcel.writeLong(this.I0);
        parcel.writeLong(this.J0);
    }
    
    public final byte[] y3() {
        return null;
    }
}
