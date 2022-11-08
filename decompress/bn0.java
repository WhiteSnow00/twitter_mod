// 
// Decompiled by Procyon v0.6.0
// 

public final class bn0
{
    public static final a Companion;
    public final xau a;
    public Long b;
    
    static {
        Companion = new a();
    }
    
    public bn0(final xau a, final zau zau) {
        zzd.f((Object)a, "preferences");
        zzd.f((Object)zau, "systemClock");
        this.a = a;
    }
    
    public final Long a() {
        final Long b = this.b;
        long n;
        if (b != null) {
            n = b;
        }
        else {
            n = this.a.d("app_init_average_measurement_ms", 0L);
        }
        Long value = n;
        if (value.longValue() <= 0L) {
            value = null;
        }
        return value;
    }
    
    public static final class a
    {
    }
}
