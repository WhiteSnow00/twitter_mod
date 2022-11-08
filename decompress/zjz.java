import java.lang.ref.WeakReference;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class zjz extends vdz
{
    public static final WeakReference<byte[]> d;
    public WeakReference<byte[]> c;
    
    static {
        d = new WeakReference<byte[]>(null);
    }
    
    public zjz(final byte[] array) {
        super(array);
        this.c = zjz.d;
    }
    
    public abstract byte[] D1();
    
    public final byte[] U0() {
        synchronized (this) {
            byte[] d1;
            if ((d1 = this.c.get()) == null) {
                d1 = this.D1();
                this.c = new WeakReference<byte[]>(d1);
            }
            return d1;
        }
    }
}
