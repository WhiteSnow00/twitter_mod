import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ksf
{
    public static final a Companion;
    public final nnl<cit> a;
    public final w19 b;
    
    static {
        Companion = new a();
    }
    
    public ksf() {
        this.a = (nnl<cit>)new nnl();
        this.b = new w19();
    }
    
    public final void a(final cit cit) {
        if (cit instanceof cit$d) {
            this.b.c(rw0.l(TimeUnit.MILLISECONDS, 5000L, (oj)new wp1((Object)this, 5)));
        }
        else if (cit instanceof cit$a) {
            this.b.a();
        }
        else {
            this.a.onNext((Object)cit);
        }
    }
    
    public static final class a
    {
    }
}
