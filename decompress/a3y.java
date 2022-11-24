import java.util.concurrent.locks.Lock;
import java.util.Objects;
import android.os.Message;
import android.os.Looper;

// 
// Decompiled by Procyon v0.6.0
// 

public final class a3y extends d6y
{
    public final b3y a;
    
    public a3y(final b3y a, final Looper looper) {
        this.a = a;
        super(looper);
    }
    
    public final void handleMessage(Message message) {
        final int what = message.what;
        if (what != 1) {
            if (what != 2) {
                d10.F(31, "Unknown message id: ", what, "GACStateManager");
                return;
            }
            throw (RuntimeException)message.obj;
        }
        else {
            final z2y z2y = (z2y)message.obj;
            message = (Message)this.a;
            Objects.requireNonNull(z2y);
            ((b3y)message).a.lock();
            try {
                if (((b3y)message).k != z2y.a) {
                    message = (Message)((b3y)message).a;
                }
                else {
                    z2y.a();
                    message = (Message)((b3y)message).a;
                }
                ((Lock)message).unlock();
            }
            finally {
                ((b3y)message).a.unlock();
            }
        }
    }
}
