import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class e0g implements gnk$a
{
    public final /* synthetic */ c0g a;
    
    public e0g(final c0g a) {
        this.a = a;
    }
    
    public final void a() {
        final zml h0 = this.a.H0;
        Objects.requireNonNull(c0g.Companion);
        h0.onNext((Object)c0g.K0);
    }
    
    public final void b(final asv asv) {
        zzd.f((Object)asv, "event");
        final c0g a = this.a;
        final zml h0 = a.H0;
        final q0x a2 = azw.a((u8a)asv, a.D0);
        zzd.e((Object)a2, "createErrorObject(event, resources)");
        Objects.requireNonNull(a);
        String s;
        if (a2.a() && !a.E0.c()) {
            s = a.D0.getString(2131954779);
            zzd.e((Object)s, "resources.getString(com.\u2026t_video_connection_error)");
        }
        else if (a2.a()) {
            s = a.D0.getString(2131954780);
            zzd.e((Object)s, "resources.getString(com.\u2026vent_video_general_error)");
        }
        else if (a2.a == 1) {
            s = a.D0.getString(2131954781);
            zzd.e((Object)s, "{\n                resour\u2026cked_error)\n            }");
        }
        else {
            final String b = a2.b;
            zzd.e((Object)b, "error.message");
            if (ckr.h1((CharSequence)b)) {
                s = a.D0.getString(2131954780);
                zzd.e((Object)s, "resources.getString(\n   \u2026neral_error\n            )");
            }
            else {
                s = a2.b;
                zzd.e((Object)s, "error.message");
            }
        }
        h0.onNext((Object)new c0g.b(true, s, a2.a()));
    }
}
