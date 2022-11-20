import android.os.Message;
import java.util.Objects;
import java.util.ArrayList;
import android.os.Handler;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class s5s implements obc
{
    public static final List<a> b;
    public final Handler a;
    
    static {
        s5s.b = new ArrayList(50);
    }
    
    public s5s(final Handler a) {
        this.a = a;
    }
    
    public static a l() {
        final ArrayList b = s5s.b;
        synchronized (b) {
            a a;
            if (b.isEmpty()) {
                a = new a();
            }
            else {
                a = b.remove(b.size() - 1);
            }
            return a;
        }
    }
    
    @Override
    public final boolean a() {
        return this.a.hasMessages(0);
    }
    
    @Override
    public final obc.a b(final int n) {
        final a l = l();
        l.a = this.a.obtainMessage(n);
        return l;
    }
    
    @Override
    public final void c() {
        this.a.removeCallbacksAndMessages((Object)null);
    }
    
    @Override
    public final obc.a d(final int n, final Object o) {
        final a l = l();
        l.a = this.a.obtainMessage(n, o);
        return l;
    }
    
    @Override
    public final obc.a e(final int n, final int n2, final int n3) {
        final a l = l();
        l.a = this.a.obtainMessage(n, n2, n3);
        return l;
    }
    
    @Override
    public final obc.a f(final int n, final Object o) {
        final a l = l();
        l.a = this.a.obtainMessage(20, 0, n, o);
        return l;
    }
    
    @Override
    public final boolean g(final obc.a a) {
        final a a2 = (a)a;
        final Handler a3 = this.a;
        final Message a4 = a2.a;
        Objects.requireNonNull(a4);
        final boolean sendMessageAtFrontOfQueue = a3.sendMessageAtFrontOfQueue(a4);
        a2.a();
        return sendMessageAtFrontOfQueue;
    }
    
    @Override
    public final void h() {
        this.a.removeMessages(2);
    }
    
    @Override
    public final boolean i(final Runnable runnable) {
        return this.a.post(runnable);
    }
    
    @Override
    public final boolean j(final long n) {
        return this.a.sendEmptyMessageAtTime(2, n);
    }
    
    @Override
    public final boolean k(final int n) {
        return this.a.sendEmptyMessage(n);
    }
    
    public static final class a implements obc.a
    {
        public Message a;
        
        public final void a() {
            this.a = null;
            final ArrayList b = s5s.b;
            synchronized (b) {
                if (b.size() < 50) {
                    b.add(this);
                }
            }
        }
        
        public final void b() {
            final Message a = this.a;
            Objects.requireNonNull(a);
            a.sendToTarget();
            this.a();
        }
    }
}
