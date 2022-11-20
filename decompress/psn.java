import com.twitter.weaver.mvi.MviViewModel;
import android.content.Context;
import java.util.Arrays;
import com.twitter.rooms.audiospace.nudge.RoomNudgeViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class psn extends ste implements qsb<qsn, fzv>
{
    public final RoomNudgeViewModel D0;
    
    public psn(final RoomNudgeViewModel d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final qsn qsn = (qsn)o;
        czd.f((Object)qsn, "state");
        final RoomNudgeViewModel d0 = this.D0;
        final g7k r0 = d0.R0;
        final Context o2 = d0.O0;
        final String[] a = bi6.a;
        if (r0.a(o2, (String[])Arrays.copyOf(a, a.length))) {
            this.D0.Q0.E0(1, qsn.c);
        }
        else {
            ((MviViewModel)this.D0).V((Object)csn$d.a);
            final msn p = this.D0.P0;
            p.f((fsn)new fsn$e((String)p.g.c((Object)"")));
        }
        return fzv.a;
    }
}
