import android.os.Parcelable;
import android.os.Parcel;
import java.util.Arrays;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class m51 extends rd
{
    public static final Parcelable$Creator<m51> CREATOR;
    public final gwa D0;
    public final iqz E0;
    public final vkw F0;
    
    static {
        CREATOR = (Parcelable$Creator)new xsy();
    }
    
    public m51(final gwa d0, final iqz e0, final vkw f0) {
        this.D0 = d0;
        this.F0 = f0;
        this.E0 = e0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (!(o instanceof m51)) {
            return false;
        }
        final m51 m51 = (m51)o;
        return f5j.a(this.D0, m51.D0) && f5j.a(this.E0, m51.E0) && f5j.a(this.F0, m51.F0);
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.D0, this.E0, this.F0 });
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int d1 = fli.d1(parcel, 20293);
        fli.X0(parcel, 2, (Parcelable)this.D0, n);
        fli.X0(parcel, 3, (Parcelable)this.E0, n);
        fli.X0(parcel, 4, (Parcelable)this.F0, n);
        fli.g1(parcel, d1);
    }
}
