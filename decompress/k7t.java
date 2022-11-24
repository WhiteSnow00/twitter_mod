import java.util.regex.Pattern;

// 
// Decompiled by Procyon v0.6.0
// 

public final class k7t
{
    public static final nmp<k7t> e;
    public final lxd a;
    public final String b;
    public final rnt c;
    public final int d;
    
    static {
        k7t.e = new k7t.k7t$b();
    }
    
    public k7t(final a a) {
        final lxd a2 = a.a;
        vmw.g((Object)a2);
        this.a = a2;
        this.b = a.b;
        this.c = a.c;
        this.d = a.d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        final boolean b = o instanceof k7t;
        final boolean b2 = false;
        if (!b) {
            return false;
        }
        if (this == o) {
            return true;
        }
        final int a = o5j.a;
        final k7t k7t = (k7t)o;
        boolean b3 = b2;
        if (o5j.a((Object)this.a, (Object)k7t.a)) {
            final String b4 = this.b;
            final String b5 = k7t.b;
            final Pattern a2 = flr.a;
            b3 = b2;
            if (e0e.a((Object)b4, (Object)b5)) {
                b3 = b2;
                if (o5j.a((Object)this.c, (Object)k7t.c)) {
                    b3 = b2;
                    if (o5j.a((Object)this.d, (Object)k7t.d)) {
                        b3 = true;
                    }
                }
            }
        }
        return b3;
    }
    
    @Override
    public final int hashCode() {
        return o5j.i((Object)this.a, (Object)this.b, (Object)this.c, (Object)this.d);
    }
    
    public static final class a extends z4j<k7t>
    {
        public lxd a;
        public String b;
        public rnt c;
        public int d;
        
        public a() {
            this.d = 1;
        }
        
        public final Object i() {
            return new k7t(this);
        }
        
        public final boolean k() {
            return this.a != null;
        }
    }
}
