import android.os.Parcel;
import java.util.Arrays;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class llw extends sd
{
    public static final Parcelable$Creator<llw> CREATOR;
    public final boolean F0;
    
    static {
        CREATOR = (Parcelable$Creator)new yay();
    }
    
    public llw(final boolean f0) {
        this.F0 = f0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof llw && this.F0 == ((llw)o).F0;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.F0 });
    }
    
    public final void writeToParcel(final Parcel parcel, int x1) {
        x1 = xd.x1(parcel, 20293);
        xd.e1(parcel, 1, this.F0);
        xd.B1(parcel, x1);
    }
}
