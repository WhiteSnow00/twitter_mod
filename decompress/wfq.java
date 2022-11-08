import com.google.android.exoplayer2.n;
import com.google.android.exoplayer2.r$a;
import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wfq implements x8h$b
{
    public static final Parcelable$Creator<wfq> CREATOR;
    public final float C0;
    public final int D0;
    
    static {
        CREATOR = (Parcelable$Creator)new wfq$a();
    }
    
    public wfq(final float c0, final int d0) {
        this.C0 = c0;
        this.D0 = d0;
    }
    
    public wfq(final Parcel parcel) {
        this.C0 = parcel.readFloat();
        this.D0 = parcel.readInt();
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
        if (o != null && wfq.class == o.getClass()) {
            final wfq wfq = (wfq)o;
            if (this.C0 != wfq.C0 || this.D0 != wfq.D0) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (Float.valueOf(this.C0).hashCode() + 527) * 31 + this.D0;
    }
    
    @Override
    public final String toString() {
        final float c0 = this.C0;
        final int d0 = this.D0;
        final StringBuilder sb = new StringBuilder(73);
        sb.append("smta: captureFrameRate=");
        sb.append(c0);
        sb.append(", svcTemporalLayerCount=");
        sb.append(d0);
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeFloat(this.C0);
        parcel.writeInt(this.D0);
    }
}
