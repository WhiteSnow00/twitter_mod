import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zwj implements Parcelable
{
    public static final Parcelable$Creator<zwj> CREATOR;
    public static final alp<zwj> L0;
    public final long C0;
    public final long D0;
    public final long E0;
    public final long F0;
    public final String G0;
    public final hfv H0;
    public final int I0;
    public final String J0;
    public final boolean K0;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<zwj>() {
            public final Object createFromParcel(final Parcel parcel) {
                return new zwj(parcel);
            }
            
            public final Object[] newArray(final int n) {
                return new zwj[n];
            }
        };
        zwj.L0 = new zwj.zwj$c();
    }
    
    public zwj(final Parcel parcel) {
        this.C0 = parcel.readLong();
        this.D0 = parcel.readLong();
        this.E0 = parcel.readLong();
        this.F0 = parcel.readLong();
        this.G0 = parcel.readString();
        this.H0 = (hfv)yvj.h(parcel, (alp)hfv.M1);
        this.K0 = yvj.d(parcel);
        this.I0 = parcel.readInt();
        this.J0 = parcel.readString();
    }
    
    public zwj(final zwj.zwj$b zwj$b) {
        this.C0 = zwj$b.a;
        this.D0 = zwj$b.b;
        this.E0 = zwj$b.c;
        this.F0 = zwj$b.d;
        this.G0 = zwj$b.e;
        this.H0 = zwj$b.f;
        this.I0 = zwj$b.g;
        this.J0 = zwj$b.h;
        this.K0 = zwj$b.i;
    }
    
    public static zwj a(final hfv f) {
        final zwj.zwj$b zwj$b = new zwj.zwj$b();
        zwj$b.a = f.C0;
        zwj$b.f = f;
        return (zwj)((h4j)zwj$b).e();
    }
    
    public final boolean b(final long n) {
        return this.E0 >= n && this.c(n);
    }
    
    public final boolean c(final long n) {
        return this.F0 <= n;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        final boolean b = false;
        if (this != o) {
            boolean b2 = b;
            if (!(o instanceof zwj)) {
                return b2;
            }
            final zwj zwj = (zwj)o;
            final boolean b3 = this.C0 == zwj.C0 && this.D0 == zwj.D0 && this.E0 == zwj.E0 && this.F0 == zwj.F0 && w4j.a((Object)this.G0, (Object)zwj.G0) && w4j.a((Object)this.H0, (Object)zwj.H0) && this.I0 == zwj.I0 && w4j.a((Object)this.J0, (Object)zwj.J0) && this.K0 == zwj.K0;
            b2 = b;
            if (!b3) {
                return b2;
            }
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        return w4j.n((Object)this.C0, (Object)this.D0, (Object)this.E0, (Object)this.F0, (Object)this.G0, (Object)this.H0, (Object)this.I0, (Object)this.J0, (Object)this.K0);
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeLong(this.C0);
        parcel.writeLong(this.D0);
        parcel.writeLong(this.E0);
        parcel.writeLong(this.F0);
        parcel.writeString(this.G0);
        yvj.l(parcel, (Object)this.H0, (alp)hfv.M1);
        parcel.writeInt(this.I0);
        parcel.writeString(this.J0);
        parcel.writeByte((byte)(byte)(this.K0 ? 1 : 0));
    }
}
