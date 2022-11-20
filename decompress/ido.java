import com.twitter.rooms.manager.RoomStateManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ido implements hdo
{
    public final RoomStateManager a;
    
    public ido(final RoomStateManager a) {
        czd.f((Object)a, "roomStateManager");
        this.a = a;
    }
    
    public final h5j<gdo> a() {
        final h5j map = this.a.D0((foe)ido$a.D0, new foe[] { (foe)ido$b.D0 }).map((psb)new dti((qsb)ido$c.D0, 20));
        czd.e((Object)map, "roomStateManager.stateOb\u2026.map { it.mapToStatus() }");
        return (h5j<gdo>)map;
    }
}
