// 
// Decompiled by Procyon v0.6.0
// 

public final class mwk
{
    public static final alp<mwk> c;
    public final gav a;
    public final String b;
    
    static {
        mwk.c = new mwk.mwk$b();
    }
    
    public mwk(final mwk.mwk$a mwk$a) {
        this.a = mwk$a.a;
        this.b = mwk$a.b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && mwk.class == o.getClass()) {
            final mwk mwk = (mwk)o;
            if (!w4j.a((Object)this.a, (Object)mwk.a) || !w4j.a((Object)this.b, (Object)mwk.b)) {
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
