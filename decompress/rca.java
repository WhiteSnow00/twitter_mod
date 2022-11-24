import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rca
{
    public static final k5j<rca> e;
    public final String a;
    public final int b;
    public final int c;
    public final List<ur4> d;
    
    static {
        rca.e = new rca.rca$b();
    }
    
    public rca(final a a) {
        this.a = a.a;
        this.b = a.b;
        this.c = a.c;
        this.d = a.d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof rca) {
            final rca rca = (rca)o;
            if (!o5j.a((Object)this.a, (Object)rca.a) || this.b != rca.b || this.c != rca.c || !o5j.a((Object)this.d, (Object)rca.d)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return o5j.i((Object)this.a, (Object)this.b, (Object)this.c, (Object)this.d);
    }
    
    public static final class a extends z4j<rca>
    {
        public String a;
        public int b;
        public int c;
        public List<ur4> d;
        
        public a() {
            this.a = "";
        }
        
        public final Object i() {
            return new rca(this);
        }
        
        public final boolean k() {
            return !flr.e((CharSequence)this.a);
        }
    }
}
