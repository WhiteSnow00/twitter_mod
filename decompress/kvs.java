import java.util.concurrent.Callable;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kvs extends ste implements qsb<cua, ppg<? extends cua>>
{
    public final nvs D0;
    
    public kvs(final nvs d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final cua cua = (cua)o;
        czd.f((Object)cua, "action");
        final cxm c = this.D0.c;
        Objects.requireNonNull(c);
        return eaq.t((Callable)new pq3((Object)cua, (Object)c, 6)).O();
    }
}
