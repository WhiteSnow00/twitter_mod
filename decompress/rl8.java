import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rl8 implements tow
{
    public final bxo a;
    
    public rl8(final bxo a) {
        this.a = a;
    }
    
    public final t5j<wow> a(final wow wow) {
        return (t5j<wow>)t5j.just((Object)wow).delay(800L, TimeUnit.MILLISECONDS, this.a);
    }
}
