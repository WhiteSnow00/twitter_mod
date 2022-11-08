import com.twitter.rooms.model.AudioSpaceTopicItem;
import java.util.Set;
import com.twitter.rooms.subsystem.api.args.RoomHostKudosArgs;
import com.twitter.rooms.subsystem.api.models.StationTrack$TrackData;
import com.twitter.rooms.subsystem.api.models.StationFeed;
import android.os.Trace;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class d3f implements grq
{
    public final yl1 a;
    public final ibm b;
    public final fxe<a> c;
    public final u3s d;
    
    public d3f(final UserIdentifier userIdentifier, final yl1 a, final ibm b, final fxe<a> c) {
        zzd.f((Object)userIdentifier, "userIdentifier");
        zzd.f((Object)b, "releaseCompletable");
        zzd.f((Object)c, "spacesLauncherFactory");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = (u3s)rp2.z0((otb)new d3f$a(this));
        Trace.beginSection("SpacesLauncher#init");
        if (!dta.a(userIdentifier).b("android_growth_performance_holdback_lazy_spaces_initialization_enabled", false)) {
            c.get();
        }
        Trace.endSection();
    }
    
    @Override
    public final boolean B() {
        return this.v().B();
    }
    
    @Override
    public final void b(final StationFeed stationFeed, final hvt hvt, final StationTrack$TrackData stationTrack$TrackData) {
        zzd.f((Object)hvt, "track");
        this.v().b(stationFeed, hvt, stationTrack$TrackData);
    }
    
    @Override
    public final void c(final String s) {
        this.v().c(s);
    }
    
    @Override
    public final void d(final String s) {
        zzd.f((Object)s, "roomId");
        this.v().d(s);
    }
    
    @Override
    public final void f(final boolean b) {
        this.v().f(b);
    }
    
    @Override
    public final void g(final RoomHostKudosArgs roomHostKudosArgs) {
        zzd.f((Object)roomHostKudosArgs, "args");
        this.v().g(roomHostKudosArgs);
    }
    
    @Override
    public final boolean h() {
        return this.v().h();
    }
    
    @Override
    public final void i() {
        this.v().i();
    }
    
    @Override
    public final void j() {
        this.v().j();
    }
    
    @Override
    public final void k(final String s) {
        zzd.f((Object)s, "roomId");
        this.v().k(s);
    }
    
    @Override
    public final void l(final String s, final x21 x21, final sba sba, final boolean b, final boolean b2) {
        zzd.f((Object)s, "roomId");
        zzd.f((Object)x21, "participants");
        this.v().l(s, x21, sba, b, b2);
    }
    
    @Override
    public final void m() {
        this.v().m();
    }
    
    @Override
    public final boolean n() {
        return this.v().n();
    }
    
    @Override
    public final void o(final String s, final String s2, final Long n, final boolean b, final Set<AudioSpaceTopicItem> set, final boolean b2, final boolean b3, final boolean b4) {
        zzd.f((Object)s, "roomId");
        zzd.f((Object)set, "topics");
        this.v().o(s, s2, n, b, set, b2, b3, b4);
    }
    
    @Override
    public final void p(final String s, final boolean b, final sba sba, final boolean b2, final boolean b3) {
        zzd.f((Object)s, "roomId");
        this.v().p(s, b, sba, b2, b3);
    }
    
    @Override
    public final boolean q() {
        return this.v().q();
    }
    
    @Override
    public final void r(final String s) {
        this.v().r(s);
    }
    
    @Override
    public final String s() {
        return this.v().s();
    }
    
    @Override
    public final void u(final String s) {
        zzd.f((Object)s, "url");
        this.v().u(s);
    }
    
    public final grq v() {
        return (grq)this.d.getValue();
    }
}
