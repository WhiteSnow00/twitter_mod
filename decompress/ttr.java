// 
// Decompiled by Procyon v0.6.0
// 

public final class ttr implements cdj
{
    public static final nmp<ttr> d;
    public final String b;
    public final int c;
    
    static {
        ttr.d = new ttr.ttr$a();
    }
    
    public ttr(final String b, final int c) {
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && ttr.class == o.getClass()) {
            final ttr ttr = (ttr)o;
            if (!o5j.a((Object)this.b, (Object)ttr.b) || !o5j.a((Object)this.c, (Object)ttr.c)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return o5j.g((Object)this.b, (Object)this.c);
    }
}
