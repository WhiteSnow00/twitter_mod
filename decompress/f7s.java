import java.util.concurrent.Callable;
import java.util.Iterator;
import java.util.Map;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class f7s implements e7s
{
    public final d6s a;
    public final fk7 b;
    
    public f7s(final d6s a, final fk7 b) {
        zzd.f((Object)a, "cache");
        this.a = a;
        this.b = b;
    }
    
    public final void a() {
        this.a.a();
    }
    
    public final void b(final i7s i7s) {
        this.a.b(i7s);
    }
    
    public final gvj<Set<x6s>, List<w6s>> c() {
        final LinkedHashSet set = new LinkedHashSet();
        final LinkedHashSet set2 = new LinkedHashSet();
        for (final Map.Entry<Object, V> entry : this.a.d().entrySet()) {
            set.add(entry.getKey());
            set2.add(((i7s)entry.getValue()).a);
        }
        return (gvj<Set<x6s>, List<w6s>>)new gvj((Object)set, (Object)or4.m2((Iterable)set2));
    }
    
    public final n9q<List<i7s>> d() {
        return (n9q<List<i7s>>)n9q.t((Callable)new mew((Object)this, 1)).j((fk6)new ccj((rtb)new f7s$a((Object)this.a), 20));
    }
    
    public final b5j<List<i7s>> e() {
        return this.a.e();
    }
}
