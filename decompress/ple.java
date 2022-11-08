import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicInteger;
import java.math.BigInteger;
import java.math.BigDecimal;
import java.io.IOException;
import java.util.Objects;
import java.io.Writer;
import java.util.regex.Pattern;
import java.io.Flushable;
import java.io.Closeable;

// 
// Decompiled by Procyon v0.6.0
// 

public class ple implements Closeable, Flushable
{
    public static final Pattern L0;
    public static final String[] M0;
    public static final String[] N0;
    public final Writer C0;
    public int[] D0;
    public int E0;
    public String F0;
    public String G0;
    public boolean H0;
    public boolean I0;
    public String J0;
    public boolean K0;
    
    static {
        L0 = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");
        M0 = new String[128];
        for (int i = 0; i <= 31; ++i) {
            ple.M0[i] = String.format("\\u%04x", i);
        }
        final String[] m0 = ple.M0;
        m0[34] = "\\\"";
        m0[92] = "\\\\";
        m0[9] = "\\t";
        m0[8] = "\\b";
        m0[10] = "\\n";
        m0[13] = "\\r";
        m0[12] = "\\f";
        final String[] n0 = m0.clone();
        (N0 = n0)[60] = "\\u003c";
        n0[62] = "\\u003e";
        n0[38] = "\\u0026";
        n0[61] = "\\u003d";
        n0[39] = "\\u0027";
    }
    
    public ple(final Writer c0) {
        this.D0 = new int[32];
        this.E0 = 0;
        this.m(6);
        this.G0 = ":";
        this.K0 = true;
        Objects.requireNonNull(c0, "out == null");
        this.C0 = c0;
    }
    
    public ple K(final long n) throws IOException {
        this.W();
        this.a();
        this.C0.write(Long.toString(n));
        return this;
    }
    
    public ple L(final Boolean b) throws IOException {
        if (b == null) {
            return this.j();
        }
        this.W();
        this.a();
        final Writer c0 = this.C0;
        String s;
        if (b) {
            s = "true";
        }
        else {
            s = "false";
        }
        c0.write(s);
        return this;
    }
    
