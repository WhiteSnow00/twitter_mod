// 
// Decompiled by Procyon v0.6.0
// 

public final class uet extends hqt
{
    public final xdj a;
    public final xdj b;
    
    public uet(final xdj a, final xdj b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && uet.class == o.getClass()) {
            final uet uet = (uet)o;
            if (!w4j.a((Object)this.a, (Object)uet.a) || !w4j.a((Object)this.b, (Object)uet.b)) {
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
