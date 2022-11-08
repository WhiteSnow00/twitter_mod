import java.util.regex.Pattern;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ln3 implements Parcelable
{
    public static final Parcelable$Creator<ln3> CREATOR;
    public final String C0;
    public final String D0;
    public final int E0;
    public final String F0;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<ln3>() {
            public final Object createFromParcel(final Parcel parcel) {
                return new ln3(parcel);
            }
            
            public final Object[] newArray(final int n) {
                return new ln3[n];
            }
        };
    }
    
    public ln3(final Parcel parcel) {
        this.C0 = parcel.readString();
        this.D0 = parcel.readString();
        this.E0 = parcel.readInt();
        this.F0 = parcel.readString();
    }
    
    public ln3(final String c0, final String d0, final String f0) {
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = 2;
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
        if (o != null && ln3.class == o.getClass()) {
            final ln3 ln3 = (ln3)o;
            if (ln3.C0.equalsIgnoreCase(this.C0) && ln3.D0.equalsIgnoreCase(this.D0) && ln3.E0 == this.E0) {
                final String f0 = ln3.F0;
                final String f2 = this.F0;
                final Pattern a = pjr.a;
                if (ckr.f1(f0, f2, true)) {
                    return b;
                }
            }
            b = false;
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return w4j.i((Object)this.E0, (Object)this.C0, (Object)this.D0, (Object)this.F0);
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.C0);
        parcel.writeString(this.D0);
        parcel.writeInt(this.E0);
        parcel.writeString(this.F0);
    }
}
