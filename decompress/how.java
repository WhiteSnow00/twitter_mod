// 
// Decompiled by Procyon v0.6.0
// 

public final class how
{
    public static final how c;
    public static final how d;
    public final int a;
    public final String b;
    
    static {
        c = new how(2, null);
        d = new how(3, null);
    }
    
    public how(final int a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (!(o instanceof how)) {
            return false;
        }
        final how how = (how)o;
        if (this.a != how.a || !c5j.a((Object)this.b, (Object)how.b)) {
            b = false;
        }
        return b;
    }
    
    @Override
    public final int hashCode() {
        return c5j.g((Object)this.a, (Object)this.b);
    }
}
