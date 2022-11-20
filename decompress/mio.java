import com.twitter.rooms.model.helpers.RoomUserItem;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mio extends ste implements qsb<rwn$a, fzv>
{
    public final RoomUserItem D0;
    public final vio E0;
    public final hio F0;
    
    public mio(final RoomUserItem d0, final vio e0, final hio f0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final rwn$a rwn$a = (rwn$a)o;
        if (czd.a((Object)this.D0.getTwitterUserId(), (Object)rwn$a.b) || czd.a((Object)this.D0.getPeriscopeUserId(), (Object)rwn$a.a)) {
            b1n.p((nsb)new lio(rwn$a, this.E0, this.F0));
        }
        return fzv.a;
    }
}
