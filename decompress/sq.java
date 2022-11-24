import java.util.Arrays;
import android.net.Uri;
import com.google.android.exoplayer2.f$a;
import com.google.android.exoplayer2.f;

// 
// Decompiled by Procyon v0.6.0
// 

public final class sq implements f
{
    public static final sq L0;
    public static final a M0;
    public static final f$a<sq> N0;
    public final Object F0;
    public final int G0;
    public final long H0;
    public final long I0;
    public final int J0;
    public final a[] K0;
    
    static {
        L0 = new sq(new a[0], 0L, -9223372036854775807L, 0);
        final a a = new a(0L, -1, new int[0], new Uri[0], new long[0], 0L, false);
        final int[] i0 = a.I0;
        final int length = i0.length;
        final int max = Math.max(0, length);
        final int[] copy = Arrays.copyOf(i0, max);
        Arrays.fill(copy, length, max, 0);
        final long[] j0 = a.J0;
        final int length2 = j0.length;
        final int max2 = Math.max(0, length2);
        final long[] copy2 = Arrays.copyOf(j0, max2);
        Arrays.fill(copy2, length2, max2, -9223372036854775807L);
        M0 = new a(a.F0, 0, copy, Arrays.copyOf(a.H0, 0), copy2, a.K0, a.L0);
        sq.N0 = lpo.O0;
    }
    
    public sq(final a[] k0, final long h0, final long i0, final int j0) {
        this.F0 = null;
        this.H0 = h0;
        this.I0 = i0;
        this.G0 = k0.length + j0;
        this.K0 = k0;
        this.J0 = j0;
    }
    
    public static String b(final int n) {
        return Integer.toString(n, 36);
    }
    
    public final a a(final int n) {
        final int j0 = this.J0;
        a m0;
        if (n < j0) {
            m0 = sq.M0;
        }
        else {
            m0 = this.K0[n - j0];
        }
        return m0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && sq.class == o.getClass()) {
            final sq sq = (sq)o;
            if (!rnw.a(this.F0, sq.F0) || this.G0 != sq.G0 || this.H0 != sq.H0 || this.I0 != sq.I0 || this.J0 != sq.J0 || !Arrays.equals(this.K0, sq.K0)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int g0 = this.G0;
        final Object f0 = this.F0;
        int hashCode;
        if (f0 == null) {
            hashCode = 0;
        }
        else {
            hashCode = f0.hashCode();
        }
        return ((((g0 * 31 + hashCode) * 31 + (int)this.H0) * 31 + (int)this.I0) * 31 + this.J0) * 31 + Arrays.hashCode(this.K0);
    }
    
    @Override
    public final String toString() {
        final StringBuilder f = ehk.f("AdPlaybackState(adsId=");
        f.append(this.F0);
        f.append(", adResumePositionUs=");
        f.append(this.H0);
        f.append(", adGroups=[");
        for (int i = 0; i < this.K0.length; ++i) {
            f.append("adGroup(timeUs=");
            f.append(this.K0[i].F0);
            f.append(", ads=[");
            for (int j = 0; j < this.K0[i].I0.length; ++j) {
                f.append("ad(state=");
                final int n = this.K0[i].I0[j];
                if (n != 0) {
                    if (n != 1) {
                        if (n != 2) {
                            if (n != 3) {
                                if (n != 4) {
                                    f.append('?');
                                }
                                else {
                                    f.append('!');
                                }
                            }
                            else {
                                f.append('P');
                            }
                        }
                        else {
                            f.append('S');
                        }
                    }
                    else {
                        f.append('R');
                    }
                }
                else {
                    f.append('_');
                }
                f.append(", durationUs=");
                f.append(this.K0[i].J0[j]);
                f.append(')');
                if (j < this.K0[i].I0.length - 1) {
                    f.append(", ");
                }
            }
            f.append("])");
            if (i < this.K0.length - 1) {
                f.append(", ");
            }
        }
        f.append("])");
        return f.toString();
    }
    
    public static final class a implements f
    {
        public static final f$a<a> M0;
        public final long F0;
        public final int G0;
        public final Uri[] H0;
        public final int[] I0;
        public final long[] J0;
        public final long K0;
        public final boolean L0;
        
        static {
            a.M0 = m71.O0;
        }
        
        public a(final long f0, final int g0, final int[] i0, final Uri[] h0, final long[] j0, final long k0, final boolean l0) {
            omi.m(i0.length == h0.length);
            this.F0 = f0;
            this.G0 = g0;
            this.I0 = i0;
            this.H0 = h0;
            this.J0 = j0;
            this.K0 = k0;
            this.L0 = l0;
        }
        
        public static String c(final int n) {
            return Integer.toString(n, 36);
        }
        
        public final int a(int n) {
            ++n;
            while (true) {
                final int[] i0 = this.I0;
                if (n >= i0.length || this.L0 || i0[n] == 0 || i0[n] == 1) {
                    break;
                }
                ++n;
            }
            return n;
        }
        
        public final boolean b() {
            if (this.G0 == -1) {
                return true;
            }
            for (int i = 0; i < this.G0; ++i) {
                final int[] i2 = this.I0;
                if (i2[i] == 0 || i2[i] == 1) {
                    return true;
                }
            }
            return false;
        }
        
        @Override
        public final boolean equals(final Object o) {
            boolean b = true;
            if (this == o) {
                return true;
            }
            if (o != null && a.class == o.getClass()) {
                final a a = (a)o;
                if (this.F0 != a.F0 || this.G0 != a.G0 || !Arrays.equals(this.H0, a.H0) || !Arrays.equals(this.I0, a.I0) || !Arrays.equals(this.J0, a.J0) || this.K0 != a.K0 || this.L0 != a.L0) {
                    b = false;
                }
                return b;
            }
            return false;
        }
        
        @Override
        public final int hashCode() {
            final int g0 = this.G0;
            final long f0 = this.F0;
            final int n = (int)(f0 ^ f0 >>> 32);
            final int hashCode = Arrays.hashCode(this.H0);
            final int hashCode2 = Arrays.hashCode(this.I0);
            final int hashCode3 = Arrays.hashCode(this.J0);
            final long k0 = this.K0;
            return ((hashCode3 + (hashCode2 + ((g0 * 31 + n) * 31 + hashCode) * 31) * 31) * 31 + (int)(k0 ^ k0 >>> 32)) * 31 + (this.L0 ? 1 : 0);
        }
    }
}
