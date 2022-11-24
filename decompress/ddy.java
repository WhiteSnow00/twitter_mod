import java.util.List;
import java.util.Iterator;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.math.BigDecimal;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ddy implements kfy
{
    public final Double F0;
    
    public ddy(final Double f0) {
        if (f0 == null) {
            this.F0 = Double.NaN;
            return;
        }
        this.F0 = f0;
    }
    
    public final kfy e() {
        return (kfy)new ddy(this.F0);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o == this || (o instanceof ddy && this.F0.equals(((ddy)o).F0));
    }
    
    public final Double h() {
        return this.F0;
    }
    
    @Override
    public final int hashCode() {
        return this.F0.hashCode();
    }
    
    public final Boolean j() {
        final boolean naN = Double.isNaN(this.F0);
        boolean b = false;
        if (!naN) {
            b = b;
            if (this.F0 != 0.0) {
                b = true;
            }
        }
        return b;
    }
    
    public final String k() {
        if (Double.isNaN(this.F0)) {
            return "NaN";
        }
        if (!Double.isInfinite(this.F0)) {
            final BigDecimal stripTrailingZeros = BigDecimal.valueOf(this.F0).stripTrailingZeros();
            final DecimalFormat decimalFormat = new DecimalFormat("0E0");
            decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
            int n;
            if (stripTrailingZeros.scale() > 0) {
                n = stripTrailingZeros.precision();
            }
            else {
                n = stripTrailingZeros.scale();
            }
            decimalFormat.setMinimumFractionDigits(n - 1);
            final String format = decimalFormat.format(stripTrailingZeros);
            final int index = format.indexOf("E");
            String s = format;
            if (index > 0) {
                final int int1 = Integer.parseInt(format.substring(index + 1));
                if ((int1 < 0 && int1 > -7) || (int1 >= 0 && int1 < 21)) {
                    s = stripTrailingZeros.toPlainString();
                }
                else {
                    s = format.replace("E-", "e-").replace("E", "e+");
                }
            }
            return s;
        }
        if (this.F0 > 0.0) {
            return "Infinity";
        }
        return "-Infinity";
    }
    
    public final Iterator m() {
        return null;
    }
    
    public final kfy o(final String s, final y7z y7z, final List list) {
        if ("toString".equals(s)) {
            return (kfy)new wgy(this.k());
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", this.k(), s));
    }
    
    @Override
    public final String toString() {
        return this.k();
    }
}
