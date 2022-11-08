import java.util.Iterator;
import java.util.Map;
import com.google.android.gms.common.api.Scope;
import java.util.Set;
import java.util.Objects;
import java.util.Collection;
import java.util.HashSet;
import java.util.Collections;
import com.google.android.gms.common.api.a;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class z0y extends d1y
{
    public final ArrayList<a.f> D0;
    public final /* synthetic */ e1y E0;
    
    public z0y(final e1y e0, final ArrayList<a.f> d0) {
        this.E0 = e0;
        super(e0);
        this.D0 = d0;
    }
    
    public final void a() {
        final e1y e0 = this.E0;
        final n1y m = e0.a.m;
        final fh4 r = e0.r;
        Set<Object> emptySet;
        if (r == null) {
            emptySet = Collections.emptySet();
        }
        else {
            emptySet = new HashSet<Object>(r.b);
            final Map<a<?>, g1y> d = e0.r.d;
            for (final a a : d.keySet()) {
                if (!e0.a.g.containsKey(a.b)) {
                    Objects.requireNonNull((Object)d.get(a));
                    emptySet.addAll(null);
                }
            }
        }
        m.R0 = emptySet;
        final ArrayList<a.f> d2 = this.D0;
        for (int size = d2.size(), i = 0; i < size; ++i) {
            final a.f f = (a.f)d2.get(i);
            final e1y e2 = this.E0;
            f.l(e2.o, e2.a.m.R0);
        }
    }
}
