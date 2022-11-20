import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cxb
{
    public final ViewStub a;
    public final ViewGroup b;
    public View c;
    
    public cxb(final ViewStub a) {
        czd.f((Object)a, "tweetHeaderStub");
        this.a = a;
        this.b = (ViewGroup)((View)a).getParent();
    }
    
    public final void a(final float translationY) {
        if (((View)this.a).getParent() != null) {
            return;
        }
        if (this.c == null) {
            this.c = ((View)this.b).findViewById(this.a.getInflatedId());
        }
        final View c = this.c;
        if (c != null) {
            c.setTranslationY(translationY);
        }
    }
}
