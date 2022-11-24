import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hn0 extends pue implements stb<dp9, fbj<kni>>
{
    public final int F0;
    
    public hn0(final int f0) {
        this.F0 = f0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final dp9 dp9 = (dp9)o;
        e0e.f((Object)dp9, "event");
        t5j t5j;
        if (dp9 instanceof dp9$g) {
            t5j = t5j.never();
        }
        else {
            t5j = t5j.empty().delay((long)this.F0, TimeUnit.SECONDS);
        }
        return t5j;
    }
}
