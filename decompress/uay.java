import android.os.Parcel;
import com.google.android.gms.fido.fido2.api.common.zzae;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

// 
// Decompiled by Procyon v0.6.0
// 

public enum uay implements Parcelable
{
    public static final Parcelable$Creator<uay> CREATOR;
    public static final uay[] E0;
    public final String D0;
    
    static {
        E0 = new uay[] { new uay("required"), new uay("preferred"), new uay("discouraged") };
        CREATOR = (Parcelable$Creator)new may();
    }
    
    public uay(final String d0) {
        this.D0 = d0;
    }
    
    public static uay b(final String s) throws zzae {
        for (final uay uay : values()) {
            if (s.equals(uay.D0)) {
                return uay;
            }
        }
        throw new zzae(s);
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final String toString() {
        return this.D0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.D0);
    }
}
