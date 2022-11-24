import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bt4 extends h5d
{
    public static final Parcelable$Creator<bt4> CREATOR;
    public final String G0;
    public final String H0;
    public final String I0;
    
    static {
        CREATOR = (Parcelable$Creator)new bt4$a();
    }
    
    public bt4(final Parcel parcel) {
        super("COMM");
        final String string = parcel.readString();
        final int a = rnw.a;
        this.G0 = string;
        this.H0 = parcel.readString();
        this.I0 = parcel.readString();
    }
    
    public bt4(final String g0, final String h0, final String i0) {
        super("COMM");
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && bt4.class == o.getClass()) {
            final bt4 bt4 = (bt4)o;
            if (!rnw.a((Object)this.H0, (Object)bt4.H0) || !rnw.a((Object)this.G0, (Object)bt4.G0) || !rnw.a((Object)this.I0, (Object)bt4.I0)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
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
        int hashCode3;
        if (h0 != null) {
            hashCode3 = h0.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        final String i0 = this.I0;
        if (i0 != null) {
            hashCode = i0.hashCode();
        }
        return ((527 + hashCode2) * 31 + hashCode3) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final String f0 = super.F0;
        final String g0 = this.G0;
        final String h0 = this.H0;
        final StringBuilder k = tf8.k(l58.g(h0, l58.g(g0, l58.g(f0, 25))), f0, ": language=", g0, ", description=");
        k.append(h0);
        return k.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(super.F0);
        parcel.writeString(this.G0);
        parcel.writeString(this.I0);
    }
}
