// 
// Decompiled by Procyon v0.6.0
// 

public final class m3j
{
    public final String a;
    public final String b;
    
    public m3j(final String a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && m3j.class == o.getClass()) {
            final m3j m3j = (m3j)o;
            if (!this.a.equals(m3j.a) || !this.b.equals(m3j.b)) {
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
