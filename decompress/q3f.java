// 
// Decompiled by Procyon v0.6.0
// 

public final class q3f<T> implements l9r<T>
{
    public final h5s F0;
    
    public q3f(final ptb<? extends T> ptb) {
        e0e.f((Object)ptb, "valueProducer");
        this.F0 = (h5s)jty.N(ptb);
    }
    
    public final T getValue() {
        return (T)this.F0.getValue();
    }
}
