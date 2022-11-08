import com.google.android.exoplayer2.n;
import java.util.Arrays;
import com.google.android.exoplayer2.r$a;
import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pck implements x8h$b
{
    public static final Parcelable$Creator<pck> CREATOR;
    public final int C0;
    public final String D0;
    public final String E0;
    public final int F0;
    public final int G0;
    public final int H0;
    public final int I0;
    public final byte[] J0;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<pck>() {
            public final Object createFromParcel(final Parcel parcel) {
                return new pck(parcel);
            }
            
            public final Object[] newArray(final int n) {
                return new pck[n];
            }
        };
    }
    
    public pck(final int c0, final String d0, final String e0, final int f0, final int g0, final int h0, final int i0, final byte[] j0) {
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
    }
    
    public pck(final Parcel parcel) {
        this.C0 = parcel.readInt();
        final String string = parcel.readString();
        final int a = imw.a;
        this.D0 = string;
        this.E0 = parcel.readString();
        this.F0 = parcel.readInt();
        this.G0 = parcel.readInt();
        this.H0 = parcel.readInt();
        this.I0 = parcel.readInt();
        this.J0 = parcel.createByteArray();
    }
    
    public static pck a(final mwj mwj) {
        final int e = mwj.e();
        final String r = mwj.r(mwj.e(), au3.a);
        final String q = mwj.q(mwj.e());
        final int e2 = mwj.e();
        final int e3 = mwj.e();
        final int e4 = mwj.e();
        final int e5 = mwj.e();
        final int e6 = mwj.e();
        final byte[] array = new byte[e6];
        mwj.d(array, 0, e6);
        return new pck(e, r, q, e2, e3, e4, e5, array);
    }
    
    public final void P1(final r$a r$a) {
        r$a.b(this.J0, this.C0);
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && pck.class == o.getClass()) {
            final pck pck = (pck)o;
            if (this.C0 != pck.C0 || !this.D0.equals(pck.D0) || !this.E0.equals(pck.E0) || this.F0 != pck.F0 || this.G0 != pck.G0 || this.H0 != pck.H0 || this.I0 != pck.I0 || !Arrays.equals(this.J0, pck.J0)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(this.J0) + ((((l7k.a(this.E0, l7k.a(this.D0, (this.C0 + 527) * 31, 31), 31) + this.F0) * 31 + this.G0) * 31 + this.H0) * 31 + this.I0) * 31;
    }
    
    @Override
    public final String toString() {
        final String d0 = this.D0;
        final String e0 = this.E0;
        final StringBuilder sb = new StringBuilder(dia.o(e0, dia.o(d0, 32)));
        sb.append("Picture: mimeType=");
        sb.append(d0);
        sb.append(", description=");
        sb.append(e0);
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(this.C0);
        parcel.writeString(this.D0);
        parcel.writeString(this.E0);
        parcel.writeInt(this.F0);
        parcel.writeInt(this.G0);
        parcel.writeInt(this.H0);
        parcel.writeInt(this.I0);
        parcel.writeByteArray(this.J0);
    }
}
