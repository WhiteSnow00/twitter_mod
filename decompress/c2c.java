import java.util.Arrays;
import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class c2c extends h5d
{
    public static final Parcelable$Creator<c2c> CREATOR;
    public final String G0;
    public final String H0;
    public final String I0;
    public final byte[] J0;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<c2c>() {
            public final Object createFromParcel(final Parcel parcel) {
                return new c2c(parcel);
            }
            
            public final Object[] newArray(final int n) {
                return new c2c[n];
            }
        };
    }
    
    public c2c(final Parcel parcel) {
        super("GEOB");
        final String string = parcel.readString();
        final int a = rnw.a;
        this.G0 = string;
        this.H0 = parcel.readString();
        this.I0 = parcel.readString();
        this.J0 = parcel.createByteArray();
    }
    
    public c2c(final String g0, final String h0, final String i0, final byte[] j0) {
        super("GEOB");
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && c2c.class == o.getClass()) {
            final c2c c2c = (c2c)o;
            if (!rnw.a((Object)this.G0, (Object)c2c.G0) || !rnw.a((Object)this.H0, (Object)c2c.H0) || !rnw.a((Object)this.I0, (Object)c2c.I0) || !Arrays.equals(this.J0, c2c.J0)) {
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
        return Arrays.hashCode(this.J0) + (((527 + hashCode2) * 31 + hashCode3) * 31 + hashCode) * 31;
    }
    
    @Override
    public final String toString() {
        final String f0 = super.F0;
        final String g0 = this.G0;
        final String h0 = this.H0;
        final String i0 = this.I0;
        return wa0.y(tf8.k(l58.g(i0, l58.g(h0, l58.g(g0, l58.g(f0, 36)))), f0, ": mimeType=", g0, ", filename="), h0, ", description=", i0);
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.G0);
        parcel.writeString(this.H0);
        parcel.writeString(this.I0);
        parcel.writeByteArray(this.J0);
    }
}
