import com.google.android.exoplayer2.n;
import java.util.Arrays;
import com.google.android.exoplayer2.r$a;
import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bqg implements x8h$b
{
    public static final Parcelable$Creator<bqg> CREATOR;
    public final String C0;
    public final byte[] D0;
    public final int E0;
    public final int F0;
    
    static {
        CREATOR = (Parcelable$Creator)new bqg$a();
    }
    
    public bqg(final Parcel parcel) {
        final String string = parcel.readString();
        final int a = imw.a;
        this.C0 = string;
        this.D0 = parcel.createByteArray();
        this.E0 = parcel.readInt();
        this.F0 = parcel.readInt();
    }
    
    public bqg(final String c0, final byte[] d0, final int e0, final int f0) {
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
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
        if (o != null && bqg.class == o.getClass()) {
            final bqg bqg = (bqg)o;
            if (!this.C0.equals(bqg.C0) || !Arrays.equals(this.D0, bqg.D0) || this.E0 != bqg.E0 || this.F0 != bqg.F0) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return ((Arrays.hashCode(this.D0) + l7k.a(this.C0, 527, 31)) * 31 + this.E0) * 31 + this.F0;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.C0);
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
        parcel.writeString(this.C0);
        parcel.writeByteArray(this.D0);
        parcel.writeInt(this.E0);
        parcel.writeInt(this.F0);
    }
}
