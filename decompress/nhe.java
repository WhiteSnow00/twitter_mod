import java.io.Closeable;
import java.io.InputStream;
import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class nhe<OBJECT, ERROR> extends wsc<OBJECT, ERROR>
{
    public abstract OBJECT a(final khe p0) throws IOException;
    
    public abstract ERROR b(final khe p0, final int p1);
    
    public void m(final int n, final InputStream inputStream, final int n2, String e, final String s) throws IOException {
        if (n != 304 && e != null && n != 204) {
            if (e.startsWith("application/json")) {
                e = null;
                try {
                    final Object o = e = (String)bih.a.e(inputStream);
                    ((khe)o).i0();
                    e = (String)o;
                    if (xsc.b(n)) {
                        e = (String)o;
                        super.C0 = this.a((khe)o);
                    }
                    else {
                        e = (String)o;
                        super.D0 = this.b((khe)o, n);
                    }
                    return;
                }
                finally {
                    e2e.a((Closeable)e);
                }
            }
            throw new IOException(yqh.k("Reader could not validate. content-type=[", e, "], or encoding=[", s, "]"));
        }
    }
    
    public final void p(final xsc xsc) {
        final Object d0 = super.D0;
        if (d0 instanceof pav) {
            xsc.p = pav.i((pav)d0);
        }
    }
}
