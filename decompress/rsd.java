import android.os.Build$VERSION;
import java.util.Objects;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rsd extends ste implements qsb<List<? extends lsi>, fzv>
{
    public final ssd D0;
    public final tsd E0;
    public final lsi F0;
    
    public rsd(final ssd d0, final tsd e0, final lsi f0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final List list = (List)o;
        czd.f((Object)list, "notifications");
        final ssd d0 = this.D0;
        final int size = lfr.a(list).size();
        Objects.requireNonNull(d0);
        if (Build$VERSION.SDK_INT >= 23 && d0.c.k().size() != size) {
            final af4 af4 = new af4();
            ((u0p)af4).T = vba.Companion.e("notification", "database", "", "", "count_error").toString();
            final int a = c5j.a;
            cbw.b((elm)af4);
        }
        final tsd e0 = this.E0;
        if (e0 != null) {
            e0.a(this.F0, list);
        }
        return fzv.a;
    }
}
