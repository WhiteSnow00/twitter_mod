// 
// Decompiled by Procyon v0.6.0
// 

public final class ekg
{
    public fkg.n a;
    
    public final fkg.n a() {
        return (fkg.n)lqh.a((Object)this.a, (Object)fkg.n.D0);
    }
    
    public final fkg.n b() {
        return (fkg.n)lqh.a((Object)null, (Object)fkg.n.D0);
    }
    
    @Override
    public final String toString() {
        final lqh$a lqh$a = new lqh$a(ekg.class.getSimpleName());
        final fkg.n a = this.a;
        if (a != null) {
            final String s = mru.s(a.toString());
            final lqh$a$b lqh$a$b = new lqh$a$b();
            lqh$a.c.c = lqh$a$b;
            lqh$a.c = lqh$a$b;
            lqh$a$b.b = s;
            lqh$a$b.a = "keyStrength";
        }
        return lqh$a.toString();
    }
}
