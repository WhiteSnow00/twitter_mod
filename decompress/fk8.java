// 
// Decompiled by Procyon v0.6.0
// 

public abstract class fk8<A, Res> extends mp1<A, Res>
{
    public fk8(final Class<Res> clazz) {
        super((Class)clazz, (String)null);
    }
    
    public fk8(final Class<Res> clazz, final String s) {
        super((Class)clazz, s);
    }
    
    public final trc f(final A a) {
        final adv adv = new adv();
        this.i(adv, a);
        return adv.k();
    }
    
    public abstract void i(final trc$a p0, final A p1);
}
