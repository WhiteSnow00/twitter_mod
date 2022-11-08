// 
// Decompiled by Procyon v0.6.0
// 

public final class ptz implements otz
{
    public static final tcz a;
    public static final tcz b;
    public static final tcz c;
    
    static {
        final edz edz = new edz(icz.a(), false, true);
        edz.c("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        a = (tcz)edz.c("measurement.audience.refresh_event_count_filters_timestamp", false);
        b = (tcz)edz.c("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        c = (tcz)edz.c("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }
    
    public final void a() {
    }
    
    public final boolean c() {
        return (boolean)((mdz)ptz.a).b();
    }
    
    public final boolean d() {
        return (boolean)((mdz)ptz.b).b();
    }
    
    public final boolean e() {
        return (boolean)((mdz)ptz.c).b();
    }
}
