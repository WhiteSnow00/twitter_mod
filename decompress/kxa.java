import android.os.Parcel;
import java.util.Arrays;
import java.util.Objects;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kxa extends sd
{
    public static final Parcelable$Creator<kxa> CREATOR;
    public final String F0;
    
    static {
        CREATOR = (Parcelable$Creator)new nxz();
    }
    
    public kxa(final String f0) {
        Objects.requireNonNull(f0, "null reference");
        this.F0 = f0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof kxa && this.F0.equals(((kxa)o).F0);
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.F0 });
    }
    
    public final void writeToParcel(final Parcel parcel, int x1) {
        x1 = xd.x1(parcel, 20293);
        xd.s1(parcel, 2, this.F0);
        xd.B1(parcel, x1);
    }
}
