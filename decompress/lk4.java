import android.os.Parcelable;
import android.os.Parcel;
import android.content.Intent;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lk4 extends sd
{
    public static final Parcelable$Creator<lk4> CREATOR;
    public Intent C0;
    
    static {
        CREATOR = (Parcelable$Creator)new z8y();
    }
    
    public lk4(final Intent c0) {
        this.C0 = c0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int x0 = ri4.x0(parcel, 20293);
        ri4.r0(parcel, 1, (Parcelable)this.C0, n);
        ri4.A0(parcel, x0);
    }
}
