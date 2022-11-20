import java.util.Set;
import com.twitter.util.user.UserIdentifier;
import android.util.Pair;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

public final class sp2
{
    public static final a Companion;
    public static final AtomicInteger d;
    public final jhf a;
    public b b;
    public final int c;
    
    static {
        Companion = new a();
        d = new AtomicInteger(0);
    }
    
    public sp2(final jhf a) {
        czd.f((Object)a, "linkOpeningEventsProducer");
        this.a = a;
        this.b = new b(a.a);
        this.c = sp2.d.getAndIncrement();
    }
    
    public final void a(final op2 op2, final up2 up2, final hp2 hp2) {
        final b b = this.b;
        Objects.requireNonNull(b);
        if (!b.b.contains(op2)) {
            final b b2 = this.b;
            Objects.requireNonNull(b2);
            b2.b.add(op2);
            final jhf a = this.a;
            final pp2 pp2 = new pp2(up2, hp2, this.c);
            Objects.requireNonNull(a);
            a.c.onNext((Object)new Pair((Object)op2, (Object)pp2));
        }
    }
    
    public static final class a
    {
    }
    
    public static final class b
    {
        public static final sp2.b.b Companion;
        public static final rlp<sp2.b> c;
        public final UserIdentifier a;
        public final Set<op2> b;
        
        static {
            Companion = new sp2.b.b();
            sp2.b.c = new c();
        }
        
        public b(final UserIdentifier a) {
            czd.f((Object)a, "userIdentifier");
            this.a = a;
            this.b = muh.a(6);
        }
        
        public b(final sp2$b$a sp2$b$a) {
            final Set a = sp2$b$a.a;
            czd.c((Object)a);
            this.b = mq4.Q0((Iterable)a);
            final UserIdentifier b = sp2$b$a.b;
            czd.c((Object)b);
            this.a = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            boolean b = true;
            if (this == o) {
                return true;
            }
            if (!(o instanceof sp2.b)) {
                return false;
            }
            final Set<op2> b2 = this.b;
            final sp2.b b3 = (sp2.b)o;
            if (!czd.a((Object)b2, (Object)b3.b) || !czd.a((Object)this.a, (Object)b3.a)) {
                b = false;
            }
            return b;
        }
        
        @Override
        public final int hashCode() {
            return Objects.hash(this.b, this.a);
        }
        
        public static final class b
        {
        }
        
        public static final class c extends zr2<sp2.b, sp2$b$a>
        {
            public c() {
                super(0);
            }
            
            public final void f(final wlp wlp, final Object o) {
                final sp2.b b = (sp2.b)o;
                czd.f((Object)wlp, "output");
                czd.f((Object)b, "loggerData");
                final Set<op2> b2 = b.b;
                final lw6$h a = lw6.a;
                ((y4j)new yp4((rlp)new mw6((Class)op2.class))).c(wlp, (Object)b2);
                final int a2 = c5j.a;
                wlp.A((Object)b.a, UserIdentifier.SERIALIZER);
            }
            
            public final n4j g() {
                return (n4j)new sp2$b$a();
            }
            
            public final void h(final vlp vlp, final n4j n4j, final int n) {
                final sp2$b$a sp2$b$a = (sp2$b$a)n4j;
                czd.f((Object)vlp, "input");
                czd.f((Object)sp2$b$a, "builder");
                final lw6$h a = lw6.a;
                final Object a2 = ((y4j)new yp4((rlp)new mw6((Class)op2.class))).a(vlp);
                jee.l(a2);
                czd.e(a2, "input.readNotNullObject(\u2026  )\n                    )");
                sp2$b$a.a = (Set)a2;
                final Object z = vlp.z(UserIdentifier.SERIALIZER);
                czd.e(z, "input.readNotNullObject(UserIdentifier.SERIALIZER)");
                sp2$b$a.b = (UserIdentifier)z;
            }
        }
    }
}
