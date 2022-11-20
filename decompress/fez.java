// 
// Decompiled by Procyon v0.6.0
// 

public final class fez<ResultT>
{
    public final dqz<ResultT> a;
    
    public fez() {
        this.a = new dqz<ResultT>();
    }
    
    public final boolean a(final Exception e) {
        final dqz<ResultT> a = this.a;
        synchronized (a.a) {
            final boolean c = a.c;
            boolean b = true;
            if (c) {
                monitorexit(a.a);
                b = false;
            }
            else {
                a.c = true;
                a.e = e;
                monitorexit(a.a);
                a.b.c((dqz)a);
            }
            return b;
        }
    }
    
    public final boolean b(final ResultT d) {
        final dqz<ResultT> a = this.a;
        synchronized (a.a) {
            boolean b;
            if (a.c) {
                monitorexit(a.a);
                b = false;
            }
            else {
                a.c = true;
                a.d = d;
                monitorexit(a.a);
                a.b.c((dqz)a);
                b = true;
            }
            return b;
        }
    }
}
