import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import com.google.android.exoplayer2.ParserException;
import java.util.List;
import com.google.android.exoplayer2.n;
import com.google.android.exoplayer2.n$a;
import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class toj extends ekr
{
    public static final byte[] n;
    public static final byte[] o;
    
    static {
        n = new byte[] { 79, 112, 117, 115, 72, 101, 97, 100 };
        o = new byte[] { 79, 112, 117, 115, 84, 97, 103, 115 };
    }
    
    public static boolean f(final gxj gxj, final byte[] array) {
        final int c = gxj.c;
        final int b = gxj.b;
        if (c - b < array.length) {
            return false;
        }
        final byte[] array2 = new byte[array.length];
        gxj.d(array2, 0, array.length);
        gxj.D(b);
        return Arrays.equals(array2, array);
    }
    
    public final long c(final gxj gxj) {
        final byte[] a = gxj.a;
        final int n = a[0] & 0xFF;
        final int n2 = n & 0x3;
        final int n3 = 2;
        int n4;
        if (n2 != 0) {
            n4 = n3;
            if (n2 != 1) {
                n4 = n3;
                if (n2 != 2) {
                    n4 = (a[1] & 0x3F);
                }
            }
        }
        else {
            n4 = 1;
        }
        final int n5 = n >> 3;
        final int n6 = n5 & 0x3;
        int n7;
        if (n5 >= 16) {
            n7 = 2500 << n6;
        }
        else if (n5 >= 12) {
            n7 = 10000 << (n6 & 0x1);
        }
        else if (n6 == 3) {
            n7 = 60000;
        }
        else {
            n7 = 10000 << n6;
        }
        return this.a(n4 * (long)n7);
    }
    
    @EnsuresNonNullIf(expression = { "#3.format" }, result = false)
    public final boolean d(final gxj gxj, final long n, final ekr$a ekr$a) throws ParserException {
        final boolean f = f(gxj, toj.n);
        boolean b = false;
        if (f) {
            final byte[] copy = Arrays.copyOf(gxj.a, gxj.c);
            final byte b2 = copy[9];
            final List a = xd.A(copy);
            if (ekr$a.a == null) {
                b = true;
            }
            omi.p(b);
            final n$a n$a = new n$a();
            n$a.k = "audio/opus";
            n$a.x = (b2 & 0xFF);
            n$a.y = 48000;
            n$a.m = a;
            ekr$a.a = new n(n$a);
            return true;
        }
        if (!f(gxj, toj.o)) {
            omi.r((Object)ekr$a.a);
            return false;
        }
        omi.r((Object)ekr$a.a);
        gxj.E(8);
        final q9h b3 = hix.b((List)eed.r(hix.c(gxj, false, false).a));
        if (b3 == null) {
            return true;
        }
        final n$a n$a2 = new n$a(ekr$a.a);
        n$a2.i = b3.b(ekr$a.a.O0);
        ekr$a.a = new n(n$a2);
        return true;
    }
}
