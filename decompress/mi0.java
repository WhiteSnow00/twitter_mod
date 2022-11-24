import java.util.Arrays;
import com.google.android.exoplayer2.r$a;
import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mi0 extends h5d
{
    public static final Parcelable$Creator<mi0> CREATOR;
    public final String G0;
    public final String H0;
    public final int I0;
    public final byte[] J0;
    
    static {
        CREATOR = (Parcelable$Creator)new mi0$a();
    }
    
    public mi0(final Parcel parcel) {
        super("APIC");
        final String string = parcel.readString();
        final int a = rnw.a;
        this.G0 = string;
        this.H0 = parcel.readString();
        this.I0 = parcel.readInt();
        this.J0 = parcel.createByteArray();
    }
    
    public mi0(final String g0, final String h0, final int i0, final byte[] j0) {
        super("APIC");
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
    }
    
    @Override
    public final void P1(final r$a r$a) {
        r$a.b(this.J0, this.I0);
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && mi0.class == o.getClass()) {
            final mi0 mi0 = (mi0)o;
            if (this.I0 != mi0.I0 || !rnw.a((Object)this.G0, (Object)mi0.G0) || !rnw.a((Object)this.H0, (Object)mi0.H0) || !Arrays.equals(this.J0, mi0.J0)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int i0 = this.I0;
        final String g0 = this.G0;
        int hashCode = 0;
        int hashCode2;
        if (g0 != null) {
            hashCode2 = g0.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final String h0 = this.H0;
        if (h0 != null) {
            hashCode = h0.hashCode();
        }
        return Arrays.hashCode(this.J0) + (((527 + i0) * 31 + hashCode2) * 31 + hashCode) * 31;
    }
    
    @Override
    public final String toString() {
        final String f0 = super.F0;
        final String g0 = this.G0;
        final String h0 = this.H0;
        final StringBuilder k = tf8.k(l58.g(h0, l58.g(g0, l58.g(f0, 25))), f0, ": mimeType=", g0, ", description=");
        k.append(h0);
        return k.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.G0);
        parcel.writeString(this.H0);
        parcel.writeInt(this.I0);
        parcel.writeByteArray(this.J0);
    }
}
