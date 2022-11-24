import com.twitter.rooms.manager.RoomStateManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ceo implements beo
{
    public final RoomStateManager a;
    
    public ceo(final RoomStateManager a) {
        e0e.f((Object)a, "roomStateManager");
        this.a = a;
    }
    
    public final t5j<aeo> a() {
        final t5j map = this.a.D0((dpe)ceo$a.F0, new dpe[] { (dpe)ceo$b.F0 }).map((rtb)new uti((stb)ceo$c.F0, 20));
        e0e.e((Object)map, "roomStateManager.stateOb\u2026.map { it.mapToStatus() }");
        return (t5j<aeo>)map;
    }
}
