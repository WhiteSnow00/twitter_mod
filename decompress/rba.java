import java.util.Objects;
import java.util.Arrays;
import com.google.android.exoplayer2.r$a;
import android.os.Parcel;
import com.google.android.exoplayer2.n$a;
import com.google.android.exoplayer2.n;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rba implements z8h$b
{
    public static final Parcelable$Creator<rba> CREATOR;
    public static final n J0;
    public static final n K0;
    public final String D0;
    public final String E0;
    public final long F0;
    public final long G0;
    public final byte[] H0;
    public int I0;
    
    static {
        final n$a n$a = new n$a();
        n$a.k = "application/id3";
        J0 = n$a.a();
        final n$a n$a2 = new n$a();
        n$a2.k = "application/x-scte35";
        K0 = n$a2.a();
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<rba>() {
            public final Object createFromParcel(final Parcel parcel) {
                return new rba(parcel);
            }
            
            public final Object[] newArray(final int n) {
                return new rba[n];
            }
        };
    }
    
    public rba(final Parcel parcel) {
        final String string = parcel.readString();
        final int a = cnw.a;
        this.D0 = string;
        this.E0 = parcel.readString();
        this.F0 = parcel.readLong();
        this.G0 = parcel.readLong();
        this.H0 = parcel.createByteArray();
    }
    
    public rba(final String d0, final String e0, final long f0, final long g0, final byte[] h0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
    }
    
    public final void O1(final r$a r$a) {
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
        if (o != null && rba.class == o.getClass()) {
            final rba rba = (rba)o;
            if (this.F0 != rba.F0 || this.G0 != rba.G0 || !cnw.a(this.D0, rba.D0) || !cnw.a(this.E0, rba.E0) || !Arrays.equals(this.H0, rba.H0)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        if (this.I0 == 0) {
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
            if (e0 != null) {
                hashCode = e0.hashCode();
            }
            final long f0 = this.F0;
            final int n = (int)(f0 ^ f0 >>> 32);
            final long g0 = this.G0;
            this.I0 = Arrays.hashCode(this.H0) + ((((527 + hashCode2) * 31 + hashCode) * 31 + n) * 31 + (int)(g0 ^ g0 >>> 32)) * 31;
        }
        return this.I0;
    }
    
    public final n q0() {
        final String d0 = this.D0;
        Objects.requireNonNull(d0);
        final int hashCode = d0.hashCode();
        int n = -1;
        switch (hashCode) {
            case 1303648457: {
                if (!d0.equals("https://developer.apple.com/streaming/emsg-id3")) {
                    break;
                }
                n = 2;
                break;
            }
            case -795945609: {
                if (!d0.equals("https://aomedia.org/emsg/ID3")) {
                    break;
                }
                n = 1;
                break;
            }
            case -1468477611: {
                if (!d0.equals("urn:scte:scte35:2014:bin")) {
                    break;
                }
                n = 0;
                break;
            }
        }
        switch (n) {
            default: {
                return null;
            }
            case 1:
            case 2: {
                return rba.J0;
            }
            case 0: {
                return rba.K0;
            }
        }
    }
    
    @Override
    public final String toString() {
        final String d0 = this.D0;
        final long g0 = this.G0;
        final long f0 = this.F0;
        final String e0 = this.E0;
        final StringBuilder sb = new StringBuilder(wnj.f(e0, wnj.f(d0, 79)));
        sb.append("EMSG: scheme=");
        sb.append(d0);
        sb.append(", id=");
        sb.append(g0);
        e1.C(sb, ", durationMs=", f0, ", value=");
        sb.append(e0);
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.D0);
        parcel.writeString(this.E0);
        parcel.writeLong(this.F0);
        parcel.writeLong(this.G0);
        parcel.writeByteArray(this.H0);
    }
    
    public final byte[] x3() {
        byte[] h0;
        if (this.q0() != null) {
            h0 = this.H0;
        }
        else {
            h0 = null;
        }
        return h0;
    }
}
