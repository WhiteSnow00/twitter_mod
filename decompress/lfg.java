import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lfg implements Parcelable
{
    public static final Parcelable$Creator<lfg> CREATOR;
    public final String F0;
    public final boolean G0;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<lfg>() {
            public final Object createFromParcel(final Parcel parcel) {
                return new lfg(parcel);
            }
            
            public final Object[] newArray(final int n) {
                return new lfg[n];
            }
        };
    }
    
    public lfg(final Parcel parcel) {
        this.F0 = parcel.readString();
        final byte byte1 = parcel.readByte();
        boolean g0 = true;
        if (byte1 != 1) {
            g0 = false;
        }
        this.G0 = g0;
    }
    
    public lfg(final String f0, final boolean g0) {
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.F0);
    }
}
