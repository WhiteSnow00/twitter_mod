import java.util.Collection;
import android.media.AudioTrack;
import android.media.AudioAttributes$Builder;
import android.media.AudioFormat$Builder;
import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class uy0
{
    public static final uy0 c;
    public static final uy0 d;
    public static final int[] e;
    public final int[] a;
    public final int b;
    
    static {
        c = new uy0(new int[] { 2 }, 8);
        d = new uy0(new int[] { 2, 5, 6 }, 8);
        e = new int[] { 5, 6, 18, 17, 14, 7, 8 };
    }
    
    public uy0(int[] copy, final int b) {
        if (copy != null) {
            copy = Arrays.copyOf(copy, copy.length);
            Arrays.sort(this.a = copy);
        }
        else {
            this.a = new int[0];
        }
        this.b = b;
    }
    
    public final boolean a(final int n) {
        return Arrays.binarySearch(this.a, n) >= 0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (!(o instanceof uy0)) {
            return false;
        }
        final uy0 uy0 = (uy0)o;
        if (!Arrays.equals(this.a, uy0.a) || this.b != uy0.b) {
            b = false;
        }
        return b;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(this.a) * 31 + this.b;
    }
    
    @Override
    public final String toString() {
        final int b = this.b;
        final String string = Arrays.toString(this.a);
        final StringBuilder sb = new StringBuilder(l58.g(string, 67));
        sb.append("AudioCapabilities[maxChannelCount=");
        sb.append(b);
        sb.append(", supportedEncodings=");
        sb.append(string);
        sb.append("]");
        return sb.toString();
    }
    
    public static final class a
    {
        public static int[] a() {
            final eed.b g0 = eed.G0;
            final eed.a<Object> a = new eed.a<Object>();
            for (final int encoding : uy0.e) {
                if (AudioTrack.isDirectPlaybackSupported(new AudioFormat$Builder().setChannelMask(12).setEncoding(encoding).setSampleRate(48000).build(), new AudioAttributes$Builder().setUsage(1).setContentType(3).setFlags(0).build())) {
                    a.c(encoding);
                }
            }
            a.c(2);
            return l0e.t((Collection<? extends Number>)a.f());
        }
    }
}
