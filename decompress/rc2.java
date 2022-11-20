import com.twitter.ui.tweet.inlineactions.InlineActionBar;
import com.twitter.ui.view.AsyncView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rc2 extends hub implements qsb<AsyncView<InlineActionBar>, jnd>
{
    public rc2(final Object o) {
        super(1, o, (Class)jnd$d.class, "create", "create(Lcom/twitter/ui/view/AsyncView;)Lcom/twitter/tweetview/core/ui/actionbar/InlineActionBarViewDelegate;", 0);
    }
    
    public final Object invoke(final Object o) {
        final AsyncView asyncView = (AsyncView)o;
        czd.f((Object)asyncView, "p0");
        return ((jnd$d)((m93)this).receiver).a(asyncView);
    }
}
