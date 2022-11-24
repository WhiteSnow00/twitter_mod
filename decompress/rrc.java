import android.content.Context;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rrc implements qrc
{
    public final gcu a;
    public final vq0 b;
    public final Set<String> c;
    
    public rrc(final gcu a, final Context context, final vq0 b) {
        e0e.f((Object)a, "prefs");
        e0e.f((Object)context, "context");
        e0e.f((Object)b, "applicationInfoProvider");
        this.a = a;
        this.b = b;
        final String[] stringArray = context.getResources().getStringArray(2130903067);
        e0e.e((Object)stringArray, "context.resources.getStr\u2026array.http_client_values)");
        this.c = ft0.s1((Object[])stringArray);
        e0e.e((Object)context.getResources().getStringArray(2130903066), "context.resources.getStr\u2026http_client_mock_entries)");
    }
    
    @Override
    public final nsc a() {
        return new nsc(this.a.e("proxy_enabled", false), this.a.j("proxy_host", ""), this.a.j("proxy_port", ""));
    }
}
