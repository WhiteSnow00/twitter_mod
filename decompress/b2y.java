import android.os.Message;
import android.os.Looper;

// 
// Decompiled by Procyon v0.6.0
// 

public final class b2y extends j5y
{
    public final d2y a;
    
    public b2y(final d2y a, final Looper looper) {
        this.a = a;
        super(looper);
    }
    
    public final void handleMessage(final Message message) {
        final int what = message.what;
        if (what != 1) {
            if (what != 2) {
                mw.A(31, "Unknown message id: ", what, "GoogleApiClientImpl");
                return;
            }
            d2y.s(this.a);
        }
        else {
            final d2y a = this.a;
            a.E0.lock();
            try {
                if (a.t()) {
                    a.v();
                }
            }
            finally {
                a.E0.unlock();
            }
        }
    }
}
