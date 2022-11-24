// 
// Decompiled by Procyon v0.6.0
// 

public abstract class kk1
{
    public static final nmp<kk1> b;
    public final String a;
    
    static {
        kk1.b = (tx6)rx6.b(new cmp[] { new cmp((Class)ut7.class, (nmp)new ut7$b()) });
    }
    
    public kk1(final a a) {
        final String a2 = a.a;
        vmw.f(a2);
        this.a = a2;
    }
    
    public abstract void a();
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof kk1 && this.a.equals(((kk1)o).a));
    }
    
    @Override
    public int hashCode() {
        return o5j.f((Object)this.a);
    }
    
    public abstract static class a<E extends kk1, B extends a<E, B>> extends z4j<E>
    {
        public String a;
        
        public boolean k() {
            return flr.g((CharSequence)this.a);
        }
    }
}
