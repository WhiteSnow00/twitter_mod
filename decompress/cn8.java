// 
// Decompiled by Procyon v0.6.0
// 

public final class cn8 implements Runnable
{
    public final ktx F0;
    public final dn8 G0;
    
    public cn8(final dn8 g0, final ktx f0) {
        this.G0 = g0;
        this.F0 = f0;
    }
    
    @Override
    public final void run() {
        final jag e = jag.e();
        final String d = dn8.d;
        final StringBuilder f = ehk.f("Scheduling work ");
        f.append(this.F0.a);
        e.a(d, f.toString());
        this.G0.a.d(this.F0);
    }
}
