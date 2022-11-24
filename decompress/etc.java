import java.util.Objects;
import java.util.concurrent.Future;

// 
// Decompiled by Procyon v0.6.0
// 

public final class etc extends zo1
{
    public final Future a;
    public final idi$a b;
    
    public etc(final Future a, final idi$a b) {
        this.a = a;
        this.b = b;
    }
    
    public final void b() {
        if (this.a.cancel(false)) {
            final idi$a idi$a = (idi$a)this.b;
            final hdi b = idi$a.b;
            final uwa a = idi$a.a;
            Objects.requireNonNull(b);
            a.a().g(a.b, "NetworkFetchProducer");
            a.a.a();
        }
    }
}
