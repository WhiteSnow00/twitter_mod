import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hyd extends c5d
{
    public static final Parcelable$Creator<hyd> CREATOR;
    public final String D0;
    public final String E0;
    public final String F0;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<hyd>() {
            public final Object createFromParcel(final Parcel parcel) {
                return new hyd(parcel);
            }
            
            public final Object[] newArray(final int n) {
                return new hyd[n];
            }
        };
    }
    
    public hyd(final Parcel parcel) {
        super("----");
        final String string = parcel.readString();
        final int a = imw.a;
        this.D0 = string;
        this.E0 = parcel.readString();
        this.F0 = parcel.readString();
    }
    
    public hyd(final String d0, final String e0, final String f0) {
        super("----");
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && hyd.class == o.getClass()) {
            final hyd hyd = (hyd)o;
            if (!imw.a((Object)this.E0, (Object)hyd.E0) || !imw.a((Object)this.D0, (Object)hyd.D0) || !imw.a((Object)this.F0, (Object)hyd.F0)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final String d0 = this.D0;
        int hashCode = 0;
        int hashCode2;
        if (d0 != null) {
            hashCode2 = d0.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final String e0 = this.E0;
        int hashCode3;
        if (e0 != null) {
            hashCode3 = e0.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        final String f0 = this.F0;
        if (f0 != null) {
            hashCode = f0.hashCode();
        }
        return ((527 + hashCode2) * 31 + hashCode3) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final String c0 = super.C0;
        final String d0 = this.D0;
        final String e0 = this.E0;
        final StringBuilder n = xpa.n(dia.o(e0, dia.o(d0, dia.o(c0, 23))), c0, ": domain=", d0, ", description=");
        n.append(e0);
        return n.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(super.C0);
        parcel.writeString(this.D0);
        parcel.writeString(this.F0);
    }
}
