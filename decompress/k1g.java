import android.content.ClipData;
import android.widget.TextView;
import android.content.Context;
import android.content.ClipboardManager;
import com.twitter.util.user.UserIdentifier;
import android.view.View;
import android.view.View$OnLongClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class k1g implements View$OnLongClickListener
{
    public final int D0;
    public final Object E0;
    public final Object F0;
    
    public k1g(final Object e0, final Object f0, final int d0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
    }
    
    public final boolean onLongClick(final View view) {
        switch (this.D0) {
            default: {
                final UserIdentifier userIdentifier = (UserIdentifier)this.E0;
                final bo6 bo6 = (bo6)this.F0;
                czd.f((Object)userIdentifier, "$userIdentifier");
                czd.f((Object)bo6, "$tweet");
                final af4 af4 = new af4(userIdentifier);
                final String w2 = bo6.W2();
                czd.e((Object)w2, "tweet.scribeComponent");
                ((u0p)af4).T = new vba("tweet", "", w2, "", "long_press").toString();
                final int a = c5j.a;
                cbw.b((elm)af4);
                return false;
            }
            case 1: {
                final gjp gjp = (gjp)this.E0;
                final fk1 fk1 = (fk1)this.F0;
                czd.f((Object)gjp, "this$0");
                czd.f((Object)fk1, "$entry");
                return ((lj7)gjp.q).a(fk1, "voice");
            }
            case 0: {
                ((ClipboardManager)((Context)this.E0).getSystemService("clipboard")).setPrimaryClip(new ClipData(ClipData.newPlainText((CharSequence)null, ((TextView)this.F0).getText())));
                m1f.e().c(2131954731, 1);
                return true;
            }
        }
    }
}
