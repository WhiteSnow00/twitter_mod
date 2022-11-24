import com.google.android.exoplayer2.n;
import java.util.Arrays;
import com.google.android.exoplayer2.r$a;
import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class uqg implements q9h$b
{
    public static final Parcelable$Creator<uqg> CREATOR;
    public final String F0;
    public final byte[] G0;
    public final int H0;
    public final int I0;
    
    static {
        CREATOR = (Parcelable$Creator)new uqg$a();
    }
    
    public uqg(final Parcel parcel) {
        final String string = parcel.readString();
        final int a = rnw.a;
        this.F0 = string;
        this.G0 = parcel.createByteArray();
        this.H0 = parcel.readInt();
        this.I0 = parcel.readInt();
    }
    
    public uqg(final String f0, final byte[] g0, final int h0, final int i0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
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
        if (o != null && uqg.class == o.getClass()) {
            final uqg uqg = (uqg)o;
            if (!this.F0.equals(uqg.F0) || !Arrays.equals(this.G0, uqg.G0) || this.H0 != uqg.H0 || this.I0 != uqg.I0) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return ((Arrays.hashCode(this.G0) + brg.d(this.F0, 527, 31)) * 31 + this.H0) * 31 + this.I0;
    }
    
    public final n r0() {
        return null;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.F0);
        String concat;
        if (value.length() != 0) {
            concat = "mdta: key=".concat(value);
        }
        else {
            concat = new String("mdta: key=");
        }
        return concat;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.F0);
        parcel.writeByteArray(this.G0);
        parcel.writeInt(this.H0);
        parcel.writeInt(this.I0);
    }
    
    public final byte[] y3() {
        return null;
    }
}
