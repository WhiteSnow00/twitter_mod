// 
// Decompiled by Procyon v0.6.0
// 

public final class qg1 extends ob
{
    public ilh<?> a;
    
    public qg1(final ilh<?> a) {
        e0e.f((Object)a, "element");
        super((wg8)null);
        this.a = a;
    }
    
    public final boolean H(final elh<?> elh) {
        e0e.f((Object)elh, "key");
        return elh == this.a.getKey();
    }
    
    public final <T> T J(final elh<T> elh) {
        e0e.f((Object)elh, "key");
        if (elh == this.a.getKey()) {
            return (T)this.a.getValue();
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
