import java.util.Collection;
import java.util.Iterator;
import java.util.ArrayList;
import com.twitter.util.user.UserIdentifier;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.List;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vsn
{
    public final zbr a;
    public final xbm b;
    public final Set<ejt> c;
    public boolean d;
    public final List<cjt> e;
    public final Map<gjt, h5j<ejt>> f;
    
    public vsn(final adw adw, final zbr a, final xbm b) {
        czd.f((Object)adw, "userInfo");
        czd.f((Object)a, "stationsPlaybackEventDispatcher");
        czd.f((Object)b, "releaseCompletable");
        this.a = a;
        this.b = b;
        this.c = new LinkedHashSet();
        this.d = true;
        final UserIdentifier k = adw.k();
        czd.e((Object)k, "userInfo.userIdentifier");
        final vsn$c d0 = vsn$c.D0;
        czd.f((Object)d0, "block");
        final hjt hjt = new hjt(k);
        d0.invoke((Object)hjt);
        final ArrayList b2 = hjt.b;
        this.e = b2;
        final LinkedHashMap f = new LinkedHashMap();
        for (final cjt cjt : b2) {
            final gjt a2 = cjt.a;
            final h5j distinctUntilChanged = ((h5j)cjt.c).distinctUntilChanged();
            czd.e((Object)distinctUntilChanged, "nextTooltipObservable.distinctUntilChanged()");
            f.put(a2, distinctUntilChanged);
        }
        this.f = f;
        final nnl<zbr.a> a3 = this.a.a;
        final xbm b3 = this.b;
        final w19 w19 = new w19();
        ((sy5)b3.E0).q((oj)new oj(w19) {
            public final w19 D0;
            
            public final void run() {
                this.D0.a();
            }
        });
        w19.c(((h5j)a3).subscribe((lj6)new f$b3((qsb)new vsn$b(this))));
    }
    
    public final boolean a(final ejt ejt) {
        czd.f((Object)ejt, "tooltipName");
        final boolean contains = this.c.contains(ejt);
        boolean b = true;
        if (contains) {
            return true;
        }
        final ArrayList e = this.e;
        Label_0180: {
            if (!(e instanceof Collection) || !e.isEmpty()) {
                final Iterator iterator = e.iterator();
                while (iterator.hasNext()) {
                    final List b2 = ((cjt)iterator.next()).b;
                    boolean b3 = false;
                    Label_0171: {
                        if (!(b2 instanceof Collection) || !b2.isEmpty()) {
                            for (final djt djt : b2) {
                                if (djt.b == ejt && djt.a()) {
                                    b3 = true;
                                    break Label_0171;
                                }
                            }
                        }
                        b3 = false;
                    }
                    if (b3) {
                        break Label_0180;
                    }
                }
            }
            b = false;
        }
        if (b) {
            this.c.add(ejt);
        }
        return b;
    }
    
    public final h5j<ejt> b(final gjt gjt) {
        h5j never;
        if ((never = this.f.get(gjt)) == null) {
            never = h5j.never();
            czd.e((Object)never, "never()");
        }
        return (h5j<ejt>)never;
    }
}
