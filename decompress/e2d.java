import java.io.Closeable;
import java.util.ArrayList;
import java.util.Objects;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class e2d extends gue implements rtb<t98, List<Object>>
{
    public final /* synthetic */ f2d<Object, Object> C0;
    public final /* synthetic */ zrl D0;
    
    public e2d(final f2d<Object, Object> c0, final zrl d0) {
        this.C0 = c0;
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(Object o) {
        zzd.f((Object)o, "it");
        final f2d<Object, Object> c0 = this.C0;
        final zrl d0 = this.D0;
        Objects.requireNonNull((f2d)c0);
        final ArrayList list = new ArrayList();
        o = c0.C0.e(d0);
        try {
            while (((j0m)o).moveToNext()) {
                list.add(c0.D0.c(((j0m)o).a()));
            }
            pf8.s((Closeable)o, null);
            o = ced.g((List)list);
            zzd.e(o, "wrap(list)");
            return o;
        }
        finally {
            try {}
            finally {
                final Throwable t;
                pf8.s((Closeable)o, t);
            }
        }
    }
}
