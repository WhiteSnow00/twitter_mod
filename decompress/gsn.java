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

public final class gsn
{
    public final dbr a;
    public final ibm b;
    public final Set<oit> c;
    public boolean d;
    public final List<mit> e;
    public final Map<qit, b5j<oit>> f;
    
    public gsn(final ocw ocw, final dbr a, ibm b) {
        zzd.f((Object)ocw, "userInfo");
        zzd.f((Object)a, "stationsPlaybackEventDispatcher");
        zzd.f((Object)b, "releaseCompletable");
        this.a = a;
        this.b = b;
        this.c = new LinkedHashSet();
        this.d = true;
        final UserIdentifier k = ocw.k();
        zzd.e((Object)k, "userInfo.userIdentifier");
        final rtb<rit, oyv> c0 = (rtb<rit, oyv>)gsn$c.C0;
        zzd.f((Object)c0, "block");
        final rit rit = new rit(k);
        c0.invoke(rit);
        final ArrayList b2 = rit.b;
        this.e = b2;
        final LinkedHashMap f = new LinkedHashMap();
        for (final mit mit : b2) {
            final qit a2 = mit.a;
            final b5j distinctUntilChanged = ((b5j)mit.c).distinctUntilChanged();
            zzd.e((Object)distinctUntilChanged, "nextTooltipObservable.distinctUntilChanged()");
            f.put(a2, distinctUntilChanged);
        }
        this.f = f;
        final zml<dbr.a> a3 = this.a.a;
        b = this.b;
        final m29 m29 = new m29();
        ((iz5)b.D0).q((rj)new rj() {
            public final void run() {
                m29.a();
            }
        });
        m29.c(((b5j)a3).subscribe((fk6)new f$b3((rtb)new rtb<dbr.a, oyv>() {
            public final /* synthetic */ gsn C0;
            
            public final Object invoke(final Object o) {
                final dbr.a a = (dbr.a)o;
                if (a instanceof dbr$a$d) {
                    this.C0.d = false;
                }
                else if (a instanceof dbr$a$a) {
                    this.C0.d = true;
                }
                return oyv.a;
            }
        })));
    }
    
    public final boolean a(final oit oit) {
        zzd.f((Object)oit, "tooltipName");
        final boolean contains = this.c.contains(oit);
        boolean b = true;
        if (contains) {
            return true;
        }
        final ArrayList e = this.e;
        Label_0184: {
            if (!(e instanceof Collection) || !e.isEmpty()) {
                final Iterator iterator = e.iterator();
                while (iterator.hasNext()) {
                    final List b2 = ((mit)iterator.next()).b;
                    boolean b3 = false;
                    Label_0174: {
                        if (!(b2 instanceof Collection) || !b2.isEmpty()) {
                            for (final nit nit : b2) {
                                if (nit.b == oit && nit.a()) {
                                    b3 = true;
                                    break Label_0174;
                                }
                            }
                        }
                        b3 = false;
                    }
                    if (b3) {
                        break Label_0184;
                    }
                }
            }
            b = false;
        }
        if (b) {
            this.c.add(oit);
        }
        return b;
    }
    
    public final b5j<oit> b(final qit qit) {
        b5j never;
        if ((never = this.f.get(qit)) == null) {
            never = b5j.never();
            zzd.e((Object)never, "never()");
        }
        return (b5j<oit>)never;
    }
}
