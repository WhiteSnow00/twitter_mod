import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public interface jfp
{
    public static final a Companion = a.a;
    
    long a(final qjs p0, final long p1, final int p2, final boolean p3, final zjs p4);
    
    public static final class a
    {
        public static final a a;
        public static final jfp$a$c b;
        public static final jfp$a$a c;
        public static final jfp$a$e d;
        public static final jfp$a$d e;
        public static final jfp$a$b f;
        
        static {
            a = new a();
            b = new jfp$a$c();
            c = new jfp$a$a();
            d = new jfp$a$e();
            e = new jfp$a$d();
            f = new jfp$a$b();
        }
        
        public static final long a(final qjs qjs, long n, final stb stb) {
            if (qjs.a.a.length() == 0) {
                Objects.requireNonNull(zjs.Companion);
                n = zjs.b;
            }
            else {
                final int v1 = wlr.v1((CharSequence)qjs.a.a);
                final zjs.a companion = zjs.Companion;
                final long a = ((zjs)stb.invoke((Object)jb2.F((int)(n >> 32), 0, v1))).a;
                final long a2 = ((zjs)stb.invoke((Object)jb2.F(zjs.d(n), 0, v1))).a;
                int d;
                if (zjs.h(n)) {
                    d = zjs.d(a);
                }
                else {
                    d = (int)(a >> 32);
                }
                int d2;
                if (zjs.h(n)) {
                    d2 = (int)(a2 >> 32);
                }
                else {
                    d2 = zjs.d(a2);
                }
                n = p4j.f(d, d2);
            }
            return n;
        }
    }
}
