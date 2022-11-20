// 
// Decompiled by Procyon v0.6.0
// 

public final class u87
{
    public static final y4j<u87> c;
    public final String a;
    public final String b;
    
    static {
        u87.c = new u87.u87$a();
    }
    
    public u87(final String a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && u87.class == o.getClass()) {
            final u87 u87 = (u87)o;
            return c5j.a((Object)this.a, (Object)u87.a) && c5j.a((Object)this.b, (Object)u87.b);
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return c5j.g((Object)this.a, (Object)this.b);
    }
}
