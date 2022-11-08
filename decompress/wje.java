import java.util.Arrays;
import java.io.Serializable;
import java.util.Map;
import java.io.IOException;
import java.util.Iterator;
import java.io.Reader;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wje extends fie
{
    public static final wje$a V0;
    public static final Object W0;
    public Object[] R0;
    public int S0;
    public String[] T0;
    public int[] U0;
    
    static {
        V0 = new wje$a();
        W0 = new Object();
    }
    
    public wje(final afe afe) {
        super((Reader)wje.V0);
        this.R0 = new Object[32];
        this.S0 = 0;
        this.T0 = new String[32];
        this.U0 = new int[32];
        this.m0(afe);
    }
    
    private String i(final boolean b) {
        final StringBuilder l = ffa.l('$');
        int n = 0;
        while (true) {
            final int s0 = this.S0;
            if (n >= s0) {
                break;
            }
            final Object[] r0 = this.R0;
            int n2;
            if (r0[n] instanceof gde) {
                n2 = ++n;
                if (n < s0) {
                    n2 = n;
                    if (r0[n] instanceof Iterator) {
                        int n4;
                        final int n3 = n4 = this.U0[n];
                        Label_0112: {
                            if (b && (n4 = n3) > 0) {
                                if (n != s0 - 1) {
                                    n4 = n3;
                                    if (n != s0 - 2) {
                                        break Label_0112;
                                    }
                                }
                                n4 = n3 - 1;
                            }
                        }
                        l.append('[');
                        l.append(n4);
                        l.append(']');
                        n2 = n;
                    }
                }
            }
            else {
                n2 = n;
                if (r0[n] instanceof che) {
                    n2 = ++n;
                    if (n < s0) {
                        n2 = n;
                        if (r0[n] instanceof Iterator) {
                            l.append('.');
                            final String[] t0 = this.T0;
                            n2 = n;
                            if (t0[n] != null) {
                                l.append(t0[n]);
                                n2 = n;
                            }
                        }
                    }
                }
            }
            n = n2 + 1;
        }
        return l.toString();
    }
    
    private String m() {
        final StringBuilder g = w48.g(" at path ");
        g.append(this.i(false));
        return g.toString();
    }
    
    @Override
    public final boolean K1() throws IOException {
        this.W(8);
        final boolean g = ((she)this.i0()).g();
        int s0 = this.S0;
        if (s0 > 0) {
            final int[] u0 = this.U0;
            --s0;
            ++u0[s0];
        }
        return g;
    }
    
    @Override
    public final void K2() throws IOException {
        this.W(9);
        this.i0();
        int s0 = this.S0;
        if (s0 > 0) {
            final int[] u0 = this.U0;
            --s0;
            ++u0[s0];
        }
    }
    
    @Override
    public final String N0() throws IOException {
        this.W(5);
        final Map.Entry<String, V> entry = ((Iterator)this.Z()).next();
        final String s = entry.getKey();
        this.T0[this.S0 - 1] = s;
        this.m0(entry.getValue());
        return s;
    }
    
    @Override
    public final int Q0() throws IOException {
        final int v2 = this.V2();
        if (v2 != 7 && v2 != 6) {
            final StringBuilder g = w48.g("Expected ");
            g.append(p88.l(7));
            g.append(" but was ");
            g.append(p88.l(v2));
            g.append(this.m());
            throw new IllegalStateException(g.toString());
        }
        final she she = (she)this.Z();
        int n;
        if (she.a instanceof Number) {
            n = she.i().intValue();
        }
        else {
            n = Integer.parseInt(she.j());
        }
        this.i0();
        int s0 = this.S0;
        if (s0 > 0) {
            final int[] u0 = this.U0;
            --s0;
            ++u0[s0];
        }
        return n;
    }
    
    @Override
    public final String S1() throws IOException {
        final int v2 = this.V2();
        if (v2 != 6 && v2 != 7) {
            final StringBuilder g = w48.g("Expected ");
            g.append(p88.l(6));
            g.append(" but was ");
            g.append(p88.l(v2));
            g.append(this.m());
            throw new IllegalStateException(g.toString());
        }
        final String j = ((she)this.i0()).j();
        int s0 = this.S0;
        if (s0 > 0) {
            final int[] u0 = this.U0;
            --s0;
            ++u0[s0];
        }
        return j;
    }
    
    @Override
    public final int V2() throws IOException {
        if (this.S0 == 0) {
            return 10;
        }
        final Object z = this.Z();
        if (z instanceof Iterator) {
            final boolean b = this.R0[this.S0 - 2] instanceof che;
            final Iterator iterator = (Iterator)z;
            if (!iterator.hasNext()) {
                int n;
                if (b) {
                    n = 4;
                }
                else {
                    n = 2;
                }
                return n;
            }
            if (b) {
                return 5;
            }
            this.m0(iterator.next());
            return this.V2();
        }
        else {
            if (z instanceof che) {
                return 3;
            }
            if (z instanceof gde) {
                return 1;
            }
            if (z instanceof she) {
                final Serializable a = ((she)z).a;
                if (a instanceof String) {
                    return 6;
                }
                if (a instanceof Boolean) {
                    return 8;
                }
                if (a instanceof Number) {
                    return 7;
                }
                throw new AssertionError();
            }
            else {
                if (z instanceof ahe) {
                    return 9;
                }
                if (z == wje.W0) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                throw new AssertionError();
            }
        }
    }
    
    public final void W(final int n) throws IOException {
        if (this.V2() == n) {
            return;
        }
        final StringBuilder g = w48.g("Expected ");
        g.append(p88.l(n));
        g.append(" but was ");
        g.append(p88.l(this.V2()));
        g.append(this.m());
        throw new IllegalStateException(g.toString());
    }
    
    public final Object Z() {
        return this.R0[this.S0 - 1];
    }
    
    @Override
    public final void a() throws IOException {
        this.W(1);
        this.m0(((gde)this.Z()).iterator());
        this.U0[this.S0 - 1] = 0;
    }
    
    @Override
    public final void b() throws IOException {
        this.W(3);
        this.m0(new oif$b$a((oif$b)((che)this.Z()).a.entrySet()));
    }
    
    @Override
    public final void close() throws IOException {
        this.R0 = new Object[] { wje.W0 };
        this.S0 = 1;
    }
    
    @Override
    public final void e() throws IOException {
        this.W(2);
        this.i0();
        this.i0();
        int s0 = this.S0;
        if (s0 > 0) {
            final int[] u0 = this.U0;
            --s0;
            ++u0[s0];
        }
    }
    
    @Override
    public final void f() throws IOException {
        this.W(4);
        this.i0();
        this.i0();
        int s0 = this.S0;
        if (s0 > 0) {
            final int[] u0 = this.U0;
            --s0;
            ++u0[s0];
        }
    }
    
    @Override
    public final void h0() throws IOException {
        if (this.V2() == 5) {
            this.N0();
            this.T0[this.S0 - 2] = "null";
        }
        else {
            this.i0();
            final int s0 = this.S0;
            if (s0 > 0) {
                this.T0[s0 - 1] = "null";
            }
        }
        int s2 = this.S0;
        if (s2 > 0) {
            final int[] u0 = this.U0;
            --s2;
            ++u0[s2];
        }
    }
    
    @Override
    public final boolean hasNext() throws IOException {
        final int v2 = this.V2();
        return v2 != 4 && v2 != 2 && v2 != 10;
    }
    
    public final Object i0() {
        final Object[] r0 = this.R0;
        final int s0 = this.S0 - 1;
        this.S0 = s0;
        final Object o = r0[s0];
        r0[s0] = null;
        return o;
    }
    
    @Override
    public final String j() {
        return this.i(true);
    }
    
    public final void m0(final Object o) {
        final int s0 = this.S0;
        final Object[] r0 = this.R0;
        if (s0 == r0.length) {
            final int n = s0 * 2;
            this.R0 = Arrays.copyOf(r0, n);
            this.U0 = Arrays.copyOf(this.U0, n);
            this.T0 = Arrays.copyOf(this.T0, n);
        }
        this.R0[this.S0++] = o;
    }
    
    @Override
    public final double n2() throws IOException {
        final int v2 = this.V2();
        if (v2 != 7 && v2 != 6) {
            final StringBuilder g = w48.g("Expected ");
            g.append(p88.l(7));
            g.append(" but was ");
            g.append(p88.l(v2));
            g.append(this.m());
            throw new IllegalStateException(g.toString());
        }
        final she she = (she)this.Z();
        double n;
        if (she.a instanceof Number) {
            n = she.i().doubleValue();
        }
        else {
            n = Double.parseDouble(she.j());
        }
        if (!super.D0 && (Double.isNaN(n) || Double.isInfinite(n))) {
            final StringBuilder sb = new StringBuilder();
            sb.append("JSON forbids NaN and infinities: ");
            sb.append(n);
            throw new NumberFormatException(sb.toString());
        }
        this.i0();
        int s0 = this.S0;
        if (s0 > 0) {
            final int[] u0 = this.U0;
            --s0;
            ++u0[s0];
        }
        return n;
    }
    
    @Override
    public final long n3() throws IOException {
        final int v2 = this.V2();
        if (v2 != 7 && v2 != 6) {
            final StringBuilder g = w48.g("Expected ");
            g.append(p88.l(7));
            g.append(" but was ");
            g.append(p88.l(v2));
            g.append(this.m());
            throw new IllegalStateException(g.toString());
        }
        final she she = (she)this.Z();
        long n;
        if (she.a instanceof Number) {
            n = she.i().longValue();
        }
        else {
            n = Long.parseLong(she.j());
        }
        this.i0();
        int s0 = this.S0;
        if (s0 > 0) {
            final int[] u0 = this.U0;
            --s0;
            ++u0[s0];
        }
        return n;
    }
    
    @Override
    public final String r() {
        return this.i(false);
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(wje.class.getSimpleName());
        sb.append(this.m());
        return sb.toString();
    }
}
