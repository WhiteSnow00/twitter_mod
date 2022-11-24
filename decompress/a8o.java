import com.twitter.rooms.di.room.RoomObjectGraph;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class a8o extends pue implements stb<e31, vzv>
{
    public final d8o F0;
    public final lrn G0;
    public final hp6 H0;
    
    public a8o(final d8o f0, final lrn g0, final hp6 h0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final e31 e31 = (e31)o;
        final d8o f0 = this.F0;
        final lrn g0 = this.G0;
        e0e.e((Object)g0, "state");
        final z7o z7o = new z7o(this.H0);
        Objects.requireNonNull(f0);
        final RoomObjectGraph a = g0.a;
        if (a != null) {
            z7o.invoke((Object)a);
        }
        return vzv.a;
    }
}
