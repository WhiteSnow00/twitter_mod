import java.util.Iterator;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class a10
{
    public static final a Companion;
    public final gew a;
    
    static {
        Companion = new a();
    }
    
    public a10(final gew a) {
        zzd.f((Object)a, "userManager");
        this.a = a;
    }
    
    public final boolean a() {
        return dta.d().b("android_scribe_loss_reporting_enabled", false);
    }
    
    public final void b(final z00 z00) {
        if (this.a() && z00.a.D0.b()) {
            final z8a z8a = new z8a((Throwable)z00.a);
            String s;
            if ((s = z00.b) == null) {
                s = this.a.b().getStringId();
            }
            z8a.b("user_id", (Object)s);
            z8a.b("logs_count", (Object)z00.c);
            for (final Map.Entry<String, V> entry : z00.d.entrySet()) {
                z8a.b((String)entry.getKey(), (Object)entry.getValue());
            }
            e9a.c(z8a);
        }
    }
    
    public static final class a
    {
    }
}
