import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class icj implements hcj
{
    public final qn a;
    public final gwo b;
    public final m8a c;
    
    public icj(final qn a, final gwo b, final m8a c) {
        czd.f((Object)a, "activityLifecycle");
        czd.f((Object)b, "scheduler");
        czd.f((Object)c, "errorReporter");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final t19 a(final oj oj) {
        final kog r = this.a.q().map((psb)new ap((qsb)icj$a.D0, 6)).filter((ytk)new di((qsb)icj$b.D0, 15)).firstElement().r(this.b);
        final gwo b = this.b;
        Objects.requireNonNull(b, "scheduler is null");
        return ((kog)new zpg((ppg)r, b)).p((lj6)new cpl((qsb)new icj$c(oj), 3), (lj6)new r58((qsb)new icj$d(this), 23), (oj)jub.c);
    }
}
