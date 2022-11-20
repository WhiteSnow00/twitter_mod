// 
// Decompiled by Procyon v0.6.0
// 

public final class hck extends qdk
{
    public static final hck.hck$b r;
    public final pcj m;
    public final String n;
    public final boolean o;
    public final pcj p;
    public final Integer q;
    
    static {
        r = new hck.hck$b();
    }
    
    public hck(final hck.hck$a hck$a) {
        super((a)hck$a);
        final pcj o = hck$a.o;
        jee.l((Object)o);
        this.m = o;
        String n;
        if ((n = hck$a.n) == null) {
            n = "";
        }
        this.n = n;
        this.o = hck$a.p;
        this.p = hck$a.q;
        this.q = hck$a.r;
    }
    
    public final ssr b(final String s) {
        return (ssr)new gck(s, this);
    }
}
