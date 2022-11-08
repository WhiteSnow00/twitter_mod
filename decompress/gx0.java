import java.util.ArrayDeque;
import android.media.MediaCodec$CryptoInfo;
import java.util.Objects;
import android.os.Message;
import android.os.Looper;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gx0 extends Handler
{
    public final /* synthetic */ hx0 a;
    
    public gx0(final hx0 a, final Looper looper) {
        this.a = a;
        super(looper);
    }
    
    public final void handleMessage(Message message) {
        final hx0 a = this.a;
        Objects.requireNonNull(a);
        final int what = message.what;
        final Message message2 = null;
        Label_0235: {
            if (what != 0) {
                if (what != 1) {
                    if (what != 2) {
                        a.d.compareAndSet(null, new IllegalStateException(String.valueOf(message.what)));
                        message = message2;
                        break Label_0235;
                    }
                    a.e.c();
                    message = message2;
                    break Label_0235;
                }
                else {
                    message = (Message)message.obj;
                    final int a2 = ((hx0.a)message).a;
                    final int b = ((hx0.a)message).b;
                    final MediaCodec$CryptoInfo d = ((hx0.a)message).d;
                    final long e = ((hx0.a)message).e;
                    final int f = ((hx0.a)message).f;
                    try {
                        synchronized (hx0.h) {
                            a.a.queueSecureInputBuffer(a2, b, d, e, f);
                        }
                    }
                    catch (final RuntimeException ex) {
                        a.d.compareAndSet(null, ex);
                        break Label_0235;
                    }
                }
            }
            message = (Message)message.obj;
            final int a3 = ((hx0.a)message).a;
            final int b2 = ((hx0.a)message).b;
            final int c = ((hx0.a)message).c;
            final long e2 = ((hx0.a)message).e;
            final int f2 = ((hx0.a)message).f;
            try {
                a.a.queueInputBuffer(a3, b2, c, e2, f2);
            }
            catch (final RuntimeException ex2) {
                a.d.compareAndSet(null, ex2);
            }
        }
        if (message != null) {
            final ArrayDeque<hx0.a> g = hx0.g;
            synchronized (g) {
                g.add((hx0.a)message);
            }
        }
    }
}
