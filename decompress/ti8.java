import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.annotation.SuppressLint;
import android.os.Parcelable;

// 
// Decompiled by Procyon v0.6.0
// 

@SuppressLint({ "BanParcelableUsage" })
public final class ti8 implements Parcelable
{
    public static final Parcelable$Creator<ti8> CREATOR;
    public static final b Companion;
    public final int C0;
    
    static {
        Companion = new b();
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<ti8>() {
            public final Object createFromParcel(final Parcel parcel) {
                zzd.f((Object)parcel, "parcel");
                return new ti8(parcel.readInt());
            }
            
            public final Object[] newArray(final int n) {
                return new ti8[n];
            }
        };
    }
    
    public ti8(final int c0) {
        this.C0 = c0;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof ti8 && this.C0 == ((ti8)o).C0);
    }
    
    @Override
    public final int hashCode() {
        return this.C0;
    }
    
    @Override
    public final String toString() {
        return y70.y(w48.g("DefaultLazyKey(index="), this.C0, ')');
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        zzd.f((Object)parcel, "parcel");
        parcel.writeInt(this.C0);
    }
    
    public static final class b
    {
    }
}
