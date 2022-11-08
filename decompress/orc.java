import android.content.Context;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class orc implements nrc
{
    public final xau a;
    public final br0 b;
    public final Set<String> c;
    
    public orc(final xau a, final Context context, final br0 b) {
        zzd.f((Object)a, "prefs");
        zzd.f((Object)context, "context");
        zzd.f((Object)b, "applicationInfoProvider");
        this.a = a;
        this.b = b;
        final String[] stringArray = context.getResources().getStringArray(2130903067);
        zzd.e((Object)stringArray, "context.resources.getStr\u2026array.http_client_values)");
        this.c = jt0.Y0((Object[])stringArray);
        zzd.e((Object)context.getResources().getStringArray(2130903066), "context.resources.getStr\u2026http_client_mock_entries)");
    }
    
    public final jsc a() {
        return new jsc(this.a.e("proxy_enabled", false), this.a.j("proxy_host", ""), this.a.j("proxy_port", ""));
    }
}
