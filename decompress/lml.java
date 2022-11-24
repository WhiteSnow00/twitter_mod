// 
// Decompiled by Procyon v0.6.0
// 

public abstract class lml<T> extends df6<T>
{
    public lml(final ptb<? extends T> ptb) {
        e0e.f((Object)ptb, "defaultFactory");
        super((ptb)ptb, (wg8)null);
    }
    
    public final nml<T> b(final T t) {
        return (nml<T>)new nml((df6)this, (Object)t, true);
    }
}
