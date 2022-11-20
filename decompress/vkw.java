import android.os.Parcel;
import java.util.Arrays;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vkw extends rd
{
    public static final Parcelable$Creator<vkw> CREATOR;
    public final boolean D0;
    
    static {
        CREATOR = (Parcelable$Creator)new eay();
    }
    
    public vkw(final boolean d0) {
        this.D0 = d0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof vkw && this.D0 == ((vkw)o).D0;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.D0 });
    }
    
    public final void writeToParcel(final Parcel parcel, int d1) {
        d1 = fli.d1(parcel, 20293);
        fli.K0(parcel, 1, this.D0);
        fli.g1(parcel, d1);
    }
}
