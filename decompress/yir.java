import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yir extends rd
{
    public static final Parcelable$Creator<yir> CREATOR;
    public final byte[] D0;
    public final boolean E0;
    
    static {
        CREATOR = (Parcelable$Creator)new o9y();
    }
    
    public yir(final byte[] d0, final boolean e0) {
        this.D0 = d0;
        this.E0 = e0;
    }
    
    public final void writeToParcel(final Parcel parcel, int d1) {
        d1 = fli.d1(parcel, 20293);
        fli.O0(parcel, 1, this.D0);
        fli.K0(parcel, 2, this.E0);
        fli.g1(parcel, d1);
    }
    
    public static final class a
    {
        public byte[] a;
    }
}
