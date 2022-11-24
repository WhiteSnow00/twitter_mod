// 
// Decompiled by Procyon v0.6.0
// 

public final class x7w implements c9t
{
    public static final nmp<x7w> d;
    public final String b;
    public final ppv c;
    
    static {
        x7w.d = new x7w.x7w$b();
    }
    
    public x7w(final a a) {
        final String a2 = a.a;
        vmw.g((Object)a2);
        this.b = a2;
        final ppv b = a.b;
        vmw.g((Object)b);
        this.c = b;
    }
    
    public final String a() {
        return this.b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && x7w.class == o.getClass()) {
            final x7w x7w = (x7w)o;
            if (!o5j.a((Object)this.b, (Object)x7w.b) || !o5j.a((Object)this.c, (Object)x7w.c)) {
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
    
    public static final class a extends z4j<x7w>
    {
        public String a;
        public ppv b;
        
        public final Object i() {
            return new x7w(this);
        }
        
        public final boolean k() {
            return !flr.e((CharSequence)this.a) && this.a.endsWith(".json") && this.b != null;
        }
    }
}
