// 
// Decompiled by Procyon v0.6.0
// 

public final class new extends b
{
    public static final ss2<new, a> b;
    public final mew a;
    
    static {
        new.b = new new.new$b();
    }
    
    public new(final a a) {
        this.a = a.a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof new && o5j.a((Object)this.a, (Object)((new)o).a));
    }
    
    @Override
    public final int hashCode() {
        return o5j.f((Object)this.a);
    }
    
    public static final class a extends z4j<new>
    {
        public mew a;
        
        public final Object i() {
            return new new(this);
        }
    }
}
