import com.twitter.ui.tweet.inlineactions.InlineActionBar;
import com.twitter.ui.view.AsyncView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fd2 extends jvb implements stb<AsyncView<InlineActionBar>, lod>
{
    public fd2(final Object o) {
        super(1, o, (Class)lod$d.class, "create", "create(Lcom/twitter/ui/view/AsyncView;)Lcom/twitter/tweetview/core/ui/actionbar/InlineActionBarViewDelegate;", 0);
    }
    
    public final Object invoke(final Object o) {
        final AsyncView asyncView = (AsyncView)o;
        e0e.f((Object)asyncView, "p0");
        return ((lod$d)((ea3)this).receiver).a(asyncView);
    }
}
