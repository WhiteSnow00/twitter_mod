import android.content.Context;
import com.twitter.ui.components.text.legacy.TypefacesTextView;
import com.twitter.rooms.model.helpers.RoomUserItem;
import android.widget.TextView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class m9n extends ste implements qsb<nan, fzv>
{
    public final d9n D0;
    public final View E0;
    
    public m9n(final d9n d0, final View e0) {
        this.D0 = d0;
        this.E0 = e0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final nan nan = (nan)o;
        czd.f((Object)nan, "$this$distinct");
        ((View)this.D0.R0).setVisibility(0);
        final String m = nan.m;
        if (m != null && m.length() != 0) {
            final d9n d0 = this.D0;
            final obi i0 = d0.I0;
            final TypefacesTextView r0 = d0.R0;
            final String j = nan.m;
            final Context context = this.E0.getContext();
            czd.e((Object)context, "rootView.context");
            g63.V(i0, (TextView)r0, j, context);
        }
        else {
            final tg5 c = nan.C;
            String s;
            if (c == null || (s = c.k) == null) {
                final RoomUserItem roomUserItem = (RoomUserItem)mq4.h0((Iterable)nan.e);
                if (roomUserItem != null) {
                    s = roomUserItem.getName();
                }
                else {
                    s = null;
                }
            }
            final TypefacesTextView r2 = this.D0.R0;
            String string;
            if (s == null) {
                string = "";
            }
            else {
                string = this.E0.getContext().getString(2131953572, new Object[] { s });
            }
            ((TextView)r2).setText((CharSequence)string);
        }
        return fzv.a;
    }
}
