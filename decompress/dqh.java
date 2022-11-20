import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dqh implements Parcelable
{
    public static final Parcelable$Creator<dqh> CREATOR;
    public final int D0;
    public final String E0;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<dqh>() {
            public final Object createFromParcel(final Parcel parcel) {
                return new dqh(parcel);
            }
            
            public final Object[] newArray(final int n) {
                return new dqh[n];
            }
        };
    }
    
    public dqh(final int d0, final String e0) {
        this.D0 = d0;
        this.E0 = e0;
    }
    
    public dqh(final Parcel parcel) {
        this.D0 = parcel.readInt();
        this.E0 = parcel.readString();
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
        if (o != null && dqh.class == o.getClass()) {
            final dqh dqh = (dqh)o;
            if (this.D0 != dqh.D0 || !this.E0.equals(dqh.E0)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return this.E0.hashCode() + this.D0 * 31;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(this.D0);
        parcel.writeString(this.E0);
    }
}
