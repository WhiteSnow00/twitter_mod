import java.util.List;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class r83 implements kqr
{
    public final gqr a;
    public final bbq<qor> b;
    public final h5s c;
    
    public r83(final gqr a, final r9a r9a) {
        e0e.f((Object)a, "subscriptionsProductFeaturePersistence");
        e0e.f((Object)r9a, "errorReporter");
        this.a = a;
        final bbq b = a.b();
        final gpl gpl = new gpl((stb)new r83$a((Object)r9a), 28);
        Objects.requireNonNull(b);
        this.b = new ebq((idq)new zbq((idq)b, (rk6)gpl));
        this.c = (h5s)jty.N((ptb)r83$b.F0);
    }
    
    public static final Set b(final r83 r83, final Set set) {
        Objects.requireNonNull(r83);
        final LinkedHashSet set2 = new LinkedHashSet();
        for (final Object next : set) {
            final List i = ((por)next).i;
            final boolean empty = i.isEmpty();
            final int n = 1;
            int n2 = 0;
            Label_0147: {
                if (empty ^ true) {
                    final rmv rmv = (rmv)r83.c.getValue();
                    boolean b = false;
                    Label_0136: {
                        if (!i.isEmpty()) {
                            final Iterator iterator2 = i.iterator();
                            while (iterator2.hasNext()) {
                                if (!rmv.b((String)iterator2.next(), false)) {
                                    b = false;
                                    break Label_0136;
                                }
                            }
                        }
                        b = true;
                    }
                    if (b) {
                        n2 = n;
                        break Label_0147;
                    }
                }
                n2 = 0;
            }
            if (n2 != 0) {
                set2.add(next);
            }
        }
        return set2;
    }
    
    @Override
    public final bbq<Set<por>> a() {
        return (bbq<Set<por>>)((bbq)this.b).w((rtb)new uyn((stb)new r83$c(this), 25));
    }
    
    @Override
    public final bbq<Set<por>> getSettings() {
        return (bbq<Set<por>>)((bbq)this.b).w((rtb)new w1n((stb)new r83$d(this), 25));
    }
}
