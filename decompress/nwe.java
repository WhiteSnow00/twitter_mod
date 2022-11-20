import java.math.BigDecimal;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nwe extends Number
{
    public final String D0;
    
    public nwe(final String d0) {
        this.D0 = d0;
    }
    
    @Override
    public final double doubleValue() {
        return Double.parseDouble(this.D0);
    }
    
    @Override
    public final boolean equals(final Object o) {
        final boolean b = true;
        if (this == o) {
            return true;
        }
        if (o instanceof nwe) {
            final nwe nwe = (nwe)o;
            final String d0 = this.D0;
            final String d2 = nwe.D0;
            boolean b2 = b;
            if (d0 != d2) {
                b2 = (d0.equals(d2) && b);
            }
            return b2;
        }
        return false;
    }
    
    @Override
    public final float floatValue() {
        return Float.parseFloat(this.D0);
    }
    
    @Override
    public final int hashCode() {
        return this.D0.hashCode();
    }
    
    @Override
    public final int intValue() {
        try {
            return Integer.parseInt(this.D0);
        }
        catch (final NumberFormatException ex) {
            try {
                return (int)Long.parseLong(this.D0);
            }
            catch (final NumberFormatException ex2) {
                return new BigDecimal(this.D0).intValue();
            }
        }
    }
    
    @Override
    public final long longValue() {
        try {
            return Long.parseLong(this.D0);
        }
        catch (final NumberFormatException ex) {
            return new BigDecimal(this.D0).longValue();
        }
    }
    
    @Override
    public final String toString() {
        return this.D0;
    }
}
