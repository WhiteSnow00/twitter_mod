// 
// Decompiled by Procyon v0.6.0
// 

public final class n3a extends ob
{
    public static final n3a a;
    
    static {
        a = new n3a();
    }
    
    public n3a() {
        super((wg8)null);
    }
    
    public final boolean H(final elh<?> elh) {
        e0e.f((Object)elh, "key");
        return false;
    }
    
    public final <T> T J(final elh<T> elh) {
        e0e.f((Object)elh, "key");
        throw new IllegalStateException("".toString());
    }
}
