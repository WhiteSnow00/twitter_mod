import java.io.File;
import java.util.List;
import com.facebook.soloader.SoLoader;

// 
// Decompiled by Procyon v0.6.0
// 

public final class twj implements mai, dsy, kly
{
    public final int F0;
    
    public twj() {
        this.F0 = 2;
    }
    
    public twj(final int f0) {
        this.F0 = f0;
    }
    
    public twj(final pml pml, final f5j f5j) {
        this.F0 = 11;
        f5j.a(pml, ita.c().b("android_growth_performance_holdback_perf_optimize_app_scope_initializers", false));
    }
    
    public final /* bridge */ Object a() {
        switch (this.F0) {
            default: {
                return new mry();
            }
            case 4: {
                return new ony();
            }
        }
    }
    
    public final boolean b(final String s) {
        return SoLoader.l(s, 0);
    }
    
    public final Object[] c(final Object o, final List list, final List list2) {
        return (Object[])d4j.G0(o, "makePathElements", (Class)List.class, (Object)list, (Class)File.class, (Object)null, (Class)List.class, (Object)list2);
    }
}
