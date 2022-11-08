// 
// Decompiled by Procyon v0.6.0
// 

public final class hn9
{
    public static final alp<hn9> d;
    public final String a;
    public final String b;
    public final long c;
    
    static {
        hn9.d = new hn9.hn9$b();
    }
    
    public hn9(final hn9.hn9$a hn9$a) {
        this.b = hn9$a.b;
        this.a = hn9$a.a;
        this.c = hn9$a.c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && hn9.class == o.getClass()) {
            final hn9 hn9 = (hn9)o;
            if (!w4j.a((Object)this.a, (Object)hn9.a) || this.c != hn9.c || !w4j.a((Object)this.b, (Object)hn9.b)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return w4j.h((Object)this.a, (Object)this.c, (Object)this.b);
    }
}
