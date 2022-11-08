import java.util.Iterator;
import com.twitter.util.user.UserIdentifier;
import java.util.Objects;
import java.util.ArrayList;
import com.twitter.rooms.ui.spacebar.FleetlineViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class a5b extends gue implements rtb<Iterable<? extends ul1>, oyv>
{
    public final /* synthetic */ FleetlineViewModel C0;
    
    public a5b(final FleetlineViewModel c0) {
        this.C0 = c0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final Iterable iterable = (Iterable)o;
        final FleetlineViewModel c0 = this.C0;
        if (c0.K0 != c0.F0.getSessionId()) {
            final FleetlineViewModel c2 = this.C0;
            c2.K0 = c2.F0.getSessionId();
            final gnq e0 = this.C0.E0;
            zzd.e((Object)iterable, "it");
            final ArrayList list = new ArrayList();
            for (final Object next : iterable) {
                if (((ul1)next).b() ^ true) {
                    list.add(next);
                }
            }
            final int size = list.size();
            final ArrayList<ul1> list2 = new ArrayList<ul1>();
            for (final Object next2 : iterable) {
                if (((ul1)next2).b()) {
                    list2.add((ul1)next2);
                }
            }
            final int size2 = list2.size();
            final long a = this.C0.D0.a();
            final long j0 = this.C0.J0;
            Objects.requireNonNull(e0);
            final zf4 zf4 = new zf4(new nca("home", "fleets", "fleet_line", "", "impression"));
            zf4.i((szo)new s3b(String.valueOf(e0.b.getSessionId()), UserIdentifier.Companion.c().getStringId(), Integer.valueOf(size), Integer.valueOf(size2), Long.valueOf(a - j0), -286978));
            e0.a.c((okm)zf4);
        }
        return oyv.a;
    }
}
