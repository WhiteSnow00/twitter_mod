import com.twitter.rooms.model.AudioSpaceTopicItem;
import java.util.Set;
import com.twitter.rooms.subsystem.api.args.RoomHostKudosArgs;
import com.twitter.rooms.subsystem.api.models.StationTrack$TrackData;
import com.twitter.rooms.subsystem.api.models.StationFeed;

// 
// Decompiled by Procyon v0.6.0
// 

public interface grq
{
    boolean B();
    
    void a(final String p0, final boolean p1);
    
    void b(final StationFeed p0, final hvt p1, final StationTrack$TrackData p2);
    
    void c(final String p0);
    
    void d(final String p0);
    
    void e(final String p0, final String p1, final String p2, final String p3);
    
    void f(final boolean p0);
    
    void g(final RoomHostKudosArgs p0);
    
    boolean h();
    
    void i();
    
    void j();
    
    void k(final String p0);
    
    void l(final String p0, final x21 p1, final sba p2, final boolean p3, final boolean p4);
    
    void m();
    
    boolean n();
    
    void o(final String p0, final String p1, final Long p2, final boolean p3, final Set<AudioSpaceTopicItem> p4, final boolean p5, final boolean p6, final boolean p7);
    
    void p(final String p0, final boolean p1, final sba p2, final boolean p3, final boolean p4);
    
    boolean q();
    
    void r(final String p0);
    
    String s();
    
    void t(final String p0, final boolean p1, final sba p2);
    
    void u(final String p0);
    
    public interface a
    {
        grq a(final yl1 p0, final ibm p1);
    }
}
