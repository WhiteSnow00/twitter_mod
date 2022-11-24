import java.util.Arrays;
import java.io.IOException;
import java.io.Closeable;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class jie implements Closeable
{
    public static final String[] J0;
    public int F0;
    public int[] G0;
    public String[] H0;
    public int[] I0;
    
    static {
        J0 = new String[128];
        for (int i = 0; i <= 31; ++i) {
            jie.J0[i] = String.format("\\u%04x", i);
        }
        final String[] j0 = jie.J0;
        j0[34] = "\\\"";
        j0[92] = "\\\\";
        j0[9] = "\\t";
        j0[8] = "\\b";
        j0[10] = "\\n";
        j0[13] = "\\r";
        j0[12] = "\\f";
    }
    
    public jie() {
        this.G0 = new int[32];
        this.H0 = new String[32];
        this.I0 = new int[32];
    }
    
    public abstract boolean K1() throws IOException;
    
    public abstract String N0() throws IOException;
    
    public abstract int Q0() throws IOException;
    
    public abstract String S1() throws IOException;
    
    public abstract int V2() throws IOException;
    
    public abstract void a() throws IOException;
    
    public abstract void b() throws IOException;
    
    public abstract void c() throws IOException;
    
    public abstract void d() throws IOException;
    
    public final void e(final int n) {
        final int f0 = this.F0;
        final int[] g0 = this.G0;
        if (f0 == g0.length) {
            if (f0 == 256) {
                final StringBuilder f2 = ehk.f("Nesting too deep at ");
                f2.append(this.s());
                throw new xee(f2.toString());
            }
            this.G0 = Arrays.copyOf(g0, g0.length * 2);
            final String[] h0 = this.H0;
            this.H0 = Arrays.copyOf(h0, h0.length * 2);
            final int[] i0 = this.I0;
            this.I0 = Arrays.copyOf(i0, i0.length * 2);
        }
        this.G0[this.F0++] = n;
    }
    
    public abstract int f(final a p0) throws IOException;
    
    public abstract void h() throws IOException;
    
    public abstract void h0() throws IOException;
    
    public abstract boolean hasNext() throws IOException;
    
    public final nfe i(final String s) throws nfe {
        final StringBuilder n = a88.n(s, " at path ");
        n.append(this.s());
        throw new nfe(n.toString());
    }
    
    public abstract double n2() throws IOException;
    
    public final String s() {
        final int f0 = this.F0;
        final int[] g0 = this.G0;
        final String[] h0 = this.H0;
        final int[] i0 = this.I0;
        final StringBuilder a = po.A('$');
        for (int j = 0; j < f0; ++j) {
            final int n = g0[j];
            if (n != 1 && n != 2) {
                if (n == 3 || n == 4 || n == 5) {
                    a.append('.');
                    if (h0[j] != null) {
                        a.append(h0[j]);
                    }
                }
            }
            else {
                a.append('[');
                a.append(i0[j]);
                a.append(']');
            }
        }
        return a.toString();
    }
    
    public static final class a
    {
        public final String[] a;
        public final soj b;
        
        public a(final String[] a, final soj b) {
            this.a = a;
            this.b = b;
        }
        
        public static a a(final String... array) {
            try {
                final a73[] array2 = new a73[array.length];
                final cr2 cr2 = new cr2();
                for (int i = 0; i < array.length; ++i) {
                    final String s = array[i];
                    final String[] j0 = jie.J0;
                    cr2.m0(34);
                    final int length = s.length();
                    int k = 0;
                    int n = 0;
                    while (k < length) {
                        final char char1 = s.charAt(k);
                        int n2 = 0;
                        Label_0159: {
                            String s2;
                            if (char1 < '\u0080') {
                                if ((s2 = j0[char1]) == null) {
                                    n2 = n;
                                    break Label_0159;
                                }
                            }
                            else if (char1 == '\u2028') {
                                s2 = "\\u2028";
                            }
                            else {
                                n2 = n;
                                if (char1 != '\u2029') {
                                    break Label_0159;
                                }
                                s2 = "\\u2029";
                            }
                            if (n < k) {
                                cr2.A0(s, n, k);
                            }
                            cr2.x0(s2);
                            n2 = k + 1;
                        }
                        ++k;
                        n = n2;
                    }
                    if (n < length) {
                        cr2.A0(s, n, length);
                    }
                    cr2.m0(34);
                    cr2.readByte();
                    array2[i] = cr2.S2();
                }
                return new a(array.clone(), soj.Companion.b(array2));
            }
            catch (final IOException ex) {
                throw new AssertionError((Object)ex);
            }
        }
    }
}
