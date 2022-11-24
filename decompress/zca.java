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

public final class zca implements q9h$b
{
    public static final Parcelable$Creator<zca> CREATOR;
    public static final n L0;
    public static final n M0;
    public final String F0;
    public final String G0;
    public final long H0;
    public final long I0;
    public final byte[] J0;
    public int K0;
    
    static {
        final n$a n$a = new n$a();
        n$a.k = "application/id3";
        L0 = n$a.a();
        final n$a n$a2 = new n$a();
        n$a2.k = "application/x-scte35";
        M0 = n$a2.a();
        CREATOR = (Parcelable$Creator)new zca$a();
    }
    
    public zca(final Parcel parcel) {
        final String string = parcel.readString();
        final int a = rnw.a;
        this.F0 = string;
        this.G0 = parcel.readString();
        this.H0 = parcel.readLong();
        this.I0 = parcel.readLong();
        this.J0 = parcel.createByteArray();
    }
    
    public zca(final String f0, final String g0, final long h0, final long i0, final byte[] j0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
    }
    
    public final void P1(final r$a r$a) {
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
        if (o != null && zca.class == o.getClass()) {
            final zca zca = (zca)o;
            if (this.H0 != zca.H0 || this.I0 != zca.I0 || !rnw.a((Object)this.F0, (Object)zca.F0) || !rnw.a((Object)this.G0, (Object)zca.G0) || !Arrays.equals(this.J0, zca.J0)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        if (this.K0 == 0) {
            final String f0 = this.F0;
            int hashCode = 0;
            int hashCode2;
            if (f0 != null) {
                hashCode2 = f0.hashCode();
            }
            else {
                hashCode2 = 0;
            }
            final String g0 = this.G0;
            if (g0 != null) {
                hashCode = g0.hashCode();
            }
            final long h0 = this.H0;
            final int n = (int)(h0 ^ h0 >>> 32);
            final long i0 = this.I0;
            this.K0 = Arrays.hashCode(this.J0) + ((((527 + hashCode2) * 31 + hashCode) * 31 + n) * 31 + (int)(i0 ^ i0 >>> 32)) * 31;
        }
        return this.K0;
    }
    
    public final n r0() {
        final String f0 = this.F0;
        Objects.requireNonNull(f0);
        final int hashCode = f0.hashCode();
        int n = -1;
        switch (hashCode) {
            case 1303648457: {
                if (!f0.equals("https://developer.apple.com/streaming/emsg-id3")) {
                    break;
                }
                n = 2;
                break;
            }
            case -795945609: {
                if (!f0.equals("https://aomedia.org/emsg/ID3")) {
                    break;
                }
                n = 1;
                break;
            }
            case -1468477611: {
                if (!f0.equals("urn:scte:scte35:2014:bin")) {
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
                return zca.L0;
            }
            case 0: {
                return zca.M0;
            }
        }
    }
    
    @Override
    public final String toString() {
        final String f0 = this.F0;
        final long i0 = this.I0;
        final long h0 = this.H0;
        final String g0 = this.G0;
        final StringBuilder sb = new StringBuilder(l58.g(g0, l58.g(f0, 79)));
        sb.append("EMSG: scheme=");
        sb.append(f0);
        sb.append(", id=");
        sb.append(i0);
        po.E(sb, ", durationMs=", h0, ", value=");
        sb.append(g0);
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.F0);
        parcel.writeString(this.G0);
        parcel.writeLong(this.H0);
        parcel.writeLong(this.I0);
        parcel.writeByteArray(this.J0);
    }
    
    public final byte[] y3() {
        byte[] j0;
        if (this.r0() != null) {
            j0 = this.J0;
        }
        else {
            j0 = null;
        }
        return j0;
    }
}
