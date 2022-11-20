import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lv implements Parcelable
{
    public static final Parcelable$Creator<lv> CREATOR;
    public final boolean D0;
    public final boolean E0;
    public final boolean F0;
    public final boolean G0;
    public final boolean H0;
    public final boolean I0;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<lv>() {
            public final Object createFromParcel(final Parcel parcel) {
                return new lv(parcel);
            }
            
            public final Object[] newArray(final int n) {
                return new lv[n];
            }
        };
    }
    
    public lv(final Parcel parcel) {
        this.D0 = dwj.d(parcel);
        this.E0 = dwj.d(parcel);
        this.F0 = dwj.d(parcel);
        this.G0 = dwj.d(parcel);
        this.H0 = dwj.d(parcel);
        this.I0 = dwj.d(parcel);
    }
    
    public lv(final boolean d0, final boolean e0, final boolean f0, final boolean g0, final boolean h0, final boolean i0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeByte((byte)(byte)(this.D0 ? 1 : 0));
        parcel.writeByte((byte)(byte)(this.E0 ? 1 : 0));
        parcel.writeByte((byte)(byte)(this.F0 ? 1 : 0));
        parcel.writeByte((byte)(byte)(this.G0 ? 1 : 0));
        parcel.writeByte((byte)(byte)(this.H0 ? 1 : 0));
        parcel.writeByte((byte)(byte)(this.I0 ? 1 : 0));
    }
}
