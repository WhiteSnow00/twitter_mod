// 
// Decompiled by Procyon v0.6.0
// 

public final class vsr implements pcj
{
    public static final rlp<vsr> d;
    public final String b;
    public final int c;
    
    static {
        vsr.d = new vsr.vsr$a();
    }
    
    public vsr(final String b, final int c) {
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && vsr.class == o.getClass()) {
            final vsr vsr = (vsr)o;
            if (!c5j.a((Object)this.b, (Object)vsr.b) || !c5j.a((Object)this.c, (Object)vsr.c)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return c5j.g((Object)this.b, (Object)this.c);
    }
}
