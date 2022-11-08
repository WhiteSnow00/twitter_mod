import com.google.android.gms.common.api.AvailabilityException;
import java.util.Iterator;
import com.google.android.gms.common.api.d;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class i4y
{
    public final at0<wf0<?>, ph6> a;
    public final at0<wf0<?>, String> b;
    public final ebs<Map<wf0<?>, String>> c;
    public int d;
    public boolean e;
    
    public i4y(final Iterable<? extends d<?>> iterable) {
        this.b = (at0<wf0<?>, String>)new at0();
        this.c = (ebs<Map<wf0<?>, String>>)new ebs();
        this.e = false;
        this.a = (at0<wf0<?>, ph6>)new at0();
        final Iterator<? extends d<?>> iterator = iterable.iterator();
        while (iterator.hasNext()) {
            ((l7q)this.a).put((Object)((d)iterator.next()).h(), (Object)null);
        }
        this.d = ((l7q)((at0.c)this.a.keySet()).C0).E0;
    }
    
    public final void a(final wf0<?> wf0, final ph6 ph6, final String s) {
        ((l7q)this.a).put((Object)wf0, (Object)ph6);
        ((l7q)this.b).put((Object)wf0, (Object)s);
        --this.d;
        if (!ph6.s()) {
            this.e = true;
        }
        if (this.d == 0) {
            if (this.e) {
                this.c.a((Exception)new AvailabilityException((at0)this.a));
                return;
            }
            this.c.b((Object)this.b);
        }
    }
}
