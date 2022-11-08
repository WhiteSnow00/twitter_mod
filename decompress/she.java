import java.math.BigInteger;
import java.util.Objects;
import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class she extends afe
{
    public final Serializable a;
    
    public she(final Boolean a) {
        Objects.requireNonNull(a);
        this.a = a;
    }
    
    public she(final Number a) {
        Objects.requireNonNull(a);
        this.a = a;
    }
    
    public she(final String a) {
        Objects.requireNonNull(a);
        this.a = a;
    }
    
    public static boolean l(final she she) {
        final Serializable a = she.a;
        if (a instanceof Number) {
            final Number n = (Number)a;
            if (n instanceof BigInteger || n instanceof Long || n instanceof Integer || n instanceof Short || n instanceof Byte) {
                return true;
            }
        }
        return false;
    }
    
    public final boolean equals(final Object o) {
        final boolean b = true;
        final boolean b2 = true;
        boolean b3 = true;
        if (this == o) {
            return true;
        }
        if (o == null || she.class != o.getClass()) {
            return false;
        }
        final she she = (she)o;
        if (this.a == null) {
            if (she.a != null) {
                b3 = false;
            }
            return b3;
        }
        if (l(this) && l(she)) {
            return this.i().longValue() == she.i().longValue() && b;
        }
        final Serializable a = this.a;
        if (a instanceof Number && she.a instanceof Number) {
            final double doubleValue = this.i().doubleValue();
            final double doubleValue2 = she.i().doubleValue();
            boolean b4 = b2;
            if (doubleValue != doubleValue2) {
                b4 = (Double.isNaN(doubleValue) && Double.isNaN(doubleValue2) && b2);
            }
            return b4;
        }
        return a.equals(she.a);
    }
    
    public final boolean g() {
        final Serializable a = this.a;
        if (a instanceof Boolean) {
            return (boolean)a;
        }
        return Boolean.parseBoolean(this.j());
    }
    
    public final int hashCode() {
        if (this.a == null) {
            return 31;
        }
        long n;
        if (l(this)) {
            n = this.i().longValue();
        }
        else {
            final Serializable a = this.a;
            if (!(a instanceof Number)) {
                return a.hashCode();
            }
            n = Double.doubleToLongBits(this.i().doubleValue());
        }
        return (int)(n >>> 32 ^ n);
    }
    
    public final Number i() {
        final Serializable a = this.a;
        Object o;
        if (a instanceof String) {
            o = new dxe((String)a);
        }
        else {
            o = a;
        }
        return (Number)o;
    }
    
    public final String j() {
        final Serializable a = this.a;
        if (a instanceof Number) {
            return this.i().toString();
        }
        if (a instanceof Boolean) {
            return ((Boolean)a).toString();
        }
        return (String)a;
    }
}
