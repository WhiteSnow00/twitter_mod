import java.util.Objects;
import java.util.concurrent.Future;

// 
// Decompiled by Procyon v0.6.0
// 

public final class esc extends to1
{
    public final Future a;
    public final rci.a b;
    
    public esc(final Future a, final rci.a b) {
        this.a = a;
        this.b = b;
    }
    
    public final void b() {
        if (this.a.cancel(false)) {
            final qci$a qci$a = (qci$a)this.b;
            final qci b = qci$a.b;
            final qva a = qci$a.a;
            Objects.requireNonNull(b);
            a.a().g(a.b, "NetworkFetchProducer");
            a.a.a();
        }
    }
}
