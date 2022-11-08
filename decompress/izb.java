import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicInteger;
import java.math.BigDecimal;
import java.math.BigInteger;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class izb extends tfe
{
    public int C0;
    public boolean D0;
    public ole E0;
    
    static {
        final int d0 = a.J0.D0;
        final int d2 = a.L0.D0;
        final int d3 = a.M0.D0;
    }
    
    public izb(final int c0) {
        this.C0 = c0;
        cm9 cm9;
        if (a.M0.b(c0)) {
            cm9 = new cm9((Object)this);
        }
        else {
            cm9 = null;
        }
        this.E0 = new ole(0, (ole)null, cm9);
        this.D0 = a.J0.b(c0);
    }
    
    public final boolean A0(final a a) {
        return (a.D0 & this.C0) != 0x0;
    }
    
    @Override
    public final void Z(final Object o) throws IOException {
        if (o == null) {
            this.j();
        }
        else {
            if (!(o instanceof String)) {
                if (o instanceof Number) {
                    final Number n = (Number)o;
                    if (n instanceof Integer) {
                        this.p(n.intValue());
                        return;
                    }
                    if (n instanceof Long) {
                        this.q(n.longValue());
                        return;
                    }
                    if (n instanceof Double) {
                        this.k(n.doubleValue());
                        return;
                    }
                    if (n instanceof Float) {
                        this.m(n.floatValue());
                        return;
                    }
                    if (n instanceof Short) {
                        this.L(n.shortValue());
                        return;
                    }
                    if (n instanceof Byte) {
                        this.L(n.byteValue());
                        return;
                    }
                    if (n instanceof BigInteger) {
                        this.K((BigInteger)n);
                        return;
                    }
                    if (n instanceof BigDecimal) {
                        this.z((BigDecimal)n);
                        return;
                    }
                    if (n instanceof AtomicInteger) {
                        this.p(((AtomicInteger)n).get());
                        return;
                    }
                    if (n instanceof AtomicLong) {
                        this.q(((AtomicLong)n).get());
                        return;
                    }
                }
                else {
                    if (o instanceof byte[]) {
                        final byte[] array = (byte[])o;
                        this.c(wi1.a, array, array.length);
                        return;
                    }
                    if (o instanceof Boolean) {
                        this.d((boolean)o);
                        return;
                    }
                    if (o instanceof AtomicBoolean) {
                        this.d(((AtomicBoolean)o).get());
                        return;
                    }
                }
                final StringBuilder g = w48.g("No ObjectCodec defined for the generator, can only serialize simple wrapper types (type passed ");
                g.append(o.getClass().getName());
                g.append(")");
                throw new IllegalStateException(g.toString());
            }
            this.s0((String)o);
        }
    }
    
    @Override
    public final void p0(final String s) throws IOException {
        this.x0("write raw value");
        this.m0(s);
    }
    
    public final String w0(final BigDecimal bigDecimal) throws IOException {
        if (!a.K0.b(this.C0)) {
            return bigDecimal.toString();
        }
        final int scale = bigDecimal.scale();
        if (scale >= -9999 && scale <= 9999) {
            return bigDecimal.toPlainString();
        }
        this.a(String.format("Attempt to write plain `java.math.BigDecimal` (see JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN) with illegal scale (%d): needs to be between [-%d, %d]", scale, 9999, 9999));
        throw null;
    }
    
    public abstract void x0(final String p0) throws IOException;
}
