import com.twitter.rooms.model.helpers.RoomUserItem;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kio extends ste implements qsb<u0n$a, fzv>
{
    public final RoomUserItem D0;
    public final vio E0;
    
    public kio(final RoomUserItem d0, final vio e0) {
        this.D0 = d0;
        this.E0 = e0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final u0n$a u0n$a = (u0n$a)o;
        if (czd.a((Object)this.D0.getTwitterUserId(), (Object)u0n$a.b) || czd.a((Object)this.D0.getPeriscopeUserId(), (Object)u0n$a.a)) {
            final t0a$a e = t0a.e(u0n$a.c, djo.h());
            if (e != null) {
                final vio e2 = this.E0;
                if (e.b != f1a.K0) {
                    b1n.p((nsb)new jio(e2, e));
                }
            }
        }
        return fzv.a;
    }
}
