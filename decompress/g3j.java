// 
// Decompiled by Procyon v0.6.0
// 

public final class g3j
{
    public final String a;
    public final String b;
    
    public g3j(final String a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && g3j.class == o.getClass()) {
            final g3j g3j = (g3j)o;
            if (!this.a.equals(g3j.a) || !this.b.equals(g3j.b)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return w4j.g((Object)this.a, (Object)this.b);
    }
}
