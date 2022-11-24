import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oq6
{
    public static final a Companion;
    public final gcu a;
    public final k5j<mq6> b;
    
    static {
        Companion = new a();
    }
    
    public oq6(final gcu a, final k5j<mq6> b) {
        e0e.f((Object)a, "preferences");
        e0e.f((Object)b, "serializer");
        this.a = a;
        this.b = b;
    }
    
    public final void a(final mq6 mq6) {
        synchronized (this) {
            e0e.f((Object)mq6, "data");
            Objects.requireNonNull(oq6.Companion);
            if (ita.b().b("traffic_should_persist_trafficmap", true)) {
                final gcu$c i = this.a.i();
                if (mq6 == mq6.e) {
                    ((gcu$d)i).clear();
                }
                else {
                    ((gcu$d)i).a("map_data");
                    ((gcu$d)i).a("validation");
                    ((gcu$d)i).a("expiration_ms");
                    ((gcu$d)i).a("server_recommendations");
                    ((gcu$d)i).a("persisted_traffic_map");
                    ((gcu$d)i).h("control_tower_recommendations", (Object)mq6, (nmp)this.b);
                }
                i.e();
            }
        }
    }
    
    public static final class a
    {
    }
}
