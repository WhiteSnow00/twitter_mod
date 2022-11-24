import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicInteger;
import java.math.BigDecimal;
import java.math.BigInteger;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class lzb extends yfe
{
    public int F0;
    public boolean G0;
    public wle H0;
    
    static {
        final int g0 = yfe$a.M0.G0;
        final int g2 = yfe$a.O0.G0;
        final int g3 = yfe$a.P0.G0;
    }
    
    public lzb(final int f0) {
        this.F0 = f0;
        nm9 nm9;
        if (yfe$a.P0.b(f0)) {
            nm9 = new nm9((Object)this);
        }
        else {
            nm9 = null;
        }
        this.H0 = new wle(0, null, nm9);
        this.G0 = yfe$a.M0.b(f0);
    }
    
    public final boolean A0(final yfe$a yfe$a) {
        return (yfe$a.G0 & this.F0) != 0x0;
    }
    
    public final void Z(final Object o) throws IOException {
        if (o == null) {
            this.j();
        }
        else {
            if (!(o instanceof String)) {
                if (o instanceof Number) {
                    final Number n = (Number)o;
                    if (n instanceof Integer) {
                        this.q(n.intValue());
                        return;
                    }
                    if (n instanceof Long) {
                        this.r(n.longValue());
                        return;
                    }
                    if (n instanceof Double) {
                        this.l(n.doubleValue());
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
                        this.L((short)n.byteValue());
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
                        this.q(((AtomicInteger)n).get());
                        return;
                    }
                    if (n instanceof AtomicLong) {
                        this.r(((AtomicLong)n).get());
                        return;
                    }
                }
                else {
                    if (o instanceof byte[]) {
                        final byte[] array = (byte[])o;
                        this.c(ti1.a, array, array.length);
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
                final StringBuilder f = ehk.f("No ObjectCodec defined for the generator, can only serialize simple wrapper types (type passed ");
                f.append(o.getClass().getName());
                f.append(")");
                throw new IllegalStateException(f.toString());
            }
            this.s0((String)o);
        }
    }
    
    public final void p0(final String s) throws IOException {
        this.x0("write raw value");
        this.m0(s);
    }
    
    public final String w0(final BigDecimal bigDecimal) throws IOException {
        if (!yfe$a.N0.b(this.F0)) {
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
