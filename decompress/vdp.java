import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public interface vdp
{
    public static final a Companion = a.a;
    
    long a(final dis p0, final long p1, final int p2, final boolean p3, final mis p4);
    
    public static final class a
    {
        public static final /* synthetic */ a a;
        public static final vdp$a$c b;
        public static final vdp$a$a c;
        public static final vdp$a$e d;
        public static final vdp$a$d e;
        public static final vdp$a$b f;
        
        static {
            a = new a();
            b = new vdp$a$c();
            c = new vdp$a$a();
            d = new vdp$a$e();
            e = new vdp$a$d();
            f = new vdp$a$b();
        }
        
        public static final long a(final dis dis, long n, final rtb rtb) {
            if (dis.a.a.length() == 0) {
                Objects.requireNonNull(mis.Companion);
                n = mis.b;
            }
            else {
                final int s1 = gkr.s1((CharSequence)dis.a.a);
                final mis.a companion = mis.Companion;
                final long a = ((mis)rtb.invoke((Object)pf8.v((int)(n >> 32), 0, s1))).a;
                final long a2 = ((mis)rtb.invoke((Object)pf8.v(mis.d(n), 0, s1))).a;
                int d;
                if (mis.h(n)) {
                    d = mis.d(a);
                }
                else {
                    d = (int)(a >> 32);
                }
                int d2;
                if (mis.h(n)) {
                    d2 = (int)(a2 >> 32);
                }
                else {
                    d2 = mis.d(a2);
                }
                n = h6q.f(d, d2);
            }
            return n;
        }
    }
}
