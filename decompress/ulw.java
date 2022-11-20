import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ulw
{
    public static final b Companion;
    public static final long e;
    public final qmw a;
    public final gwo b;
    public final gwo c;
    public final heg<Long, a> d;
    
    static {
        Companion = new b();
        e = TimeUnit.HOURS.toMillis(1L);
    }
    
    public ulw(final qmw a, final mgv mgv, final xbm xbm, final gwo b, final gwo c) {
        czd.f((Object)a, "usersRepository");
        czd.f((Object)mgv, "userManager");
        czd.f((Object)xbm, "releaseCompletable");
        czd.f((Object)b, "ioScheduler");
        czd.f((Object)c, "mainScheduler");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = (heg<Long, a>)new heg(100);
        xbm.i((oj)new sh(mgv.m().e().subscribe((lj6)new irl((qsb)new ulw$c(this), 18)), 9));
    }
    
    public final List<s21> a(final List<s21> list) {
        final ArrayList list2 = new ArrayList<s21>(iq4.H((Iterable)list, 10));
        for (final s21 s21 : list) {
            final cgv e = s21.e();
            s21 a = s21;
            if (e != null) {
                final cgv$b cgv$b = new cgv$b(e);
                final a a2 = (a)this.d.get((Object)e.D0);
                Boolean value;
                if (a2 != null) {
                    value = a2.a;
                }
                else {
                    value = null;
                }
                ((cgv$a)cgv$b).p(value);
                a = s21.a(s21, (kiw)((n4j)cgv$b).e());
            }
            list2.add(a);
        }
        return (List<s21>)list2;
    }
    
    public static final class a
    {
        public final boolean a;
        public final long b;
        
        public a(final boolean a) {
            final m4s a2 = hq1.a;
            final long currentTimeMillis = System.currentTimeMillis();
            this.a = a;
            this.b = currentTimeMillis;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof a)) {
                return false;
            }
            final a a = (a)o;
            return this.a == a.a && this.b == a.b;
        }
        
        @Override
        public final int hashCode() {
            int a;
            if ((a = (this.a ? 1 : 0)) != 0) {
                a = 1;
            }
            final long b = this.b;
            return a * 31 + (int)(b ^ b >>> 32);
        }
        
        @Override
        public final String toString() {
            final boolean a = this.a;
            final long b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("CacheValue(hasNFTAvatar=");
            sb.append(a);
            sb.append(", createdAt=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class b
    {
    }
}
