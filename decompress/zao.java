import com.twitter.rooms.di.room.RoomObjectGraph;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zao extends ste implements qsb<RoomObjectGraph, fzv>
{
    public static final zao D0;
    
    static {
        D0 = new zao();
    }
    
    public zao() {
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final RoomObjectGraph roomObjectGraph = (RoomObjectGraph)o;
        czd.f((Object)roomObjectGraph, "$this$withCurrentRoom");
        roomObjectGraph.s3().a("request.ogg", true);
        return fzv.a;
    }
}
