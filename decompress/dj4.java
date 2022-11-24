import java.io.Writer;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Objects;
import com.facebook.common.references.SharedReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dj4 implements c
{
    public final d4j a;
    
    public dj4(final d4j a) {
        this.a = a;
    }
    
    @Override
    public final void a(final SharedReference<Object> sharedReference, final Throwable t) {
        Objects.requireNonNull(this.a);
        final Object c = sharedReference.c();
        String name;
        if (c != null) {
            name = c.getClass().getName();
        }
        else {
            name = "<value is null>";
        }
        final int identityHashCode = System.identityHashCode(this);
        final int identityHashCode2 = System.identityHashCode(sharedReference);
        String string;
        if (t == null) {
            string = "";
        }
        else {
            final StringWriter stringWriter = new StringWriter();
            t.printStackTrace(new PrintWriter(stringWriter));
            string = stringWriter.toString();
        }
        fr0.n0("Fresco", "Finalized without closing: %x %x (type = %s).\nStack:\n%s", new Object[] { identityHashCode, identityHashCode2, name, string });
    }
    
    public final void b() {
        Objects.requireNonNull(this.a);
    }
}
