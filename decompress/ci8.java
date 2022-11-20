import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.annotation.SuppressLint;
import android.os.Parcelable;

// 
// Decompiled by Procyon v0.6.0
// 

@SuppressLint({ "BanParcelableUsage" })
public final class ci8 implements Parcelable
{
    public static final Parcelable$Creator<ci8> CREATOR;
    public static final b Companion;
    public final int D0;
    
    static {
        Companion = new b();
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<ci8>() {
            public final Object createFromParcel(final Parcel parcel) {
                czd.f((Object)parcel, "parcel");
                return new ci8(parcel.readInt());
            }
            
            public final Object[] newArray(final int n) {
                return new ci8[n];
            }
        };
    }
    
    public ci8(final int d0) {
        this.D0 = d0;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof ci8 && this.D0 == ((ci8)o).D0);
    }
    
    @Override
    public final int hashCode() {
        return this.D0;
    }
    
    @Override
    public final String toString() {
        return x70.C(fu8.j("DefaultLazyKey(index="), this.D0, ')');
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        czd.f((Object)parcel, "parcel");
        parcel.writeInt(this.D0);
    }
    
    public static final class b
    {
    }
}
