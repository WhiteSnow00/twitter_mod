import java.util.concurrent.CountDownLatch;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kay implements uay
{
    public final CountDownLatch C0 = new CountDownLatch(1);
    
    public final void a() {
        this.C0.countDown();
    }
    
    public final void b(final Object o) {
        this.C0.countDown();
    }
    
    public final void c(final Exception ex) {
        this.C0.countDown();
    }
}
