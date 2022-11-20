import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import com.google.android.exoplayer2.ParserException;
import java.util.List;
import com.google.android.exoplayer2.n;
import com.google.android.exoplayer2.n$a;
import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eoj extends ijr
{
    public static final byte[] n;
    public static final byte[] o;
    
    static {
        n = new byte[] { 79, 112, 117, 115, 72, 101, 97, 100 };
        o = new byte[] { 79, 112, 117, 115, 84, 97, 103, 115 };
    }
    
    public static boolean f(final rwj rwj, final byte[] array) {
        final int c = rwj.c;
        final int b = rwj.b;
        if (c - b < array.length) {
            return false;
        }
        final byte[] array2 = new byte[array.length];
        rwj.d(array2, 0, array.length);
        rwj.D(b);
        return Arrays.equals(array2, array);
    }
    
    @Override
    public final long c(final rwj rwj) {
        final byte[] a = rwj.a;
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
    @Override
    public final boolean d(final rwj rwj, final long n, final a a) throws ParserException {
        final boolean f = f(rwj, eoj.n);
        boolean b = false;
        if (f) {
            final byte[] copy = Arrays.copyOf(rwj.a, rwj.c);
            final byte b2 = copy[9];
            final List l = uoz.l(copy);
            if (a.a == null) {
                b = true;
            }
            omy.k(b);
            final n$a n$a = new n$a();
            n$a.k = "audio/opus";
            n$a.x = (b2 & 0xFF);
            n$a.y = 48000;
            n$a.m = l;
            a.a = new n(n$a);
            return true;
        }
        if (!f(rwj, eoj.o)) {
            omy.m((Object)a.a);
            return false;
        }
        omy.m((Object)a.a);
        rwj.E(8);
        final z8h b3 = rhx.b(edd.r(rhx.c(rwj, false, false).a));
        if (b3 == null) {
            return true;
        }
        final n$a n$a2 = new n$a(a.a);
        n$a2.i = b3.b(a.a.M0);
        a.a = new n(n$a2);
        return true;
    }
}
