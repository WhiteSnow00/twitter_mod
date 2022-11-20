// 
// Decompiled by Procyon v0.6.0
// 

public final class sud
{
    public static final rlp<sud> c;
    public final String a;
    public final String b;
    
    static {
        sud.c = new sud.sud$b();
    }
    
    public sud(final sud.sud$a sud$a) {
        final String a = sud$a.a;
        jee.l((Object)a);
        this.a = a;
        final String b = sud$a.b;
        jee.l((Object)b);
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o != null && sud.class == o.getClass() && c5j.a((Object)this.b, (Object)((sud)o).b));
    }
    
    @Override
    public final int hashCode() {
        return c5j.f((Object)this.b);
    }
}
