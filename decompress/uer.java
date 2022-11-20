import com.twitter.rooms.subsystem.api.models.StationFeed;
import com.twitter.rooms.subsystem.api.models.StationTrack;

// 
// Decompiled by Procyon v0.6.0
// 

public final class uer
{
    public final mv1<ynj<StationTrack>> a;
    public final mv1<StationFeed> b;
    
    public uer() {
        this.a = (mv1<ynj<StationTrack>>)new mv1();
        this.b = (mv1<StationFeed>)new mv1();
    }
    
    public final void a(final StationTrack stationTrack) {
        this.a.onNext((Object)new ynj((Object)stationTrack));
    }
}
