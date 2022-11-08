// 
// Decompiled by Procyon v0.6.0
// 

public final class buz implements auz
{
    public static final tcz a;
    
    static {
        final edz edz = new edz(icz.a(), false, true);
        edz.a("measurement.id.lifecycle.app_in_background_parameter", 0L);
        edz.c("measurement.lifecycle.app_backgrounded_tracking", true);
        a = (tcz)edz.c("measurement.lifecycle.app_in_background_parameter", false);
        edz.a("measurement.id.lifecycle.app_backgrounded_tracking", 0L);
    }
    
    @Override
    public final boolean a() {
        return (boolean)((mdz)buz.a).b();
    }
}
