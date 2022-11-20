// 
// Decompiled by Procyon v0.6.0
// 

public final class lnu
{
    public static final rlp<lnu> b;
    public final String a;
    
    static {
        lnu.b = (nw6)lw6.b(new glp[] { new glp((Class)lnu.class, (rlp)new lnu.lnu$b()) });
    }
    
    public lnu(final lnu.lnu$a lnu$a) {
        this.a = lnu$a.a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o != null && lnu.class == o.getClass() && c5j.a((Object)this.a, (Object)((lnu)o).a));
    }
    
    @Override
    public final int hashCode() {
        return c5j.f((Object)this.a);
    }
    
    @Override
    public final String toString() {
        final StringBuilder j = fu8.j("CarouselItem{id='");
        j.append(this.a);
        j.append('\'');
        j.append('}');
        return j.toString();
    }
}
