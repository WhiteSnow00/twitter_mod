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

public final class k3f implements ysq
{
    public final zl1 a;
    public final kcm b;
    public final mxe<a> c;
    public final h5s d;
    
    public k3f(final UserIdentifier userIdentifier, final zl1 a, final kcm b, final mxe<a> c) {
        e0e.f((Object)userIdentifier, "userIdentifier");
        e0e.f((Object)b, "releaseCompletable");
        e0e.f((Object)c, "spacesLauncherFactory");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = (h5s)jty.N((ptb)new k3f$a(this));
        Trace.beginSection("SpacesLauncher#init");
        if (!ita.a(userIdentifier).b("android_growth_performance_holdback_lazy_spaces_initialization_enabled", false)) {
            c.get();
        }
        Trace.endSection();
    }
    
    @Override
    public final boolean A() {
        return this.v().A();
    }
    
    @Override
    public final void a(final String s, final boolean b) {
        qee.i((ysq)this, s, b);
    }
    
    @Override
    public final void b(final StationFeed stationFeed, final owt owt, final StationTrack$TrackData stationTrack$TrackData) {
        e0e.f((Object)owt, "track");
        this.v().b(stationFeed, owt, stationTrack$TrackData);
    }
    
    @Override
    public final void c(final String s) {
        this.v().c(s);
    }
    
    @Override
    public final void d(final String s) {
        e0e.f((Object)s, "roomId");
        this.v().d(s);
    }
    
    @Override
    public final void e(final String s, final String s2, final String s3, final String s4) {
        qee.k((ysq)this, s, s2, s3, s4);
    }
    
    @Override
    public final void f(final boolean b) {
        this.v().f(b);
    }
    
    @Override
    public final void g(final RoomHostKudosArgs roomHostKudosArgs) {
        e0e.f((Object)roomHostKudosArgs, "args");
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
        e0e.f((Object)s, "roomId");
        this.v().k(s);
    }
    
    @Override
    public final void l(final String s, final z21 z21, final ica ica, final boolean b, final boolean b2) {
        e0e.f((Object)s, "roomId");
        e0e.f((Object)z21, "participants");
        this.v().l(s, z21, ica, b, b2);
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
        e0e.f((Object)s, "roomId");
        e0e.f((Object)set, "topics");
        this.v().o(s, s2, n, b, set, b2, b3, b4);
    }
    
    @Override
    public final void p(final String s, final boolean b, final ica ica, final boolean b2, final boolean b3) {
        e0e.f((Object)s, "roomId");
        this.v().p(s, b, ica, b2, b3);
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
    public final void t(final String s, final boolean b, final ica ica) {
        qee.j((ysq)this, s, b, ica);
    }
    
    @Override
    public final void u(final String s) {
        e0e.f((Object)s, "url");
        this.v().u(s);
    }
    
    public final ysq v() {
        return (ysq)this.d.getValue();
    }
}
