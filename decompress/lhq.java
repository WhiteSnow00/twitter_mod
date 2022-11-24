import com.google.android.exoplayer2.n;
import com.google.android.exoplayer2.r$a;
import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lhq implements q9h$b
{
    public static final Parcelable$Creator<lhq> CREATOR;
    public final float F0;
    public final int G0;
    
    static {
        CREATOR = (Parcelable$Creator)new lhq$a();
    }
    
    public lhq(final float f0, final int g0) {
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public lhq(final Parcel parcel) {
        this.F0 = parcel.readFloat();
        this.G0 = parcel.readInt();
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
        if (o != null && lhq.class == o.getClass()) {
            final lhq lhq = (lhq)o;
            if (this.F0 != lhq.F0 || this.G0 != lhq.G0) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (Float.valueOf(this.F0).hashCode() + 527) * 31 + this.G0;
    }
    
    public final n r0() {
        return null;
    }
    
    @Override
    public final String toString() {
        final float f0 = this.F0;
        final int g0 = this.G0;
        final StringBuilder sb = new StringBuilder(73);
        sb.append("smta: captureFrameRate=");
        sb.append(f0);
        sb.append(", svcTemporalLayerCount=");
        sb.append(g0);
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeFloat(this.F0);
        parcel.writeInt(this.G0);
    }
    
    public final byte[] y3() {
        return null;
    }
}
