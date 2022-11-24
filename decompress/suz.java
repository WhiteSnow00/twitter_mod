// 
// Decompiled by Procyon v0.6.0
// 

public final class suz implements ruz
{
    public static final hez a;
    public static final hez b;
    
    static {
        final sez sez = new sez(wdz.a(), true, true);
        sez.c("measurement.collection.event_safelist", true);
        a = (hez)sez.c("measurement.service.store_null_safelist", true);
        b = (hez)sez.c("measurement.service.store_safelist", true);
    }
    
    public final void a() {
    }
    
    public final boolean c() {
        return (boolean)((afz)suz.a).b();
    }
    
    public final boolean d() {
        return (boolean)((afz)suz.b).b();
    }
}
