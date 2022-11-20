// 
// Decompiled by Procyon v0.6.0
// 

public interface em6
{
    public static final a Companion = a.a;
    
    long a(final long p0, final long p1);
    
    public static final class a
    {
        public static final a a;
        public static final em6$a$a b;
        public static final em6$a$c c;
        public static final em6$a$b d;
        public static final em6$a$d e;
        public static final v0b f;
        
        static {
            a = new a();
            b = new em6() {
                @Override
                public final long a(final long n, final long n2) {
                    final float max = Math.max(lp.A(n, n2), lp.z(n, n2));
                    return ffz.k(max, max);
                }
            };
            c = new em6() {
                @Override
                public final long a(final long n, final long n2) {
                    final float min = Math.min(lp.A(n, n2), lp.z(n, n2));
                    return ffz.k(min, min);
                }
            };
            d = new em6() {
                @Override
                public final long a(final long n, final long n2) {
                    final float a = lp.A(n, n2);
                    return ffz.k(a, a);
                }
            };
            e = new em6() {
                @Override
                public final long a(long n, final long n2) {
                    if (ddq.d(n) <= ddq.d(n2) && ddq.b(n) <= ddq.b(n2)) {
                        n = ffz.k(1.0f, 1.0f);
                    }
                    else {
                        final float min = Math.min(lp.A(n, n2), lp.z(n, n2));
                        n = ffz.k(min, min);
                    }
                    return n;
                }
            };
            f = new v0b();
        }
    }
}
