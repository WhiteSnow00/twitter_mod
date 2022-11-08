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

public final class jca implements x8h$b
{
    public static final Parcelable$Creator<jca> CREATOR;
    public static final n I0;
    public static final n J0;
    public final String C0;
    public final String D0;
    public final long E0;
    public final long F0;
    public final byte[] G0;
    public int H0;
    
    static {
        final n$a n$a = new n$a();
        n$a.k = "application/id3";
        I0 = n$a.a();
        final n$a n$a2 = new n$a();
        n$a2.k = "application/x-scte35";
        J0 = n$a2.a();
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<jca>() {
            public final Object createFromParcel(final Parcel parcel) {
                return new jca(parcel);
            }
            
            public final Object[] newArray(final int n) {
                return new jca[n];
            }
        };
    }
    
    public jca(final Parcel parcel) {
        final String string = parcel.readString();
        final int a = imw.a;
        this.C0 = string;
        this.D0 = parcel.readString();
        this.E0 = parcel.readLong();
        this.F0 = parcel.readLong();
        this.G0 = parcel.createByteArray();
    }
    
    public jca(final String c0, final String d0, final long e0, final long f0, final byte[] g0) {
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
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
        if (o != null && jca.class == o.getClass()) {
            final jca jca = (jca)o;
            if (this.E0 != jca.E0 || this.F0 != jca.F0 || !imw.a((Object)this.C0, (Object)jca.C0) || !imw.a((Object)this.D0, (Object)jca.D0) || !Arrays.equals(this.G0, jca.G0)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        if (this.H0 == 0) {
            final String c0 = this.C0;
            int hashCode = 0;
            int hashCode2;
            if (c0 != null) {
                hashCode2 = c0.hashCode();
            }
            else {
                hashCode2 = 0;
            }
            final String d0 = this.D0;
            if (d0 != null) {
                hashCode = d0.hashCode();
            }
            final long e0 = this.E0;
            final int n = (int)(e0 ^ e0 >>> 32);
            final long f0 = this.F0;
            this.H0 = Arrays.hashCode(this.G0) + ((((527 + hashCode2) * 31 + hashCode) * 31 + n) * 31 + (int)(f0 ^ f0 >>> 32)) * 31;
        }
        return this.H0;
    }
    
    public final n r0() {
        final String c0 = this.C0;
        Objects.requireNonNull(c0);
        final int hashCode = c0.hashCode();
        int n = -1;
        switch (hashCode) {
            case 1303648457: {
                if (!c0.equals("https://developer.apple.com/streaming/emsg-id3")) {
                    break;
                }
                n = 2;
                break;
            }
            case -795945609: {
                if (!c0.equals("https://aomedia.org/emsg/ID3")) {
                    break;
                }
                n = 1;
                break;
            }
            case -1468477611: {
                if (!c0.equals("urn:scte:scte35:2014:bin")) {
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
                return jca.I0;
            }
            case 0: {
                return jca.J0;
            }
        }
    }
    
    @Override
    public final String toString() {
        final String c0 = this.C0;
        final long f0 = this.F0;
        final long e0 = this.E0;
        final String d0 = this.D0;
        final StringBuilder sb = new StringBuilder(dia.o(d0, dia.o(c0, 79)));
        sb.append("EMSG: scheme=");
        sb.append(c0);
        sb.append(", id=");
        sb.append(f0);
        c0.G(sb, ", durationMs=", e0, ", value=");
        sb.append(d0);
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.C0);
        parcel.writeString(this.D0);
        parcel.writeLong(this.E0);
        parcel.writeLong(this.F0);
        parcel.writeByteArray(this.G0);
    }
    
    public final byte[] y3() {
        byte[] g0;
        if (this.r0() != null) {
            g0 = this.G0;
        }
        else {
            g0 = null;
        }
        return g0;
    }
}
