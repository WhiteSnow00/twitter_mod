import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class b0a implements eow
{
    public final gwo a;
    
    public b0a(final gwo a) {
        this.a = a;
    }
    
    public final h5j<how> a(final how how) {
        final int a = how.a;
        if (a == 3) {
            return (h5j<how>)h5j.just((Object)how);
        }
        if (a == 4) {
            return (h5j<how>)h5j.just((Object)how).delay(3000L, TimeUnit.MILLISECONDS, this.a);
        }
        return (h5j<how>)h5j.just((Object)how).delay(800L, TimeUnit.MILLISECONDS, this.a);
    }
}
