import java.util.Arrays;
import com.google.android.exoplayer2.n;
import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public interface ewt
{
    void a(final rwj p0, final int p1);
    
    void b(final long p0, final int p1, final int p2, final int p3, final a p4);
    
    int c(final h78 p0, final int p1, final boolean p2) throws IOException;
    
    void d(final rwj p0, final int p1);
    
    void e(final n p0);
    
    public static final class a
    {
        public final int a;
        public final byte[] b;
        public final int c;
        public final int d;
        
        public a(final int a, final byte[] b, final int c, final int d) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }
        
        @Override
        public final boolean equals(final Object o) {
            boolean b = true;
            if (this == o) {
                return true;
            }
            if (o != null && a.class == o.getClass()) {
                final a a = (a)o;
                if (this.a != a.a || this.c != a.c || this.d != a.d || !Arrays.equals(this.b, a.b)) {
                    b = false;
                }
                return b;
            }
            return false;
        }
        
        @Override
        public final int hashCode() {
            return ((Arrays.hashCode(this.b) + this.a * 31) * 31 + this.c) * 31 + this.d;
        }
    }
}
