// 
// Decompiled by Procyon v0.6.0
// 

public abstract class rj8<A, Res> extends kp1<A, Res>
{
    public rj8(final Class<Res> clazz) {
        super((Class)clazz, (String)null);
    }
    
    public rj8(final Class<Res> clazz, final String s) {
        super((Class)clazz, s);
    }
    
    public final qrc f(final A a) {
        final rbv rbv = new rbv();
        this.i((qrc.a)rbv, a);
        return ((qrc.a)rbv).k();
    }
    
    public abstract void i(final qrc.a p0, final A p1);
}
