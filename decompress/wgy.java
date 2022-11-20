import android.os.Parcel;
import java.util.Objects;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wgy extends rd
{
    public static final Parcelable$Creator<wgy> CREATOR;
    public final String D0;
    public final kgy E0;
    public final String F0;
    public final long G0;
    
    static {
        CREATOR = (Parcelable$Creator)new chy();
    }
    
    public wgy(final String d0, final kgy e0, final String f0, final long g0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public wgy(final wgy wgy, final long g0) {
        Objects.requireNonNull(wgy, "null reference");
        this.D0 = wgy.D0;
        this.E0 = wgy.E0;
        this.F0 = wgy.F0;
        this.G0 = g0;
    }
    
    @Override
    public final String toString() {
        final String f0 = this.F0;
        final String d0 = this.D0;
        final String value = String.valueOf(this.E0);
        final StringBuilder q = tqf.q("origin=", f0, ",name=", d0, ",params=");
        q.append(value);
        return q.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        chy.a(this, parcel, n);
    }
}
