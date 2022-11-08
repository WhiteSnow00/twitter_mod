// 
// Decompiled by Procyon v0.6.0
// 

public final class ytz implements xtz
{
    public static final tcz a;
    
    static {
        final edz edz = new edz(icz.a(), false, true);
        edz.c("measurement.sdk.collection.enable_extend_user_property_size", true);
        edz.c("measurement.sdk.collection.last_deep_link_referrer2", true);
        a = (tcz)edz.c("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        edz.a("measurement.id.sdk.collection.last_deep_link_referrer2", 0L);
    }
    
    @Override
    public final boolean a() {
        return (boolean)((mdz)ytz.a).b();
    }
}
