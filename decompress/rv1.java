import android.os.Parcelable;
import android.os.Parcel;
import java.util.Objects;
import android.app.PendingIntent;
import androidx.annotation.RecentlyNonNull;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rv1 extends sd
{
    @RecentlyNonNull
    public static final Parcelable$Creator<rv1> CREATOR;
    public final PendingIntent F0;
    
    static {
        CREATOR = (Parcelable$Creator)new g7y();
    }
    
    public rv1(@RecentlyNonNull final PendingIntent f0) {
        Objects.requireNonNull(f0, "null reference");
        this.F0 = f0;
    }
    
    public final void writeToParcel(@RecentlyNonNull final Parcel parcel, final int n) {
        final int x1 = xd.x1(parcel, 20293);
        xd.r1(parcel, 1, (Parcelable)this.F0, n);
        xd.B1(parcel, x1);
    }
}
