import android.os.Parcel;
import java.util.Objects;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rhy extends sd
{
    public static final Parcelable$Creator<rhy> CREATOR;
    public final String F0;
    public final fhy G0;
    public final String H0;
    public final long I0;
    
    static {
        CREATOR = (Parcelable$Creator)new why();
    }
    
    public rhy(final String f0, final fhy g0, final String h0, final long i0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
    }
    
    public rhy(final rhy rhy, final long i0) {
        Objects.requireNonNull(rhy, "null reference");
        this.F0 = rhy.F0;
        this.G0 = rhy.G0;
        this.H0 = rhy.H0;
        this.I0 = i0;
    }
    
    @Override
    public final String toString() {
        final String h0 = this.H0;
        final String f0 = this.F0;
        final String value = String.valueOf(this.G0);
        final StringBuilder k = l58.k("origin=", h0, ",name=", f0, ",params=");
        k.append(value);
        return k.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        why.a(this, parcel, n);
    }
}
