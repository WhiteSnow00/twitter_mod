// 
// Decompiled by Procyon v0.6.0
// 

public final class bvz implements avz
{
    public static final hez a;
    public static final hez b;
    public static final hez c;
    
    static {
        final sez sez = new sez(wdz.a(), false, true);
        sez.c("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        a = (hez)sez.c("measurement.audience.refresh_event_count_filters_timestamp", false);
        b = (hez)sez.c("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        c = (hez)sez.c("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }
    
    public final void a() {
    }
    
    public final boolean c() {
        return (boolean)((afz)bvz.a).b();
    }
    
    public final boolean d() {
        return (boolean)((afz)bvz.b).b();
    }
    
    public final boolean e() {
        return (boolean)((afz)bvz.c).b();
    }
}
