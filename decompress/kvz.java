// 
// Decompiled by Procyon v0.6.0
// 

public final class kvz implements jvz
{
    public static final hez a;
    
    static {
        final sez sez = new sez(wdz.a(), false, true);
        sez.c("measurement.sdk.collection.enable_extend_user_property_size", true);
        sez.c("measurement.sdk.collection.last_deep_link_referrer2", true);
        a = (hez)sez.c("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        sez.a("measurement.id.sdk.collection.last_deep_link_referrer2", 0L);
    }
    
    public final boolean a() {
        return (boolean)((afz)kvz.a).b();
    }
}
