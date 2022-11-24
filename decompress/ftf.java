import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ftf
{
    public static final a Companion;
    public final znl<uit> a;
    public final e39 b;
    
    static {
        Companion = new a();
    }
    
    public ftf() {
        this.a = (znl<uit>)new znl();
        this.b = new e39();
    }
    
    public final void a(final uit uit) {
        if (uit instanceof uit$d) {
            this.b.c(xw0.k(TimeUnit.MILLISECONDS, 5000L, (sj)new bq1((Object)this, 5)));
        }
        else if (uit instanceof uit$a) {
            this.b.a();
        }
        else {
            this.a.onNext((Object)uit);
        }
    }
    
    public static final class a
    {
    }
}
