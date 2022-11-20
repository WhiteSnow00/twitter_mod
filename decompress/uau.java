import java.util.Collections;
import java.util.List;
import com.google.android.exoplayer2.ParserException;

// 
// Decompiled by Procyon v0.6.0
// 

public interface uau
{
    void a(final rwj p0, final int p1) throws ParserException;
    
    void b(final x9t p0, final nna p1, final d p2);
    
    void c();
    
    public static final class a
    {
        public final String a;
        public final byte[] b;
        
        public a(final String a, final byte[] b) {
            this.a = a;
            this.b = b;
        }
    }
    
    public static final class b
    {
        public final String a;
        public final List<a> b;
        public final byte[] c;
        
        public b(final int n, final String a, final List<a> list, final byte[] c) {
            this.a = a;
            List<Object> b;
            if (list == null) {
                b = (List<Object>)Collections.emptyList();
            }
            else {
                b = (List<Object>)Collections.unmodifiableList((List<? extends a>)list);
            }
            this.b = (List<a>)b;
            this.c = c;
        }
    }
    
    public interface c
    {
        uau a(final int p0, final b p1);
    }
    
    public static final class d
    {
        public final String a;
        public final int b;
        public final int c;
        public int d;
        public String e;
        
        public d(final int n, final int n2) {
            this(Integer.MIN_VALUE, n, n2);
        }
        
        public d(final int n, final int b, final int c) {
            String string;
            if (n != Integer.MIN_VALUE) {
                final StringBuilder sb = new StringBuilder(12);
                sb.append(n);
                sb.append("/");
                string = sb.toString();
            }
            else {
                string = "";
            }
            this.a = string;
            this.b = b;
            this.c = c;
            this.d = Integer.MIN_VALUE;
            this.e = "";
        }
        
        public final void a() {
            final int d = this.d;
            int b;
            if (d == Integer.MIN_VALUE) {
                b = this.b;
            }
            else {
                b = d + this.c;
            }
            this.d = b;
            final String a = this.a;
            this.e = jxa.p(wnj.f(a, 11), a, b);
        }
        
        public final String b() {
            if (this.d != Integer.MIN_VALUE) {
                return this.e;
            }
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
        
        public final int c() {
            final int d = this.d;
            if (d != Integer.MIN_VALUE) {
                return d;
            }
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }
}
