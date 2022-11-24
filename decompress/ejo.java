import com.twitter.rooms.model.helpers.RoomUserItem;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ejo extends pue implements stb<jxn$a, vzv>
{
    public final RoomUserItem F0;
    public final njo G0;
    public final zio H0;
    
    public ejo(final RoomUserItem f0, final njo g0, final zio h0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final jxn$a jxn$a = (jxn$a)o;
        if (e0e.a((Object)this.F0.getTwitterUserId(), (Object)jxn$a.b) || e0e.a((Object)this.F0.getPeriscopeUserId(), (Object)jxn$a.a)) {
            jb2.y0((ptb)new djo(jxn$a, this.G0, this.H0));
        }
        return vzv.a;
    }
}
