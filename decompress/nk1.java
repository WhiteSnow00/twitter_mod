// 
// Decompiled by Procyon v0.6.0
// 

public abstract class nk1
{
    public static final alp<nk1> b;
    public final String a;
    
    static {
        nk1.b = (jx6)hx6.b(new pkp[] { new pkp((Class)gt7.class, (alp)new gt7$b()) });
    }
    
    public nk1(final nk1.nk1$a nk1$a) {
        final String a = nk1$a.a;
        pf8.q(a);
        this.a = a;
    }
    
    public abstract void a();
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof nk1 && this.a.equals(((nk1)o).a));
    }
    
    @Override
    public int hashCode() {
        return w4j.f((Object)this.a);
    }
}
