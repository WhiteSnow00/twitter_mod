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
    public final String C0;
    
    static {
        CREATOR = (Parcelable$Creator)new cwz();
    }
    
    public kxa(final String c0) {
        Objects.requireNonNull(c0, "null reference");
        this.C0 = c0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof kxa && this.C0.equals(((kxa)o).C0);
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.C0 });
    }
    
    public final void writeToParcel(final Parcel parcel, int x0) {
        x0 = ri4.x0(parcel, 20293);
        ri4.s0(parcel, 2, this.C0);
        ri4.A0(parcel, x0);
    }
}
