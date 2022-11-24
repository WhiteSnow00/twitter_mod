import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dmv
{
    public static final nmp<dmv> d;
    public final String a;
    public final List<ulv> b;
    public final String c;
    
    static {
        dmv.d = new dmv.dmv$b();
    }
    
    public dmv(final a a) {
        this.a = a.a;
        this.b = a.b;
        this.c = a.c;
    }
    
    public final ulv a() {
        final List<ulv> b = this.b;
        if (b != null && !b.isEmpty()) {
            return this.b.get(0);
        }
        return ulv.F0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && dmv.class == o.getClass()) {
            final dmv dmv = (dmv)o;
            return o5j.a((Object)this.a, (Object)dmv.a) && o5j.a((Object)this.b, (Object)dmv.b) && o5j.a((Object)this.c, (Object)dmv.c);
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return o5j.h((Object)this.a, (Object)this.b, (Object)this.c);
    }
    
    public static final class a extends z4j<dmv>
    {
        public String a;
        public List<ulv> b;
        public String c;
        
        public a() {
            this.c = null;
        }
        
        public final Object i() {
            return new dmv(this);
        }
    }
}
