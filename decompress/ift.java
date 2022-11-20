// 
// Decompiled by Procyon v0.6.0
// 

public final class ift extends xqt
{
    public final cej a;
    public final cej b;
    
    public ift(final cej a, final cej b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && ift.class == o.getClass()) {
            final ift ift = (ift)o;
            if (!c5j.a((Object)this.a, (Object)ift.a) || !c5j.a((Object)this.b, (Object)ift.b)) {
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
