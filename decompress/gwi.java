// 
// Decompiled by Procyon v0.6.0
// 

public final class gwi extends gue implements rtb<Throwable, oyv>
{
    public static final gwi C0;
    
    static {
        C0 = new gwi();
    }
    
    public gwi() {
        super(1);
    }
    
    public final Object invoke(final Object o) {
        e9a.h((Throwable)new Exception("Could not create notification channels", (Throwable)o));
        return oyv.a;
    }
}
