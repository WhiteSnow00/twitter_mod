import java.util.Iterator;
import com.twitter.rooms.di.room.RoomObjectGraph;

// 
// Decompiled by Procyon v0.6.0
// 

public final class d7n
{
    public a a;
    public otb<gqn> b;
    public gub<? super String, ? super Boolean, oyv> c;
    public final m29 d;
    
    public d7n(final ibm ibm) {
        zzd.f((Object)ibm, "releaseCompletable");
        this.b = (otb<gqn>)d7n$b.C0;
        this.c = (gub<? super String, ? super Boolean, oyv>)d7n$c.C0;
        this.d = new m29();
        ibm.i((rj)new xak((Object)this, 24));
    }
    
    public static final void a(final d7n d7n, final v21 v21) {
        d7n.b();
        final gqn gqn = (gqn)d7n.b.invoke();
        if (gqn != null) {
            final RoomObjectGraph a = gqn.a;
            if (a != null) {
                final r6n$a y7 = a.Y7();
                final iu3 i = gqn.i;
                if (i != null) {
                    final r6n a2 = y7.a(i, rtn.a(v21), gqn.y);
                    if (gqn.c) {
                        ((t6n)a2).e();
                    }
                    else {
                        ((t6n)a2).j();
                    }
                    d7n.a = new a(a2, v21);
                }
            }
        }
    }
    
    public final void b() {
        final a a = this.a;
        if (a == null) {
            return;
        }
        final t6n t6n = (t6n)a.a;
        final xvc t = t6n.t;
        if (t == null) {
            zzd.m("callStatusCoordinator");
            throw null;
        }
        t.e(true);
        final Iterator iterator = t6n.H.iterator();
        while (iterator.hasNext()) {
            ((kpm)iterator.next()).g();
        }
        final svc g = t6n.g;
        g.d.a();
        g.b.b();
        final xvc t2 = t6n.t;
        if (t2 == null) {
            zzd.m("callStatusCoordinator");
            throw null;
        }
        t2.a();
        final v6e r = t6n.r;
        if (r == null) {
            zzd.m("janusVideoChatClientCoordinator");
            throw null;
        }
        r.a();
        r.m.e();
        final r6e s = t6n.s;
        if (s == null) {
            zzd.m("janusRoomSessionManagerDelegate");
            throw null;
        }
        s.b();
        s.k.a();
        final jxc q = t6n.q;
        if (q == null) {
            zzd.m("hydraGuestContainerCoordinator");
            throw null;
        }
        q.a();
        yn0.a(t6n.E());
        final oa3 u = t6n.u;
        if (u != null) {
            u.a.c();
            u.e.e();
            final sln i = t6n.I;
            if (i != null) {
                i.b();
            }
            r9x.f((j29)t6n.A);
            this.c.invoke((Object)a.b.h, (Object)Boolean.FALSE);
            this.a = null;
            return;
        }
        zzd.m("callerGuestSessionStateResolver");
        throw null;
    }
    
    public static final class a
    {
        public final r6n a;
        public final v21 b;
        
        public a(final r6n a, final v21 b) {
            zzd.f((Object)a, "roomCallInCoordinator");
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof a)) {
                return false;
            }
            final a a = (a)o;
            return zzd.a((Object)this.a, (Object)a.a) && zzd.a((Object)this.b, (Object)a.b);
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final r6n a = this.a;
            final v21 b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("CallInState(roomCallInCoordinator=");
            sb.append(a);
            sb.append(", audioSpace=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
}
