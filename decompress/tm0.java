import com.google.android.exoplayer2.n;
import com.google.android.exoplayer2.r$a;
import java.util.Objects;
import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class tm0 implements q9h$b
{
    public static final Parcelable$Creator<tm0> CREATOR;
    public final int F0;
    public final String G0;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<tm0>() {
            public final Object createFromParcel(final Parcel parcel) {
                final String string = parcel.readString();
                Objects.requireNonNull(string);
                return new tm0(parcel.readInt(), string);
            }
            
            public final Object[] newArray(final int n) {
                return new tm0[n];
            }
        };
    }
    
    public tm0(final int f0, final String g0) {
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final void P1(final r$a r$a) {
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final n r0() {
        return null;
    }
    
    @Override
    public final String toString() {
        final int f0 = this.F0;
        final String g0 = this.G0;
        final StringBuilder sb = new StringBuilder(l58.g(g0, 33));
        sb.append("Ait(controlCode=");
        sb.append(f0);
        sb.append(",url=");
        sb.append(g0);
        sb.append(")");
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.G0);
        parcel.writeInt(this.F0);
    }
    
    public final byte[] y3() {
        return null;
    }
}
