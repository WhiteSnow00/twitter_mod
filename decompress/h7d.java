import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;
import java.io.InputStream;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class h7d
{
    public static h7d d;
    public int a;
    public List<f7d.a> b;
    public final ei8 c;
    
    public h7d() {
        this.c = new ei8();
        this.d();
    }
    
    public static f7d a(final InputStream inputStream) throws IOException {
        final h7d c = c();
        Objects.requireNonNull(c);
        Objects.requireNonNull(inputStream);
        int n = c.a;
        final byte[] array = new byte[n];
        ri4.j(Boolean.TRUE);
        Label_0069: {
            if (inputStream.markSupported()) {
                try {
                    inputStream.mark(n);
                    n = rez.D(inputStream, array, n);
                    break Label_0069;
                }
                finally {
                    inputStream.reset();
                }
            }
            n = rez.D(inputStream, array, n);
        }
        f7d f7d = c.c.a(array, n);
        if (f7d == f7d.b) {
            final List<f7d.a> b = c.b;
            if (b != null) {
                final Iterator<f7d.a> iterator = b.iterator();
                while (iterator.hasNext()) {
                    f7d = iterator.next().a(array, n);
                    if (f7d != null && f7d != f7d.b) {
                        return f7d;
                    }
                }
            }
            f7d = f7d.b;
        }
        return f7d;
    }
    
    public static f7d b(final InputStream inputStream) {
        try {
            return a(inputStream);
        }
        catch (final IOException ex) {
            lux.h(ex);
            throw null;
        }
    }
    
    public static h7d c() {
        synchronized (h7d.class) {
            if (h7d.d == null) {
                h7d.d = new h7d();
            }
            return h7d.d;
        }
    }
    
    public final void d() {
        this.a = this.c.a;
        final List<f7d.a> b = this.b;
        if (b != null) {
            final Iterator<f7d.a> iterator = b.iterator();
            while (iterator.hasNext()) {
                this.a = Math.max(this.a, iterator.next().b());
            }
        }
    }
}
