// 
// Decompiled by Procyon v0.6.0
// 

public final class btz implements atz
{
    public static final idz a;
    public static final idz b;
    public static final idz c;
    public static final idz d;
    
    static {
        final tdz tdz = new tdz(xcz.a(), true, true);
        a = (idz)tdz.c("measurement.enhanced_campaign.client", true);
        b = (idz)tdz.c("measurement.enhanced_campaign.service", true);
        c = (idz)tdz.c("measurement.enhanced_campaign.srsltid.client", true);
        d = (idz)tdz.c("measurement.enhanced_campaign.srsltid.service", true);
    }
    
    public final void a() {
    }
    
    public final boolean c() {
        return (boolean)((bez)btz.a).b();
    }
    
    public final boolean d() {
        return (boolean)((bez)btz.b).b();
    }
    
    public final boolean e() {
        return (boolean)((bez)btz.c).b();
    }
    
    public final boolean f() {
        return (boolean)((bez)btz.d).b();
    }
}
