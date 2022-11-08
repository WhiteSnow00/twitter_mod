import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class clw
{
    public static final b Companion;
    public static final long e;
    public final wlw a;
    public final qvo b;
    public final qvo c;
    public final reg<Long, a> d;
    
    static {
        Companion = new b();
        e = TimeUnit.HOURS.toMillis(1L);
    }
    
    public clw(final wlw a, final qfv qfv, final ibm ibm, final qvo b, final qvo c) {
        zzd.f((Object)a, "usersRepository");
        zzd.f((Object)qfv, "userManager");
        zzd.f((Object)ibm, "releaseCompletable");
        zzd.f((Object)b, "ioScheduler");
        zzd.f((Object)c, "mainScheduler");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = (reg<Long, a>)new reg(100);
        ibm.i((rj)new c41(qfv.m().e().subscribe((fk6)new yhc((rtb)new clw$c(this), 22)), 10));
    }
    
    public final List<w21> a(final List<w21> list) {
        final ArrayList list2 = new ArrayList<w21>(kr4.h1((Iterable)list, 10));
        for (final w21 w21 : list) {
            final hfv e = w21.e();
            w21 a = w21;
            if (e != null) {
                final hfv$b hfv$b = new hfv$b(e);
                final a a2 = (a)this.d.get((Object)e.C0);
                Boolean value;
                if (a2 != null) {
                    value = a2.a;
                }
                else {
                    value = null;
                }
                ((hfv$a)hfv$b).p(value);
                a = w21.a(w21, (rhw)((h4j)hfv$b).e());
            }
            list2.add(a);
        }
        return (List<w21>)list2;
    }
    
    public static final class a
    {
        public final boolean a;
        public final long b;
        
        public a(final boolean a) {
            final t3s a2 = mq1.a;
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
