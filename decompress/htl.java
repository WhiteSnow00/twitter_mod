import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import android.os.ResultReceiver;

// 
// Decompiled by Procyon v0.6.0
// 

public final class htl extends ResultReceiver
{
    public WeakReference<TextView> D0;
    public String E0;
    
    public htl(final Handler handler) {
        super(handler);
    }
    
    public final void onReceiveResult(final int n, final Bundle bundle) {
        if (n == 3) {
            final WeakReference<TextView> d0 = this.D0;
            if (d0 != null) {
                final TextView textView = d0.get();
                if (textView != null) {
                    final String e0 = this.E0;
                    if (e0 != null) {
                        textView.setText((CharSequence)e0);
                    }
                }
            }
        }
    }
}
