import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class myd extends h5d
{
    public static final Parcelable$Creator<myd> CREATOR;
    public final String G0;
    public final String H0;
    public final String I0;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<myd>() {
            public final Object createFromParcel(final Parcel parcel) {
                return new myd(parcel);
            }
            
            public final Object[] newArray(final int n) {
                return new myd[n];
            }
        };
    }
    
    public myd(final Parcel parcel) {
        super("----");
        final String string = parcel.readString();
        final int a = rnw.a;
        this.G0 = string;
        this.H0 = parcel.readString();
        this.I0 = parcel.readString();
    }
    
    public myd(final String g0, final String h0, final String i0) {
        super("----");
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
        if (o != null && myd.class == o.getClass()) {
            final myd myd = (myd)o;
            if (!rnw.a((Object)this.H0, (Object)myd.H0) || !rnw.a((Object)this.G0, (Object)myd.G0) || !rnw.a((Object)this.I0, (Object)myd.I0)) {
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
        final StringBuilder k = tf8.k(l58.g(h0, l58.g(g0, l58.g(f0, 23))), f0, ": domain=", g0, ", description=");
        k.append(h0);
        return k.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(super.F0);
        parcel.writeString(this.G0);
        parcel.writeString(this.I0);
    }
}
