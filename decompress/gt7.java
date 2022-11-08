// 
// Decompiled by Procyon v0.6.0
// 

public final class gt7 extends nk1
{
    public static final alp<gt7> d;
    public final ft7 c;
    
    static {
        gt7.d = new gt7.gt7$b();
    }
    
    public gt7(final gt7.gt7$a gt7$a) {
        super((nk1.nk1$a)gt7$a);
        final ft7 b = gt7$a.b;
        pf8.r(b);
        this.c = b;
    }
    
    @Override
    public final void a() {
    }
    
    @Override
    public final boolean equals(final Object o) {
        return super.equals(o) && (this == o || (o instanceof gt7 && w4j.a((Object)this.c, (Object)((gt7)o).c)));
    }
    
    @Override
    public final int hashCode() {
        return w4j.g((Object)super.hashCode(), (Object)this.c);
    }
}
