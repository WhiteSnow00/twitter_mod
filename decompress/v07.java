import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class v07 implements Callable<zas<Void>>
{
    public final /* synthetic */ gop C0;
    public final /* synthetic */ w07 D0;
    
    public v07(final w07 d0, final gop c0) {
        this.D0 = d0;
        this.C0 = c0;
    }
    
    @Override
    public final Object call() throws Exception {
        return w07.a(this.D0, this.C0);
    }
}
