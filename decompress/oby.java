import android.os.Parcel;
import com.google.android.gms.fido.fido2.api.common.zzae;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

// 
// Decompiled by Procyon v0.6.0
// 

public enum oby implements Parcelable
{
    public static final Parcelable$Creator<oby> CREATOR;
    public static final oby[] G0;
    public final String F0;
    
    static {
        G0 = new oby[] { new oby("required"), new oby("preferred"), new oby("discouraged") };
        CREATOR = (Parcelable$Creator)new gby();
    }
    
    public oby(final String f0) {
        this.F0 = f0;
    }
    
    public static oby b(final String s) throws zzae {
        for (final oby oby : values()) {
            if (s.equals(oby.F0)) {
                return oby;
            }
        }
        throw new zzae(s);
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final String toString() {
        return this.F0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.F0);
    }
}
