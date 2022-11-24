import java.math.BigDecimal;
import com.google.gson.JsonParseException;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public enum egt implements fgt
{
    public static final enum egt$a F0;
    public static final enum egt$b G0;
    public static final enum egt$c H0;
    public static final enum egt$d I0;
    public static final egt[] J0;
    
    static {
        J0 = new egt[] { F0 = new egt()
            {
                public final Number b(final lie lie) throws IOException {
                    return lie.n2();
                }
            }, G0 = new egt()
            {
                public final Number b(final lie lie) throws IOException {
                    return (Number)new kxe(lie.S1());
                }
            }, H0 = new egt()
            {
                public final Number b(final lie lie) throws IOException, JsonParseException {
                    final String s1 = lie.S1();
                    try {
                        return Long.parseLong(s1);
                    }
                    catch (final NumberFormatException ex) {
                        try {
                            final Double value = Double.valueOf(s1);
                            if ((!value.isInfinite() && !value.isNaN()) || lie.G0) {
                                return value;
                            }
                            final StringBuilder sb = new StringBuilder();
                            sb.append("JSON forbids NaN and infinities: ");
                            sb.append(value);
                            sb.append("; at path ");
                            sb.append(lie.j());
                            throw new MalformedJsonException(sb.toString());
                        }
                        catch (final NumberFormatException ex2) {
                            final StringBuilder b = po.B("Cannot parse ", s1, "; at path ");
                            b.append(lie.j());
                            throw new JsonParseException(b.toString(), (Throwable)ex2);
                        }
                    }
                }
            }, I0 = new egt()
            {
                public final Number b(final lie lie) throws IOException {
                    final String s1 = lie.S1();
                    try {
                        return new BigDecimal(s1);
                    }
                    catch (final NumberFormatException ex) {
                        final StringBuilder b = po.B("Cannot parse ", s1, "; at path ");
                        b.append(lie.j());
                        throw new JsonParseException(b.toString(), (Throwable)ex);
                    }
                }
            } };
    }
    
    public egt(final String s, final int n, final egt$a egt) {
    }
}
