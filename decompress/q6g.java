import android.content.IntentSender$SendIntentException;
import android.app.Activity;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class q6g implements ftm
{
    public final r6g a;
    
    public q6g(final r6g a) {
        this.a = a;
    }
    
    public final void a(final etm etm) {
        final r6g a = this.a;
        final h7g h7g = (h7g)etm;
        Objects.requireNonNull(a);
        if (h7g.F0.G0 != 6) {
            return;
        }
        final i5k$h i5k$h = (i5k$h)a.e;
        Objects.requireNonNull(i5k$h);
        try {
            if (i5k$h.b.G0.get() != null) {
                h7g.F0.s((Activity)i5k$h.b.G0.get(), 100);
            }
        }
        catch (final IntentSender$SendIntentException ex) {}
    }
}
