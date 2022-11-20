import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ejr implements Comparable<ejr>, Parcelable
{
    public static final Parcelable$Creator<ejr> CREATOR;
    public final int D0;
    public final int E0;
    public final int F0;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<ejr>() {
            public final Object createFromParcel(final Parcel parcel) {
                return new ejr(parcel);
            }
            
            public final Object[] newArray(final int n) {
                return new ejr[n];
            }
        };
    }
    
    public ejr(final Parcel parcel) {
        this.D0 = parcel.readInt();
        this.E0 = parcel.readInt();
        this.F0 = parcel.readInt();
    }
    
    @Override
    public final int compareTo(final Object o) {
        final ejr ejr = (ejr)o;
        int n;
        if ((n = this.D0 - ejr.D0) == 0 && (n = this.E0 - ejr.E0) == 0) {
            n = this.F0 - ejr.F0;
        }
        return n;
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
        if (o != null && ejr.class == o.getClass()) {
            final ejr ejr = (ejr)o;
            if (this.D0 != ejr.D0 || this.E0 != ejr.E0 || this.F0 != ejr.F0) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (this.D0 * 31 + this.E0) * 31 + this.F0;
    }
    
    @Override
    public final String toString() {
        final int d0 = this.D0;
        final int e0 = this.E0;
        final int f0 = this.F0;
        final StringBuilder sb = new StringBuilder(35);
        sb.append(d0);
        sb.append(".");
        sb.append(e0);
        sb.append(".");
        sb.append(f0);
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(this.D0);
        parcel.writeInt(this.E0);
        parcel.writeInt(this.F0);
    }
}
