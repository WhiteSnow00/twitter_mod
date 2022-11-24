import com.twitter.weaver.mvi.MviViewModel;
import androidx.appcompat.app.f;
import android.content.res.Resources;
import java.util.Objects;
import com.twitter.rooms.manager.RoomStateManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class q6o implements p6o
{
    public final d8o a;
    public final RoomStateManager b;
    
    public q6o(final d8o a, final RoomStateManager b) {
        e0e.f((Object)a, "roomSharedContentManager");
        e0e.f((Object)b, "roomStateManager");
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void a(final hp6 hp6, final zl1 zl1) {
        e0e.f((Object)hp6, "tweet");
        final d8o a = this.a;
        Objects.requireNonNull(a);
        p0b.J(a.d, znr.g((bbq)new upg((jqg)new spg((idq)a.b(), (ouk)new en0((stb)y7o.F0, 16)), (rtb)new x2i((stb)new b8o(a, hp6), 19)), (stb)c8o.F0, (stb)null, 2));
        final Resources resources = ((f)zl1).getResources();
        final lrn lrn = (lrn)((MviViewModel)this.b).S();
        e0e.e((Object)resources, "resources");
        final String o0 = jb2.o0(lrn, resources);
        final zfo$a companion = zfo.Companion;
        final q6s$a q6s$a = new q6s$a();
        final String string = resources.getString(2131958405, new Object[] { o0 });
        e0e.e((Object)string, "resources.getString(com.\u2026t_shared_in_space, title)");
        q6s$a.t(string);
        q6s$a.e = (rfd$c)rfd$c$b.b;
        q6s$a.r("");
        q6s$a.q(32);
        final q6s q6s = (q6s)((z4j)q6s$a).e();
        Objects.requireNonNull(companion);
        new zfo(zl1).f(q6s);
    }
}
