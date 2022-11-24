import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class b3z<ResultT> implements n7z<ResultT>
{
    public final Executor a;
    public final Object b;
    public final nkj<? super ResultT> c;
    
    public b3z(final Executor a, final nkj<? super ResultT> c) {
        this.b = new Object();
        this.a = a;
        this.c = c;
    }
    
    @Override
    public final void a(final crz crz) {
        if (crz.b()) {
            synchronized (this.b) {
                if (this.c == null) {
                    return;
                }
                monitorexit(this.b);
                this.a.execute((Runnable)new vlz((Object)this, (Object)crz, 3, (j98)null));
            }
        }
    }
}
