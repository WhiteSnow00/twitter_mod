import android.os.Parcel;
import com.twitter.util.user.UserIdentifier;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ebg implements Parcelable
{
    public static final Parcelable$Creator<ebg> CREATOR;
    public final String D0;
    public final String E0;
    public final String F0;
    public final String G0;
    public final long H0;
    public UserIdentifier I0;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<ebg>() {
            public final Object createFromParcel(final Parcel parcel) {
                return new ebg(parcel);
            }
            
            public final Object[] newArray(final int n) {
                return new ebg[n];
            }
        };
    }
    
    public ebg(final Parcel parcel) {
        this.I0 = UserIdentifier.UNDEFINED;
        this.D0 = parcel.readString();
        this.E0 = parcel.readString();
        this.I0 = UserIdentifier.fromId(parcel.readLong());
        this.F0 = parcel.readString();
        this.G0 = parcel.readString();
        this.H0 = parcel.readLong();
    }
    
    public ebg(final String d0, final String e0, final String f0, final String g0, final long h0) {
        this.I0 = UserIdentifier.UNDEFINED;
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.D0);
        parcel.writeString(this.E0);
        parcel.writeLong(this.I0.getId());
        parcel.writeString(this.F0);
        parcel.writeString(this.G0);
        parcel.writeLong(this.H0);
    }
}
