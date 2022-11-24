import java.util.Map;
import java.io.IOException;
import java.io.Writer;
import java.io.StringWriter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vee
{
    public final wee a;
    
    public vee(final wee a) {
        this.a = a;
    }
    
    public final String a(final Object o) {
        final StringWriter stringWriter = new StringWriter();
        try {
            this.b(o, stringWriter);
            return stringWriter.toString();
        }
        catch (final IOException ex) {
            return stringWriter.toString();
        }
    }
    
    public final void b(final Object o, final Writer writer) throws IOException {
        final wee a = this.a;
        final nle nle = new nle(writer, a.a, a.b, (b5j<Object>)a.c, a.d);
        nle.g(o);
        nle.i();
        nle.b.flush();
    }
}
