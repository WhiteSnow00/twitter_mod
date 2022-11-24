import com.twitter.ui.widget.TextContentView;
import com.twitter.tweetview.core.TweetViewContentHostContainer;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nka implements q7x$a
{
    public final int F0;
    public final zv1 G0;
    
    public nka(final zv1 g0, final int f0) {
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final q7x a(final View view) {
        switch (this.F0) {
            default: {
                return (q7x)new gm6((TweetViewContentHostContainer)view, this.G0);
            }
            case 0: {
                final zv1 g0 = this.G0;
                final TextContentView textContentView = (TextContentView)view;
                e0e.f((Object)g0, "$behavioralEventHelper");
                e0e.f((Object)textContentView, "textContentView");
                return (q7x)new icd(textContentView, g0);
            }
        }
    }
}
