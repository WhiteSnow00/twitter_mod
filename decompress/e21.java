import kotlin.NoWhenBranchMatchedException;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class e21 implements ay9<d21>
{
    public final fxe<g21> C0;
    public final gpf D0;
    public final hxn E0;
    
    public e21(final fxe<g21> c0, final gpf d0, final hxn e0) {
        zzd.f((Object)c0, "audioSpaceHeroSpaceStarter");
        zzd.f((Object)d0, "scribe");
        zzd.f((Object)e0, "roomReminderToaster");
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
    }
    
    public final void s(final Object o) {
        final d21 d21 = (d21)o;
        zzd.f((Object)d21, "effect");
        if (d21 instanceof d21$c) {
            final g21 g21 = (g21)this.C0.get();
            final d21$c d21$c = (d21$c)d21;
            final String a = d21$c.a;
            Objects.requireNonNull(g21);
            zzd.f((Object)a, "roomId");
            yqh.q(g21.a, a, false, (sba)null, true, false, 22, (Object)null);
            final gpf d22 = this.D0;
            final String a2 = d21$c.a;
            Objects.requireNonNull(d22);
            zzd.f((Object)a2, "broadcastId");
            d22.c(nca.Companion.e("live_event_timeline", "", "", "audiospace_join_live_button", "click"), (szo)d22.a(a2).a());
        }
        else if (d21 instanceof d21$e) {
            final g21 g22 = (g21)this.C0.get();
            final d21$e d21$e = (d21$e)d21;
            final String a3 = d21$e.a;
            Objects.requireNonNull(g22);
            zzd.f((Object)a3, "roomId");
            g22.a.k(a3);
            final gpf d23 = this.D0;
            final String a4 = d21$e.a;
            final boolean b = d21$e.b;
            Objects.requireNonNull(d23);
            zzd.f((Object)a4, "broadcastId");
            d23.c(nca.Companion.e("live_event_carousel", "", "", "audiospace_reminder_header", "click"), (szo)d23.b(a4, b));
        }
        else if (d21 instanceof d21$d) {
            final g21 g23 = (g21)this.C0.get();
            final d21$d d21$d = (d21$d)d21;
            final String a5 = d21$d.a;
            Objects.requireNonNull(g23);
            zzd.f((Object)a5, "roomId");
            g23.a.c(a5);
            final gpf d24 = this.D0;
            final String a6 = d21$d.a;
            Objects.requireNonNull(d24);
            zzd.f((Object)a6, "broadcastId");
            d24.c(nca.Companion.e("live_event_timeline", "", "", "audiospace_start_replay_button", "click"), (szo)d24.a(a6).a());
        }
        else if (zzd.a((Object)d21, (Object)d21$a.a)) {
            this.E0.b();
        }
        else {
            if (!(d21 instanceof d21$b)) {
                throw new NoWhenBranchMatchedException();
            }
            final hxn e0 = this.E0;
            final d21$b d21$b = (d21$b)d21;
            e0.c(d21$b.a, d21$b.b, d21$b.c);
        }
    }
}
