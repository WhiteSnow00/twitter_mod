import android.os.Parcelable;
import android.os.Parcel;
import com.google.android.gms.auth.api.credentials.Credential;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class r8y extends sd
{
    public static final Parcelable$Creator<r8y> CREATOR;
    public final Credential F0;
    
    static {
        CREATOR = (Parcelable$Creator)new s8y();
    }
    
    public r8y(final Credential f0) {
        this.F0 = f0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int x1 = xd.x1(parcel, 20293);
        xd.r1(parcel, 1, (Parcelable)this.F0, n);
        xd.B1(parcel, x1);
    }
}
