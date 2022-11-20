import com.twitter.util.user.UserIdentifier;
import java.util.HashMap;
import com.twitter.app.dm.DMGroupParticipantsListController$a;
import com.twitter.app.dm.c;
import java.util.List;
import java.util.Collection;
import java.util.Objects;
import com.twitter.app.dm.DMGroupParticipantsListController;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wn7 implements iyj$a
{
    public final DMGroupParticipantsListController a;
    
    public wn7(final DMGroupParticipantsListController a) {
        this.a = a;
    }
    
    public final void a(final n3e<exj> n3e) {
        final DMGroupParticipantsListController a = this.a;
        Objects.requireNonNull(a);
        final rif$a rif$a = new rif$a(n3e.getSize());
        final rif$a rif$a2 = new rif$a(n3e.getSize());
        final n3e$b n3e$b = new n3e$b((n3e)n3e);
        final boolean b = false;
        int n = 0;
        while (n3e$b.hasNext()) {
            final exj exj = (exj)((pgz)n3e$b).next();
            if (exj != null && exj.I0 != null) {
                ((rif)rif$a).p((Object)exj.D0);
                ((HashMap<UserIdentifier, Boolean>)a.l).put(exj.I0.f(), Boolean.valueOf(exj.I0.M0));
                if (exj.L0) {
                    final boolean b2 = (n = ((exj.D0 == a.j.getId()) ? 1 : 0)) != 0;
                    if (a.k != 0) {
                        continue;
                    }
                    ((rif)rif$a2).p((Object)exj.I0);
                    n = (b2 ? 1 : 0);
                }
                else {
                    ((rif)rif$a2).p((Object)exj.I0);
                }
            }
        }
        a.b = fq4.H((Collection)((n4j)rif$a).e());
        ((plw)a.h).m((List)((n4j)rif$a2).e());
        final DMGroupParticipantsListController$a g = a.g;
        final int size = ((rif)rif$a).size();
        final c a2 = ((c.c$a)g).a;
        boolean i1 = b;
        if (n != 0) {
            i1 = b;
            if (a2.g1 == 0) {
                i1 = true;
            }
        }
        a2.i1 = i1;
        a2.h1 = size;
        a2.d1();
    }
    
    public final void b() {
        final DMGroupParticipantsListController a = this.a;
        Objects.requireNonNull(a);
        final gdd$b e0 = gdd.E0;
        final int a2 = c5j.a;
        a.b = fq4.H((Collection)e0);
        ((plw)a.h).m((List)e0);
    }
}
