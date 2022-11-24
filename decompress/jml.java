import java.io.IOException;
import com.google.firebase.encoders.EncodingException;
import java.io.OutputStream;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jml
{
    public final Map<Class<?>, b5j<?>> a;
    public final Map<Class<?>, dpw<?>> b;
    public final b5j<Object> c;
    
    public jml(final Map<Class<?>, b5j<?>> a, final Map<Class<?>, dpw<?>> b, final b5j<Object> c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void a(final Object o, final OutputStream outputStream) throws IOException {
        final Map<Class<?>, b5j<?>> a = this.a;
        final hml hml = new hml(outputStream, (Map)a, (Map)this.b, (b5j)this.c);
        if (o != null) {
            final b5j b5j = a.get(o.getClass());
            if (b5j == null) {
                final StringBuilder f = ehk.f("No encoder for ");
                f.append(o.getClass());
                throw new EncodingException(f.toString());
            }
            ((s4a)b5j).a(o, (Object)hml);
        }
    }
}
