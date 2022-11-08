import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cfk
{
    public final g1g a;
    public final mci b;
    
    public cfk(final Context context, final psc psc, final mci b) {
        this.a = new g1g(context, psc);
        this.b = b;
    }
    
    public static cfk a() {
        return ((h1g)((v4j)ir0.a()).B((Class)h1g.class)).X();
    }
    
    public final b5j<l49> b(final String a) {
        final lfk$a lfk$a = new lfk$a();
        lfk$a.b = kfk.G0;
        lfk$a.a = a;
        return (b5j<l49>)this.a.c((lfk)((h4j)lfk$a).e()).cast((Class)l49.class);
    }
    
    public final b5j<p0c> c(final kfk b, final long n, final kdi kdi) {
        final lfk$a lfk$a = new lfk$a();
        lfk$a.b = b;
        lfk$a.a = n;
        return (b5j<p0c>)this.a.c((lfk)((h4j)lfk$a).e()).filter((ptk)new cfk.cfk$a(this)).cast((Class)p0c.class);
    }
    
    public final b5j<wmv> d(final String a) {
        final lfk$a lfk$a = new lfk$a();
        lfk$a.b = kfk.F0;
        lfk$a.a = a;
        return (b5j<wmv>)this.a.c((lfk)((h4j)lfk$a).e()).cast((Class)wmv.class);
    }
}
