import java.io.IOException;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class b0p extends kkg
{
    public static final alp<b0p> b;
    public static final String[] c;
    
    static {
        b0p.b = new a();
        c = new String[] { "type", "length", "uri", "usage" };
    }
    
    public b0p() {
        super(4);
    }
    
    public final String c(final int n) {
        return b0p.c[n];
    }
    
    public final b0p f(final long n) {
        this.d(1, (Object)n);
        return this;
    }
    
    public final b0p g(final Uri uri) {
        this.d(2, (Object)uri.toString());
        return this;
    }
    
    public static final class a extends s4j<b0p>
    {
        public final Object d(final elp elp, final int n) throws IOException, ClassNotFoundException {
            final b0p b0p = new b0p();
            final String i = elp.I();
            final long a = elp.A();
            Uri uri;
            if (!tkp.c(elp)) {
                final String c = elp.C();
                if (c.isEmpty()) {
                    uri = Uri.EMPTY;
                }
                else {
                    uri = Uri.parse(c);
                }
            }
            else {
                uri = null;
            }
            final String j = elp.I();
            if (i != null) {
                b0p.d(0, (Object)i);
            }
            b0p.f(a);
            if (uri != null) {
                b0p.d(2, (Object)uri.toString());
            }
            if (j != null) {
                b0p.d(3, (Object)j);
            }
            return b0p;
        }
        
        public final void f(final flp flp, final Object o) throws IOException {
            final b0p b0p = (b0p)o;
            flp.G((String)b0p.a.get(0));
            flp.A((long)b0p.a.get(1));
            final Object value = b0p.a.get(2);
            final l60$a a = l60.a;
            ((bow)l60$b.a).c(flp, value);
            final int a2 = w4j.a;
            flp.G((String)b0p.a.get(3));
        }
    }
}
