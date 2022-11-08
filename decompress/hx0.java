import android.media.MediaCodec$CryptoInfo;
import android.media.MediaCodec$CryptoInfo$Pattern;
import java.util.Objects;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import android.os.HandlerThread;
import android.media.MediaCodec;
import java.util.ArrayDeque;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hx0
{
    public static final ArrayDeque<a> g;
    public static final Object h;
    public final MediaCodec a;
    public final HandlerThread b;
    public gx0 c;
    public final AtomicReference<RuntimeException> d;
    public final jf6 e;
    public boolean f;
    
    static {
        g = new ArrayDeque<a>();
        h = new Object();
    }
    
    public hx0(final MediaCodec a, final HandlerThread b) {
        final jf6 e = new jf6();
        this.a = a;
        this.b = b;
        this.e = e;
        this.d = new AtomicReference<RuntimeException>();
    }
    
    public static byte[] b(final byte[] array, final byte[] array2) {
        if (array == null) {
            return array2;
        }
        if (array2 != null && array2.length >= array.length) {
            System.arraycopy(array, 0, array2, 0, array.length);
            return array2;
        }
        return Arrays.copyOf(array, array.length);
    }
    
    public static int[] c(final int[] array, final int[] array2) {
        if (array == null) {
            return array2;
        }
        if (array2 != null && array2.length >= array.length) {
            System.arraycopy(array, 0, array2, 0, array.length);
            return array2;
        }
        return Arrays.copyOf(array, array.length);
    }
    
    public static a e() {
        final ArrayDeque<a> g = hx0.g;
        synchronized (g) {
            if (g.isEmpty()) {
                return new a();
            }
            return g.removeFirst();
        }
    }
    
    public final void a() throws InterruptedException {
        this.e.b();
        final gx0 c = this.c;
        Objects.requireNonNull(c);
        c.obtainMessage(2).sendToTarget();
        final jf6 e = this.e;
        synchronized (e) {
            while (!e.a) {
                e.wait();
            }
        }
    }
    
    public final void d() {
        if (this.f) {
            try {
                final gx0 c = this.c;
                Objects.requireNonNull(c);
                c.removeCallbacksAndMessages((Object)null);
                this.a();
            }
            catch (final InterruptedException ex) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(ex);
            }
        }
    }
    
    public final void f(final int a, final r77 r77, final long e) {
        final RuntimeException ex = this.d.getAndSet(null);
        if (ex == null) {
            final a e2 = e();
            e2.a = a;
            e2.b = 0;
            e2.c = 0;
            e2.e = e;
            e2.f = 0;
            final MediaCodec$CryptoInfo d = e2.d;
            d.numSubSamples = r77.f;
            d.numBytesOfClearData = c(r77.d, d.numBytesOfClearData);
            d.numBytesOfEncryptedData = c(r77.e, d.numBytesOfEncryptedData);
            final byte[] b = b(r77.b, d.key);
            Objects.requireNonNull(b);
            d.key = b;
            final byte[] b2 = b(r77.a, d.iv);
            Objects.requireNonNull(b2);
            d.iv = b2;
            d.mode = r77.c;
            if (imw.a >= 24) {
                d.setPattern(new MediaCodec$CryptoInfo$Pattern(r77.g, r77.h));
            }
            this.c.obtainMessage(1, (Object)e2).sendToTarget();
            return;
        }
        throw ex;
    }
    
    public static final class a
    {
        public int a;
        public int b;
        public int c;
        public final MediaCodec$CryptoInfo d;
        public long e;
        public int f;
        
        public a() {
            this.d = new MediaCodec$CryptoInfo();
        }
    }
}
