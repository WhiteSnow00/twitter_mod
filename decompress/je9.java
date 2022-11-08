import java.util.concurrent.ArrayBlockingQueue;
import java.util.Queue;

// 
// Decompiled by Procyon v0.6.0
// 

public final class je9
{
    public static final je9 b;
    public static boolean c;
    public final Queue<a> a;
    
    static {
        b = new je9();
        je9.c = true;
    }
    
    public je9() {
        this.a = new ArrayBlockingQueue(20);
    }
    
    public final void a(final a a) {
        if (!je9.c) {
            return;
        }
        if (this.a.size() + 1 > 20) {
            this.a.poll();
        }
        this.a.add(a);
    }
    
    @Override
    public final String toString() {
        return this.a.toString();
    }
    
    public enum a
    {
        C0, 
        D0, 
        E0, 
        F0, 
        G0, 
        H0, 
        I0, 
        J0, 
        K0, 
        L0, 
        M0, 
        N0, 
        O0, 
        P0, 
        Q0, 
        R0, 
        S0, 
        T0, 
        U0;
    }
}
