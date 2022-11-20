// 
// Decompiled by Procyon v0.6.0
// 

public final class ng1 extends nb
{
    public tkh<?> a;
    
    public ng1(final tkh<?> a) {
        czd.f((Object)a, "element");
        super((rf8)null);
        this.a = a;
    }
    
    public final boolean H(final pkh<?> pkh) {
        czd.f((Object)pkh, "key");
        return pkh == this.a.getKey();
    }
    
    public final <T> T J(final pkh<T> pkh) {
        czd.f((Object)pkh, "key");
        if (pkh == this.a.getKey()) {
            return (T)this.a.getValue();
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
