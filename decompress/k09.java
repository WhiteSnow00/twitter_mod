// 
// Decompiled by Procyon v0.6.0
// 

public final class k09
{
    public static final rlp<k09> c;
    public static final k09 d;
    public final int a;
    public final long b;
    
    static {
        k09.c = new k09.k09$b();
        d = k09.k09$a.o(0);
    }
    
    public k09(final k09.k09$a k09$a) {
        this.a = k09$a.a;
        this.b = k09$a.b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && k09.class == o.getClass()) {
            final k09 k09 = (k09)o;
            if (!c5j.a((Object)this.a, (Object)k09.a) || !c5j.a((Object)this.b, (Object)k09.b)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return c5j.g((Object)this.a, (Object)this.b);
    }
}
