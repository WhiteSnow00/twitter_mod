import java.io.File;
import java.util.Iterator;
import androidx.work.impl.WorkDatabase;
import java.util.Collection;
import java.util.Map;
import java.util.ArrayList;
import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class k4d implements Callable
{
    public final int D0;
    public final Object E0;
    
    public k4d(final Object e0, final int d0) {
        this.D0 = d0;
        this.E0 = e0;
    }
    
    @Override
    public final Object call() {
        switch (this.D0) {
            default: {
                final kyr kyr = (kyr)this.E0;
                Object f = kyr.f;
                synchronized (f) {
                    final Collection values = kyr.e.values();
                    monitorexit(f);
                    f = new ArrayList();
                    final Iterator iterator = values.iterator();
                    while (iterator.hasNext()) {
                        ((ArrayList)f).addAll(((Map<K, ? extends E>)iterator.next()).values());
                    }
                    final File[] listFiles = kyr.c().listFiles();
                    final ArrayList list = new ArrayList();
                    for (int length = listFiles.length, i = 0; i < length; ++i) {
                        list.add(listFiles[i].getName());
                    }
                    final Iterator iterator2 = ((ArrayList)f).iterator();
                    while (iterator2.hasNext()) {
                        final String s = (String)iterator2.next();
                        if (!list.contains(s)) {
                            kyr.b(s);
                            iterator2.remove();
                        }
                    }
                    for (final String s2 : list) {
                        if (!((ArrayList)f).contains(s2)) {
                            kyr.a(s2);
                        }
                    }
                    return tmi.a;
                }
                break;
            }
            case 4: {
                return ynj.b((Object)jxa.d().M1().b((jw9)this.E0, (xvg)xvg.a));
            }
            case 3: {
                final yqg$a yqg$a = (yqg$a)this.E0;
                final String n = n40.n(yqg$a.g.c, yqg$a.a);
                m1h m1h;
                if (n != null) {
                    m1h = m1h.b(n);
                }
                else {
                    m1h = m1h.H0;
                }
                ynj ynj;
                if (m1h != m1h.H0 && m1h != m1h.I0 && m1h != m1h.L0 && (m1h != m1h.J0 || !(yqg$a.c instanceof nww$d))) {
                    ynj = ynj.b;
                    final int a = c5j.a;
                }
                else {
                    ynj = ynj.b((Object)jw9.g(yqg$a.g.c, yqg$a.a, m1h, yqg$a.b, yqg$a.e));
                }
                return ynj;
            }
            case 2: {
                final hw0 hw0 = (hw0)this.E0;
                final Map map = (Map)hw0.a.g((dpo)new icv((Object)hw0, 2));
                jee.l((Object)map);
                return map;
            }
            case 1: {
                return ((env)this.E0).c(2131296258);
            }
            case 0: {
                final dg3 dg3 = (dg3)this.E0;
                czd.f((Object)dg3, "this$0");
                return xli.y((WorkDatabase)dg3.D0, "next_alarm_manager_id");
            }
        }
    }
}
