// 
// Decompiled by Procyon v0.6.0
// 

public final class x0l implements vrd
{
    public final boolean b;
    public final boolean c;
    
    public x0l(final a a) {
        this.b = a.a;
        this.c = a.b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && x0l.class == o.getClass()) {
            final x0l x0l = (x0l)o;
            if (this.b != x0l.b || this.c != x0l.c) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return o5j.g((Object)this.b, (Object)this.c);
    }
    
    public static final class a extends z4j<x0l>
    {
        public boolean a;
        public boolean b;
        
        public final Object i() {
            return new x0l(this);
        }
    }
}
