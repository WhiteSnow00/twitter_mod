import android.os.Parcelable;
import tv.periscope.model.b;
import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hh2 extends oof implements vd8, wec
{
    public static final Parcelable$Creator<hh2> CREATOR;
    public final vo6 H0;
    public boolean I0;
    public boolean J0;
    public boolean K0;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<hh2>() {
            public final Object createFromParcel(final Parcel parcel) {
                return new hh2(parcel);
            }
            
            public final Object[] newArray(final int n) {
                return new hh2[n];
            }
        };
    }
    
    public hh2(final Parcel parcel) {
        super(parcel);
        this.H0 = (vo6)parcel.readParcelable(vo6.class.getClassLoader());
        final int int1 = parcel.readInt();
        final boolean b = false;
        this.J0 = (int1 == 1);
        boolean k0 = b;
        if (parcel.readInt() == 1) {
            k0 = true;
        }
        this.K0 = k0;
    }
    
    public hh2(final hh2.hh2$b hh2$b) {
        super(hh2$b.c, hh2$b.d, hh2$b.g);
        this.J0 = hh2$b.e;
        this.K0 = hh2$b.f;
        this.H0 = hh2$b.a;
        this.I0 = hh2$b.b;
    }
    
    public final mn9 a3() {
        final vo6 h0 = this.H0;
        if (h0 == null) {
            return (mn9)mn9.y;
        }
        if (ln9.a(h0)) {
            return (mn9)new hdu(this.H0);
        }
        return (mn9)new zhu(this.H0);
    }
    
    public final o0v d() {
        return (o0v)new af2(super.C0, this.H0, super.D0, hi.a().k1(), k83.a().B7());
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && hh2.class == o.getClass()) {
            final hh2 hh2 = (hh2)o;
            if (!super.equals((Object)hh2) || !w4j.a((Object)this.H0, (Object)hh2.H0)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    public final boolean g(final b b) {
        final boolean k0 = this.K0;
        boolean b2 = true;
        if (!k0 || !(b.v() ^ true)) {
            b2 = false;
        }
        return b2;
    }
    
    public final int hashCode() {
        return w4j.f((Object)this.H0) + super.hashCode();
    }
    
    public final vo6 i() {
        return this.H0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        super.writeToParcel(parcel, n);
        parcel.writeParcelable((Parcelable)this.H0, n);
        parcel.writeInt((int)(this.J0 ? 1 : 0));
        parcel.writeInt((int)(this.K0 ? 1 : 0));
    }
}
