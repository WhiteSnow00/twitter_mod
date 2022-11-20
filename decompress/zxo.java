// 
// Decompiled by Procyon v0.6.0
// 

public final class zxo
{
    public static final zxo.zxo$b c;
    public final uxo a;
    public final ayo b;
    
    static {
        c = new zxo.zxo$b();
    }
    
    public zxo(final zxo.zxo$a zxo$a) {
        final uxo a = zxo$a.a;
        jee.l((Object)a);
        this.a = a;
        final ayo b = zxo$a.b;
        jee.l((Object)b);
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && zxo.class == o.getClass()) {
            final int a = c5j.a;
            final zxo zxo = (zxo)o;
            if (!c5j.a((Object)this.a, (Object)zxo.a) || !c5j.a((Object)this.b, (Object)zxo.b)) {
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
