import android.app.Dialog;
import com.google.android.material.bottomsheet.a;
import android.view.View$OnClickListener;
import com.twitter.ui.components.button.legacy.TwitterButton;
import android.view.ViewGroup;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bim
{
    public final Activity a;
    public final n4s b;
    public final n4s c;
    
    public bim(final Activity a) {
        czd.f((Object)a, "activity");
        this.a = a;
        this.b = (n4s)pps.n((nsb)new nsb<View>(this) {
            public final bim D0;
            
            public final Object invoke() {
                final View inflate = LayoutInflater.from((Context)this.D0.a).inflate(2131623998, (ViewGroup)null);
                final bim d0 = this.D0;
                final TwitterButton twitterButton = (TwitterButton)inflate.findViewById(2131428401);
                if (twitterButton != null) {
                    ((View)twitterButton).setOnClickListener((View$OnClickListener)new vtf(d0, 6));
                }
                return inflate;
            }
        });
        this.c = (n4s)pps.n((nsb)new nsb<c92>(this) {
            public final bim D0;
            
            public final Object invoke() {
                final c92 c92 = new c92((Context)this.D0.a);
                final Object value = this.D0.b.getValue();
                czd.e(value, "<get-rootView>(...)");
                ((a)c92).setContentView((View)value);
                final View viewById = ((ck0)c92).findViewById(2131428647);
                if (viewById != null) {
                    viewById.setBackgroundColor(0);
                }
                ((a)c92).l().H = true;
                return c92;
            }
        });
    }
    
    public final void a() {
        ((Dialog)this.c.getValue()).show();
        aim.a(new aim(), "tweet", "reply_voting_nux_sheet", null, null, "impression", 12);
    }
}
