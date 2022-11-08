import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qtc implements Parcelable
{
    public static final Parcelable$Creator<qtc> CREATOR;
    public final String C0;
    public final String D0;
    public final String E0;
    public final String F0;
    public final String G0;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<qtc>() {
            public final Object createFromParcel(final Parcel parcel) {
                return new qtc(parcel);
            }
            
            public final Object[] newArray(final int n) {
                return new qtc[n];
            }
        };
    }
    
    public qtc(final Parcel parcel) {
        this.C0 = parcel.readString();
        this.D0 = parcel.readString();
        this.E0 = parcel.readString();
        this.F0 = parcel.readString();
        this.G0 = parcel.readString();
    }
    
    public qtc(final String c0, final String d0, final String e0, final String f0, final String g0) {
        this.C0 = c0;
        this.D0 = d0;
        this.F0 = f0;
        this.E0 = e0;
        this.G0 = g0;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.C0);
        parcel.writeString(this.D0);
        parcel.writeString(this.E0);
        parcel.writeString(this.F0);
        parcel.writeString(this.G0);
    }
}
