import java.util.regex.Pattern;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dn9 implements Parcelable
{
    public static final Parcelable$Creator<dn9> CREATOR;
    public static final dn9 H0;
    public final long F0;
    public final String G0;
    
    static {
        H0 = new dn9(0L, null);
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<dn9>() {
            public final Object createFromParcel(final Parcel parcel) {
                return new dn9(parcel);
            }
            
            public final Object[] newArray(final int n) {
                return new dn9[n];
            }
        };
    }
    
    public dn9(final long f0, final String g0) {
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public dn9(final Parcel parcel) {
        this.F0 = parcel.readLong();
        this.G0 = parcel.readString();
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || dn9.class != o.getClass()) {
            return false;
        }
        final dn9 dn9 = (dn9)o;
        if (this.F0 != dn9.F0) {
            return false;
        }
        final String g0 = this.G0;
        final String g2 = dn9.G0;
        final Pattern a = flr.a;
        return e0e.a((Object)g0, (Object)g2);
    }
    
    @Override
    public final int hashCode() {
        return o5j.f((Object)this.G0) + o5j.d(this.F0) * 31;
    }
    
    public final boolean isValid() {
        return this.F0 != 0L;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeLong(this.F0);
        parcel.writeString(this.G0);
    }
}
