import java.util.LinkedHashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ku1
{
    public final xba<b3e<Object>> a;
    public final rv1 b;
    public final r8x c;
    public final Map<lca<f7x>, Long> d;
    
    public ku1(final xba<b3e<Object>> a, final rv1 b, final r8x c) {
        czd.f((Object)a, "eventObservable");
        czd.f((Object)b, "behavioralEventHelper");
        czd.f((Object)c, "viewLifecycle");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = new LinkedHashMap();
        final w19 w19;
        w19.c(a.v0().doOnComplete((oj)new gu1(w19 = new w19())).subscribe((lj6)new f$n((qsb)new hu1(this))));
        final w19 w20;
        w20.c(((caf)c).a().doOnComplete((oj)new iu1(w20 = new w19())).subscribe((lj6)new f$n((qsb)new ju1(this))));
    }
}
