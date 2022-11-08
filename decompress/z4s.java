import android.os.Message;
import java.util.Objects;
import java.util.ArrayList;
import android.os.Handler;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class z4s implements occ
{
    public static final List<a> b;
    public final Handler a;
    
    static {
        z4s.b = new ArrayList(50);
    }
    
    public z4s(final Handler a) {
        this.a = a;
    }
    
    public static a l() {
        final ArrayList b = z4s.b;
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
    
    public final boolean a() {
        return this.a.hasMessages(0);
    }
    
    public final occ$a b(final int n) {
        final a l = l();
        l.a = this.a.obtainMessage(n);
        return (occ$a)l;
    }
    
    public final void c() {
        this.a.removeCallbacksAndMessages((Object)null);
    }
    
    public final occ$a d(final int n, final Object o) {
        final a l = l();
        l.a = this.a.obtainMessage(n, o);
        return (occ$a)l;
    }
    
    public final occ$a e(final int n, final int n2, final int n3) {
        final a l = l();
        l.a = this.a.obtainMessage(n, n2, n3);
        return (occ$a)l;
    }
    
    public final occ$a f(final int n, final Object o) {
        final a l = l();
        l.a = this.a.obtainMessage(20, 0, n, o);
        return (occ$a)l;
    }
    
    public final boolean g(final occ$a occ$a) {
        final a a = (a)occ$a;
        final Handler a2 = this.a;
        final Message a3 = a.a;
        Objects.requireNonNull(a3);
        final boolean sendMessageAtFrontOfQueue = a2.sendMessageAtFrontOfQueue(a3);
        a.a();
        return sendMessageAtFrontOfQueue;
    }
    
    public final void h() {
        this.a.removeMessages(2);
    }
    
    public final boolean i(final Runnable runnable) {
        return this.a.post(runnable);
    }
    
    public final boolean j(final long n) {
        return this.a.sendEmptyMessageAtTime(2, n);
    }
    
    public final boolean k(final int n) {
        return this.a.sendEmptyMessage(n);
    }
    
    public static final class a implements occ$a
    {
        public Message a;
        
        public final void a() {
            this.a = null;
            final ArrayList b = z4s.b;
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
