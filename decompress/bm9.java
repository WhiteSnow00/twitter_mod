import java.util.regex.Pattern;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bm9 implements Parcelable
{
    public static final Parcelable$Creator<bm9> CREATOR;
    public static final bm9 F0;
    public final long D0;
    public final String E0;
    
    static {
        F0 = new bm9(0L, null);
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<bm9>() {
            public final Object createFromParcel(final Parcel parcel) {
                return new bm9(parcel);
            }
            
            public final Object[] newArray(final int n) {
                return new bm9[n];
            }
        };
    }
    
    public bm9(final long d0, final String e0) {
        this.D0 = d0;
        this.E0 = e0;
    }
    
    public bm9(final Parcel parcel) {
        this.D0 = parcel.readLong();
        this.E0 = parcel.readString();
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || bm9.class != o.getClass()) {
            return false;
        }
        final bm9 bm9 = (bm9)o;
        if (this.D0 != bm9.D0) {
            return false;
        }
        final String e0 = this.E0;
        final String e2 = bm9.E0;
        final Pattern a = ikr.a;
        return czd.a((Object)e0, (Object)e2);
    }
    
    @Override
    public final int hashCode() {
        return c5j.f((Object)this.E0) + c5j.d(this.D0) * 31;
    }
    
    public final boolean isValid() {
        return this.D0 != 0L;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeLong(this.D0);
        parcel.writeString(this.E0);
    }
}
