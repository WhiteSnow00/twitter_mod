// 
// Decompiled by Procyon v0.6.0
// 

public final class nvz implements mvz
{
    public static final hez a;
    
    static {
        final sez sez = new sez(wdz.a(), false, true);
        sez.a("measurement.id.lifecycle.app_in_background_parameter", 0L);
        sez.c("measurement.lifecycle.app_backgrounded_tracking", true);
        a = (hez)sez.c("measurement.lifecycle.app_in_background_parameter", false);
        sez.a("measurement.id.lifecycle.app_backgrounded_tracking", 0L);
    }
    
    @Override
    public final boolean a() {
        return (boolean)((afz)nvz.a).b();
    }
}
