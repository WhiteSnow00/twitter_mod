import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class n0l extends b2r
{
    public static final Parcelable$Creator<n0l> CREATOR;
    public final long D0;
    public final long E0;
    public final byte[] F0;
    
    static {
        CREATOR = (Parcelable$Creator)new n0l$a();
    }
    
    public n0l(final long e0, final byte[] f0, final long d0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
    }
    
    public n0l(final Parcel parcel) {
        this.D0 = parcel.readLong();
        this.E0 = parcel.readLong();
        final byte[] byteArray = parcel.createByteArray();
        final int a = cnw.a;
        this.F0 = byteArray;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeLong(this.D0);
        parcel.writeLong(this.E0);
        parcel.writeByteArray(this.F0);
    }
}
