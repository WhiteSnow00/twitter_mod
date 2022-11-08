import com.google.android.exoplayer2.upstream.cache.Cache;
import java.util.Comparator;
import java.util.TreeSet;
import com.google.android.exoplayer2.upstream.cache.b;

// 
// Decompiled by Procyon v0.6.0
// 

public final class z3f implements b
{
    public final long a;
    public final TreeSet<z73> b;
    public long c;
    
    public z3f(final long a) {
        this.a = a;
        this.b = new TreeSet<z73>((Comparator<? super z73>)bfq.E0);
    }
    
    public final void a(final Cache cache, final z73 z73, final z73 z74) {
        this.c(cache, z73);
        this.f(cache, z74);
    }
    
    public final boolean b() {
        return true;
    }
    
    public final void c(final Cache cache, final z73 z73) {
        this.b.remove(z73);
        this.c -= z73.E0;
    }
    
    public final void d(final Cache cache, final String s, final long n, final long n2) {
        if (n2 != -1L) {
            this.g(cache, n2);
        }
    }
    
    public final void e() {
    }
    
    public final void f(final Cache cache, final z73 z73) {
        this.b.add(z73);
        this.c += z73.E0;
        this.g(cache, 0L);
    }
    
    public final void g(final Cache cache, final long n) {
        while (this.c + n > this.a && !this.b.isEmpty()) {
            cache.m((z73)this.b.first());
        }
    }
}
