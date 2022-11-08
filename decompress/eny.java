import android.os.BaseBundle;
import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;
import java.util.Collections;
import java.util.List;
import android.os.Bundle;
import java.util.Random;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eny implements qfz
{
    public final /* synthetic */ wxy a;
    
    public eny(final wxy a) {
        this.a = a;
    }
    
    public final long c() {
        final wxy a = this.a;
        Objects.requireNonNull(a);
        final omy omy = new omy();
        a.b((jvy)new cty(a, omy));
        final Long n = (Long)omy.D1(omy.x(500L), (Class)Long.class);
        long longValue;
        if (n == null) {
            final long nextLong = new Random(System.nanoTime() ^ System.currentTimeMillis()).nextLong();
            final int d = a.d + 1;
            a.d = d;
            longValue = nextLong + d;
        }
        else {
            longValue = n;
        }
        return longValue;
    }
    
    public final String h() {
        final wxy a = this.a;
        Objects.requireNonNull(a);
        final omy omy = new omy();
        a.b((jvy)new zpy(a, omy, 1));
        return omy.U0(50L);
    }
    
    public final String j() {
        final wxy a = this.a;
        Objects.requireNonNull(a);
        final omy omy = new omy();
        a.b((jvy)new oqy(a, omy, 1));
        return omy.U0(500L);
    }
    
    public final String k() {
        final wxy a = this.a;
        Objects.requireNonNull(a);
        final omy omy = new omy();
        a.b((jvy)new hty(a, omy));
        return omy.U0(500L);
    }
    
    public final String m() {
        final wxy a = this.a;
        Objects.requireNonNull(a);
        final omy omy = new omy();
        a.b((jvy)new tsy(a, (rky)omy, 0));
        return omy.U0(500L);
    }
    
    public final void n(final String s, final String s2, final Bundle bundle) {
        final wxy a = this.a;
        Objects.requireNonNull(a);
        a.b((jvy)new bvy(a, s, s2, bundle));
    }
    
    public final void o(final String s) {
        final wxy a = this.a;
        Objects.requireNonNull(a);
        a.b((jvy)new ory(a, s));
    }
    
    public final void p(final String s) {
        final wxy a = this.a;
        Objects.requireNonNull(a);
        a.b((jvy)new sry(a, s));
    }
    
    public final int q(final String s) {
        final wxy a = this.a;
        Objects.requireNonNull(a);
        final omy omy = new omy();
        a.b((jvy)new duy(a, s, omy));
        final Integer n = (Integer)omy.D1(omy.x(10000L), (Class)Integer.class);
        int intValue;
        if (n == null) {
            intValue = 25;
        }
        else {
            intValue = n;
        }
        return intValue;
    }
    
    public final List r(final String s, final String s2) {
        final wxy a = this.a;
        Objects.requireNonNull(a);
        final omy omy = new omy();
        a.b((jvy)new jqy(a, s, s2, omy));
        List<Object> emptyList;
        if ((emptyList = (List)omy.D1(omy.x(5000L), (Class)List.class)) == null) {
            emptyList = Collections.emptyList();
        }
        return emptyList;
    }
    
    public final Map s(final String s, final String s2, final boolean b) {
        final wxy a = this.a;
        Objects.requireNonNull(a);
        final omy omy = new omy();
        a.b((jvy)new pty(a, s, s2, b, omy));
        final Bundle x = omy.x(5000L);
        Map<Object, Object> emptyMap;
        if (x != null && ((BaseBundle)x).size() != 0) {
            final HashMap hashMap = new HashMap(((BaseBundle)x).size());
            final Iterator iterator = ((BaseBundle)x).keySet().iterator();
            while (true) {
                emptyMap = (Map<Object, Object>)hashMap;
                if (!iterator.hasNext()) {
                    break;
                }
                final String s3 = (String)iterator.next();
                final Object value = ((BaseBundle)x).get(s3);
                if (!(value instanceof Double) && !(value instanceof Long) && !(value instanceof String)) {
                    continue;
                }
                hashMap.put((Object)s3, value);
            }
        }
        else {
            emptyMap = Collections.emptyMap();
        }
        return emptyMap;
    }
    
    public final void t(final Bundle bundle) {
        final wxy a = this.a;
        Objects.requireNonNull(a);
        a.b((jvy)new zpy(a, bundle, 0));
    }
    
    public final void u(final String s, final String s2, final Bundle bundle) {
        final wxy a = this.a;
        Objects.requireNonNull(a);
        a.b((jvy)new eqy(a, s, s2, bundle));
    }
}
