import android.os.Parcel;
import android.content.Intent;
import android.os.Parcelable$Creator;
import android.annotation.SuppressLint;
import android.os.Parcelable;

// 
// Decompiled by Procyon v0.6.0
// 

@SuppressLint({ "BanParcelableUsage" })
public final class ao implements Parcelable
{
    public static final Parcelable$Creator<ao> CREATOR;
    public final int C0;
    public final Intent D0;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<ao>() {
            public final Object createFromParcel(final Parcel parcel) {
                return new ao(parcel);
            }
            
            public final Object[] newArray(final int n) {
                return new ao[n];
            }
        };
    }
    
    public ao(final int c0, final Intent d0) {
        this.C0 = c0;
        this.D0 = d0;
    }
    
    public ao(final Parcel parcel) {
        this.C0 = parcel.readInt();
        Intent d0;
        if (parcel.readInt() == 0) {
            d0 = null;
        }
        else {
            d0 = (Intent)Intent.CREATOR.createFromParcel(parcel);
        }
        this.D0 = d0;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final String toString() {
        final StringBuilder g = w48.g("ActivityResult{resultCode=");
        final int c0 = this.C0;
        String value;
        if (c0 != -1) {
            if (c0 != 0) {
                value = String.valueOf(c0);
            }
            else {
                value = "RESULT_CANCELED";
            }
        }
        else {
            value = "RESULT_OK";
        }
        g.append(value);
        g.append(", data=");
        g.append(this.D0);
        g.append('}');
        return g.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(this.C0);
        int n2;
        if (this.D0 == null) {
            n2 = 0;
        }
        else {
            n2 = 1;
        }
        parcel.writeInt(n2);
        final Intent d0 = this.D0;
        if (d0 != null) {
            d0.writeToParcel(parcel, n);
        }
    }
}
