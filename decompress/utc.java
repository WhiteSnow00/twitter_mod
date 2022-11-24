import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class utc implements Parcelable
{
    public static final Parcelable$Creator<utc> CREATOR;
    public final String F0;
    public final String G0;
    public final String H0;
    public final String I0;
    public final String J0;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<utc>() {
            public final Object createFromParcel(final Parcel parcel) {
                return new utc(parcel);
            }
            
            public final Object[] newArray(final int n) {
                return new utc[n];
            }
        };
    }
    
    public utc(final Parcel parcel) {
        this.F0 = parcel.readString();
        this.G0 = parcel.readString();
        this.H0 = parcel.readString();
        this.I0 = parcel.readString();
        this.J0 = parcel.readString();
    }
    
    public utc(final String f0, final String g0, final String h0, final String i0, final String j0) {
        this.F0 = f0;
        this.G0 = g0;
        this.I0 = i0;
        this.H0 = h0;
        this.J0 = j0;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.F0);
        parcel.writeString(this.G0);
        parcel.writeString(this.H0);
        parcel.writeString(this.I0);
        parcel.writeString(this.J0);
    }
}
