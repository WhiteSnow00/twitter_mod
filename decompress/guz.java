import java.util.concurrent.CountDownLatch;

// 
// Decompiled by Procyon v0.6.0
// 

public final class guz implements nkj, xij
{
    public final CountDownLatch F0;
    
    public guz() {
        this.F0 = new CountDownLatch(1);
    }
    
    public final void b(final Object o) {
        this.F0.countDown();
    }
    
    public final void c(final Exception ex) {
        this.F0.countDown();
    }
}
