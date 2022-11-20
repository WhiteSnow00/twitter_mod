// 
// Decompiled by Procyon v0.6.0
// 

public final class srv
{
    public static final rlp<srv> c;
    public final String a;
    public final i8t b;
    
    static {
        srv.c = new srv.srv$a();
    }
    
    public srv(final String a, final i8t b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && srv.class == o.getClass()) {
            final srv srv = (srv)o;
            if (!c5j.a((Object)this.a, (Object)srv.a) || !c5j.a((Object)this.b, (Object)srv.b)) {
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
