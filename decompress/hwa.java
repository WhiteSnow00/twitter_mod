import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hwa implements Parcelable
{
    public static final Parcelable$Creator<hwa> CREATOR;
    public final long C0;
    public final long D0;
    public final String E0;
    public final tk3 F0;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<hwa>() {
            public final Object createFromParcel(final Parcel parcel) {
                return new hwa(parcel);
            }
            
            public final Object[] newArray(final int n) {
                return new hwa[n];
            }
        };
    }
    
    public hwa(final long c0, final long d0, final String e0, final tk3 f0) {
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
    }
    
    public hwa(final Parcel parcel) {
        this.C0 = parcel.readLong();
        this.D0 = parcel.readLong();
        this.E0 = parcel.readString();
        final tk3 f0 = (tk3)tkp.a(parcel.createByteArray(), (alp)tk3.c);
        pf8.r(f0);
        this.F0 = f0;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeLong(this.C0);
        parcel.writeLong(this.D0);
        parcel.writeString(this.E0);
        parcel.writeByteArray(tkp.e((Object)this.F0, (alp)tk3.c));
    }
}
