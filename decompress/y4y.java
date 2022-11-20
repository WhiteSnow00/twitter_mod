import com.google.android.gms.common.api.AvailabilityException;
import java.util.Iterator;
import com.google.android.gms.common.api.d;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class y4y
{
    public final ts0<sf0<?>, vg6> a;
    public final ts0<sf0<?>, String> b;
    public final zbs<Map<sf0<?>, String>> c;
    public int d;
    public boolean e;
    
    public y4y(final Iterable<? extends d<?>> iterable) {
        this.b = (ts0<sf0<?>, String>)new ts0();
        this.c = (zbs<Map<sf0<?>, String>>)new zbs();
        this.e = false;
        this.a = (ts0<sf0<?>, vg6>)new ts0();
        final Iterator<? extends d<?>> iterator = iterable.iterator();
        while (iterator.hasNext()) {
            ((d8q<sf0<?>, vg6>)this.a).put(((d<?>)iterator.next()).h(), null);
        }
        this.d = ((d8q)((ts0$c)this.a.keySet()).D0).F0;
    }
    
    public final void a(final sf0<?> sf0, final vg6 vg6, final String s) {
        ((d8q<sf0<?>, vg6>)this.a).put(sf0, vg6);
        ((d8q<sf0<?>, String>)this.b).put(sf0, s);
        --this.d;
        if (!vg6.s()) {
            this.e = true;
        }
        if (this.d == 0) {
            if (this.e) {
                this.c.a((Exception)new AvailabilityException(this.a));
                return;
            }
            this.c.b((Object)this.b);
        }
    }
}
