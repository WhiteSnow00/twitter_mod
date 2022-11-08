import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cvs
{
    public static final cvs.cvs$b d;
    public final List<String> a;
    public final String b;
    public final vva c;
    
    static {
        d = new cvs.cvs$b();
    }
    
    public cvs(final a a) {
        this.a = a.a;
        this.b = a.b;
        this.c = a.c;
    }
    
    public cvs(final List<String> a, final String b, final vva c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && cvs.class == o.getClass()) {
            final cvs cvs = (cvs)o;
            if (!w4j.a((Object)this.a, (Object)cvs.a) || !w4j.a((Object)this.b, (Object)cvs.b) || !w4j.a((Object)this.c, (Object)cvs.c)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return w4j.h((Object)this.a, (Object)this.b, (Object)this.c);
    }
    
    public static final class a extends h4j<cvs>
    {
        public List<String> a;
        public String b;
        public vva c;
        
        public final Object i() {
            return new cvs(this);
        }
    }
}
