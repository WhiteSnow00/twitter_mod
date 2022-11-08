// 
// Decompiled by Procyon v0.6.0
// 

public final class jxo
{
    public static final jxo.jxo$b c;
    public final exo a;
    public final kxo b;
    
    static {
        c = new jxo.jxo$b();
    }
    
    public jxo(final jxo.jxo$a jxo$a) {
        final exo a = jxo$a.a;
        pf8.r(a);
        this.a = a;
        final kxo b = jxo$a.b;
        pf8.r(b);
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && jxo.class == o.getClass()) {
            final int a = w4j.a;
            final jxo jxo = (jxo)o;
            if (!w4j.a((Object)this.a, (Object)jxo.a) || !w4j.a((Object)this.b, (Object)jxo.b)) {
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
