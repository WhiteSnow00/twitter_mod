import java.math.BigInteger;
import java.util.Objects;
import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bhe extends iee
{
    public final Serializable a;
    
    public bhe(final Boolean a) {
        Objects.requireNonNull(a);
        this.a = a;
    }
    
    public bhe(final Number a) {
        Objects.requireNonNull(a);
        this.a = a;
    }
    
    public bhe(final String a) {
        Objects.requireNonNull(a);
        this.a = a;
    }
    
    public static boolean l(final bhe bhe) {
        final Serializable a = bhe.a;
        if (a instanceof Number) {
            final Number n = (Number)a;
            if (n instanceof BigInteger || n instanceof Long || n instanceof Integer || n instanceof Short || n instanceof Byte) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        final boolean b2 = true;
        final boolean b3 = true;
        if (this == o) {
            return true;
        }
        if (o == null || bhe.class != o.getClass()) {
            return false;
        }
        final bhe bhe = (bhe)o;
        if (this.a == null) {
            return bhe.a == null && b3;
        }
        if (l(this) && l(bhe)) {
            if (this.i().longValue() != bhe.i().longValue()) {
                b = false;
            }
            return b;
        }
        final Serializable a = this.a;
        if (a instanceof Number && bhe.a instanceof Number) {
            final double doubleValue = this.i().doubleValue();
            final double doubleValue2 = bhe.i().doubleValue();
            boolean b4 = b2;
            if (doubleValue != doubleValue2) {
                b4 = (Double.isNaN(doubleValue) && Double.isNaN(doubleValue2) && b2);
            }
            return b4;
        }
        return a.equals(bhe.a);
    }
    
    public final boolean g() {
        final Serializable a = this.a;
        if (a instanceof Boolean) {
            return (boolean)a;
        }
        return Boolean.parseBoolean(this.j());
    }
    
    @Override
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
        Number n;
        if (a instanceof String) {
            n = new nwe((String)a);
        }
        else {
            n = (Number)a;
        }
        return n;
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
