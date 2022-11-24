import com.twitter.rooms.subsystem.api.models.StationFeed;
import com.twitter.rooms.subsystem.api.models.StationTrack;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rfr
{
    public final uv1<noj<StationTrack>> a;
    public final uv1<StationFeed> b;
    
    public rfr() {
        this.a = (uv1<noj<StationTrack>>)new uv1();
        this.b = (uv1<StationFeed>)new uv1();
    }
    
    public final void a(final StationTrack stationTrack) {
        this.a.onNext((Object)new noj((Object)stationTrack));
    }
}
