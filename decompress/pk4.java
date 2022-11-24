import android.os.Parcelable;
import android.os.Parcel;
import android.content.Intent;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pk4 extends sd
{
    public static final Parcelable$Creator<pk4> CREATOR;
    public Intent F0;
    
    static {
        CREATOR = (Parcelable$Creator)new jay();
    }
    
    public pk4(final Intent f0) {
        this.F0 = f0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int x1 = xd.x1(parcel, 20293);
        xd.r1(parcel, 1, (Parcelable)this.F0, n);
        xd.B1(parcel, x1);
    }
}
