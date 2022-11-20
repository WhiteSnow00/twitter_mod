import com.google.android.exoplayer2.n;
import java.util.Arrays;
import com.google.android.exoplayer2.r$a;
import java.util.Objects;
import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class f4d implements z8h$b
{
    public static final Parcelable$Creator<f4d> CREATOR;
    public final byte[] D0;
    public final String E0;
    public final String F0;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<f4d>() {
            public final Object createFromParcel(final Parcel parcel) {
                return new f4d(parcel);
            }
            
            public final Object[] newArray(final int n) {
                return new f4d[n];
            }
        };
    }
    
    public f4d(final Parcel parcel) {
        final byte[] byteArray = parcel.createByteArray();
        Objects.requireNonNull(byteArray);
        this.D0 = byteArray;
        this.E0 = parcel.readString();
        this.F0 = parcel.readString();
    }
    
    public f4d(final byte[] d0, final String e0, final String f0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
    }
    
    public final void O1(final r$a r$a) {
        final String e0 = this.E0;
        if (e0 != null) {
            r$a.a = e0;
        }
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o != null && f4d.class == o.getClass() && Arrays.equals(this.D0, ((f4d)o).D0));
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(this.D0);
    }
    
    public final n q0() {
        return null;
    }
    
    @Override
    public final String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", this.E0, this.F0, this.D0.length);
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeByteArray(this.D0);
        parcel.writeString(this.E0);
        parcel.writeString(this.F0);
    }
    
    public final byte[] x3() {
        return null;
    }
}
