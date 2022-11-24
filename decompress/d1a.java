import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class d1a implements tow
{
    public final bxo a;
    
    public d1a(final bxo a) {
        this.a = a;
    }
    
    public final t5j<wow> a(final wow wow) {
        final int a = wow.a;
        if (a == 3) {
            return (t5j<wow>)t5j.just((Object)wow);
        }
        if (a == 4) {
            return (t5j<wow>)t5j.just((Object)wow).delay(3000L, TimeUnit.MILLISECONDS, this.a);
        }
        return (t5j<wow>)t5j.just((Object)wow).delay(800L, TimeUnit.MILLISECONDS, this.a);
    }
}
