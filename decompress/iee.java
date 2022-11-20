import java.io.IOException;
import java.io.Writer;
import java.io.StringWriter;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class iee
{
    public final bhe e() {
        if (this instanceof bhe) {
            return (bhe)this;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Not a JSON Primitive: ");
        sb.append(this);
        throw new IllegalStateException(sb.toString());
    }
    
    @Override
    public final String toString() {
        try {
            final StringWriter stringWriter = new StringWriter();
            final zke zke = new zke((Writer)stringWriter);
            zke.I0 = true;
            nza.X1(this, zke);
            return stringWriter.toString();
        }
        catch (final IOException ex) {
            throw new AssertionError((Object)ex);
        }
    }
}