    public ple N(final Number n) throws IOException {
        if (n == null) {
            return this.j();
        }
        this.W();
        final String string = n.toString();
        if (!string.equals("-Infinity") && !string.equals("Infinity") && !string.equals("NaN")) {
            final Class<? extends Number> class1 = n.getClass();
            if (class1 != Integer.class && class1 != Long.class && class1 != Double.class && class1 != Float.class && class1 != Byte.class && class1 != Short.class && class1 != BigDecimal.class && class1 != BigInteger.class && class1 != AtomicInteger.class && class1 != AtomicLong.class) {
                if (!ple.L0.matcher(string).matches()) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("String created by ");
                    sb.append(class1);
                    sb.append(" is not a valid JSON number: ");
                    sb.append(string);
                    throw new IllegalArgumentException(sb.toString());
                }
            }
        }
        else if (!this.H0) {
            throw new IllegalArgumentException(l7k.c("Numeric values must be finite, but was ", string));
        }
        this.a();
        this.C0.append((CharSequence)string);
        return this;
    }
    
    public ple P(final String s) throws IOException {
        if (s == null) {
            return this.j();
        }
        this.W();
        this.a();
        this.q(s);
        return this;
    }
    
    public ple T(final boolean b) throws IOException {
        this.W();
        this.a();
        final Writer c0 = this.C0;
        String s;
        if (b) {
            s = "true";
        }
        else {
            s = "false";
        }
        c0.write(s);
        return this;
    }
    
    public final void W() throws IOException {
        if (this.J0 != null) {
            final int k = this.k();
            if (k == 5) {
                this.C0.write(44);
            }
            else if (k != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            this.i();
            this.p(4);
            this.q(this.J0);
            this.J0 = null;
        }
    }
    
    public final void a() throws IOException {
        final int k = this.k();
        if (k != 1) {
            if (k != 2) {
                if (k != 4) {
                    if (k != 6) {
                        if (k != 7) {
                            throw new IllegalStateException("Nesting problem.");
                        }
                        if (!this.H0) {
                            throw new IllegalStateException("JSON must have only one top-level value.");
                        }
                    }
                    this.p(7);
                }
                else {
                    this.C0.append((CharSequence)this.G0);
                    this.p(5);
                }
            }
            else {
                this.C0.append(',');
                this.i();
            }
        }
        else {
            this.p(2);
            this.i();
        }
    }
    
    public ple b() throws IOException {
        this.W();
        this.a();
        this.m(1);
        this.C0.write(91);
        return this;
    }
    
    public ple c() throws IOException {
        this.W();
        this.a();
        this.m(3);
        this.C0.write(123);
        return this;
    }
    
    @Override
    public void close() throws IOException {
        this.C0.close();
        final int e0 = this.E0;
        if (e0 <= 1 && (e0 != 1 || this.D0[e0 - 1] == 7)) {
            this.E0 = 0;
            return;
        }
        throw new IOException("Incomplete document");
    }
    
    public final ple d(final int n, final int n2, final char c) throws IOException {
        final int k = this.k();
        if (k != n2 && k != n) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.J0 == null) {
            --this.E0;
            if (k == n2) {
                this.i();
            }
            this.C0.write(c);
            return this;
        }
        final StringBuilder g = w48.g("Dangling name: ");
        g.append(this.J0);
        throw new IllegalStateException(g.toString());
    }
    
    public ple e() throws IOException {
        this.d(1, 2, ']');
        return this;
    }
    
    public ple f() throws IOException {
        this.d(3, 5, '}');
        return this;
    }
    
    @Override
    public void flush() throws IOException {
        if (this.E0 != 0) {
            this.C0.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }
    
    public ple h(final String j0) throws IOException {
        Objects.requireNonNull(j0, "name == null");
        if (this.J0 != null) {
            throw new IllegalStateException();
        }
        if (this.E0 != 0) {
            this.J0 = j0;
            return this;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }
    
    public final void i() throws IOException {
        if (this.F0 == null) {
            return;
        }
        this.C0.write(10);
        for (int e0 = this.E0, i = 1; i < e0; ++i) {
            this.C0.write(this.F0);
        }
    }
    
    public ple j() throws IOException {
        if (this.J0 != null) {
            if (!this.K0) {
                this.J0 = null;
                return this;
            }
            this.W();
        }
        this.a();
        this.C0.write("null");
        return this;
    }
    
    public final int k() {
        final int e0 = this.E0;
        if (e0 != 0) {
            return this.D0[e0 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }
    
    public final void m(final int n) {
        final int e0 = this.E0;
        final int[] d0 = this.D0;
        if (e0 == d0.length) {
            this.D0 = Arrays.copyOf(d0, e0 * 2);
        }
        this.D0[this.E0++] = n;
    }
    
    public final void p(final int n) {
        this.D0[this.E0 - 1] = n;
    }
    
    public final void q(final String s) throws IOException {
        String[] array;
        if (this.I0) {
            array = ple.N0;
        }
        else {
            array = ple.M0;
        }
        this.C0.write(34);
        final int length = s.length();
        int i = 0;
        int n = 0;
        while (i < length) {
            final char char1 = s.charAt(i);
            int n2 = 0;
            Label_0152: {
                String s2;
                if (char1 < '\u0080') {
                    if ((s2 = array[char1]) == null) {
                        n2 = n;
                        break Label_0152;
                    }
                }
                else if (char1 == '\u2028') {
                    s2 = "\\u2028";
                }
                else {
                    n2 = n;
                    if (char1 != '\u2029') {
                        break Label_0152;
                    }
                    s2 = "\\u2029";
                }
                if (n < i) {
                    this.C0.write(s, n, i - n);
                }
                this.C0.write(s2);
                n2 = i + 1;
            }
            ++i;
            n = n2;
        }
        if (n < length) {
            this.C0.write(s, n, length - n);
        }
        this.C0.write(34);
    }
    
    public ple z(final double n) throws IOException {
        this.W();
        if (!this.H0 && (Double.isNaN(n) || Double.isInfinite(n))) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Numeric values must be finite, but was ");
            sb.append(n);
            throw new IllegalArgumentException(sb.toString());
        }
        this.a();
        this.C0.append((CharSequence)Double.toString(n));
        return this;
    }
}
