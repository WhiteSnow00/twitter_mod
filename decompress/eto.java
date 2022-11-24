import android.os.Parcelable;
import android.os.Parcel;
import java.util.Arrays;
import java.util.Objects;
import android.app.PendingIntent;
import androidx.annotation.RecentlyNonNull;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eto extends sd
{
    @RecentlyNonNull
    public static final Parcelable$Creator<eto> CREATOR;
    public final PendingIntent F0;
    
    static {
        CREATOR = (Parcelable$Creator)new f8y();
    }
    
    public eto(@RecentlyNonNull final PendingIntent f0) {
        Objects.requireNonNull(f0, "null reference");
        this.F0 = f0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof eto && r5j.a(this.F0, ((eto)o).F0);
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.F0 });
    }
    
    public final void writeToParcel(@RecentlyNonNull final Parcel parcel, final int n) {
        final int x1 = xd.x1(parcel, 20293);
        xd.r1(parcel, 1, (Parcelable)this.F0, n);
        xd.B1(parcel, x1);
    }
}
