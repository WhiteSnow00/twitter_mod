import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class k8c extends nxj<l3t>
{
    public final l3t$b a;
    
    public k8c(final l3t$b a) {
        this.a = a;
    }
    
    public final Object parse(final qhe qhe) throws IOException {
        y4c.g();
        try {
            final rss b = uih.c(qhe, rss.class, false);
            l3t l3t;
            if (b != null) {
                final l3t$a l3t$a = new l3t$a();
                l3t$a.b = b;
                l3t$a.a = y4c.b();
                l3t$a.c = this.a;
                l3t = (l3t)((z4j)l3t$a).e();
            }
            else {
                l3t = null;
            }
            return l3t;
        }
        finally {
            y4c.h();
        }
    }
}
